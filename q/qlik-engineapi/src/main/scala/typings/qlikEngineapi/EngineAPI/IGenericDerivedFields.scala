package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGenericDerivedFields
  extends StObject
     with IGeneratedAPI {
  
  /**
    * @returns qField
    */
  def getDerivedField(qId: String): js.Promise[Any]
  
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[Any]
  
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[Any]
  
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[Any]
  
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[Any]
  
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[Any]
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the derived field.
    *
    * @returns - A Promise IGenericDerivedFieldProperties
    */
  def getProperties(): js.Promise[IGenericDerivedFieldProperties]
}
object IGenericDerivedFields {
  
  inline def apply(
    getDerivedField: String => js.Promise[Any],
    getDerivedFieldData: () => js.Promise[Any],
    getDerivedFields: () => js.Promise[Any],
    getDerivedGroups: () => js.Promise[Any],
    getInfo: () => js.Promise[Any],
    getListData: () => js.Promise[Any],
    getProperties: () => js.Promise[IGenericDerivedFieldProperties]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal(getDerivedField = js.Any.fromFunction1(getDerivedField), getDerivedFieldData = js.Any.fromFunction0(getDerivedFieldData), getDerivedFields = js.Any.fromFunction0(getDerivedFields), getDerivedGroups = js.Any.fromFunction0(getDerivedGroups), getInfo = js.Any.fromFunction0(getInfo), getListData = js.Any.fromFunction0(getListData), getProperties = js.Any.fromFunction0(getProperties))
    __obj.asInstanceOf[IGenericDerivedFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericDerivedFields] (val x: Self) extends AnyVal {
    
    inline def setGetDerivedField(value: String => js.Promise[Any]): Self = StObject.set(x, "getDerivedField", js.Any.fromFunction1(value))
    
    inline def setGetDerivedFieldData(value: () => js.Promise[Any]): Self = StObject.set(x, "getDerivedFieldData", js.Any.fromFunction0(value))
    
    inline def setGetDerivedFields(value: () => js.Promise[Any]): Self = StObject.set(x, "getDerivedFields", js.Any.fromFunction0(value))
    
    inline def setGetDerivedGroups(value: () => js.Promise[Any]): Self = StObject.set(x, "getDerivedGroups", js.Any.fromFunction0(value))
    
    inline def setGetInfo(value: () => js.Promise[Any]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setGetListData(value: () => js.Promise[Any]): Self = StObject.set(x, "getListData", js.Any.fromFunction0(value))
    
    inline def setGetProperties(value: () => js.Promise[IGenericDerivedFieldProperties]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
  }
}
