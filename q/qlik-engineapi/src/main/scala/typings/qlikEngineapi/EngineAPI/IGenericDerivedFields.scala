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
  def getDerivedField(qId: String): js.Promise[js.Any]
  
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[js.Any]
  
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[js.Any]
  
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[js.Any]
  
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[js.Any]
  
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[js.Any]
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the derived field.
    *
    * @returns - A Promise IGenericDerivedFieldProperties
    */
  def getProperties(): js.Promise[IGenericDerivedFieldProperties]
}
object IGenericDerivedFields {
  
  @scala.inline
  def apply(
    getDerivedField: String => js.Promise[js.Any],
    getDerivedFieldData: () => js.Promise[js.Any],
    getDerivedFields: () => js.Promise[js.Any],
    getDerivedGroups: () => js.Promise[js.Any],
    getInfo: () => js.Promise[js.Any],
    getListData: () => js.Promise[js.Any],
    getProperties: () => js.Promise[IGenericDerivedFieldProperties]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal(getDerivedField = js.Any.fromFunction1(getDerivedField), getDerivedFieldData = js.Any.fromFunction0(getDerivedFieldData), getDerivedFields = js.Any.fromFunction0(getDerivedFields), getDerivedGroups = js.Any.fromFunction0(getDerivedGroups), getInfo = js.Any.fromFunction0(getInfo), getListData = js.Any.fromFunction0(getListData), getProperties = js.Any.fromFunction0(getProperties))
    __obj.asInstanceOf[IGenericDerivedFields]
  }
  
  @scala.inline
  implicit class IGenericDerivedFieldsMutableBuilder[Self <: IGenericDerivedFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDerivedField(value: String => js.Promise[js.Any]): Self = StObject.set(x, "getDerivedField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDerivedFieldData(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getDerivedFieldData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDerivedFields(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getDerivedFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDerivedGroups(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getDerivedGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListData(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getListData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericDerivedFieldProperties]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
  }
}
