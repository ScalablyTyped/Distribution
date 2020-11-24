package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGenericDerivedFields extends IGeneratedAPI {
  
  /**
    * @returns qField
    */
  def getDerivedField(qId: String): js.Promise[_] = js.native
  
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[_] = js.native
  
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[_] = js.native
  
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[_] = js.native
  
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[_] = js.native
  
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[_] = js.native
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the derived field.
    *
    * @returns - A Promise IGenericDerivedFieldProperties
    */
  def getProperties(): js.Promise[IGenericDerivedFieldProperties] = js.native
}
object IGenericDerivedFields {
  
  @scala.inline
  def apply(
    getDerivedField: String => js.Promise[_],
    getDerivedFieldData: () => js.Promise[_],
    getDerivedFields: () => js.Promise[_],
    getDerivedGroups: () => js.Promise[_],
    getInfo: () => js.Promise[_],
    getListData: () => js.Promise[_],
    getProperties: () => js.Promise[IGenericDerivedFieldProperties]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal(getDerivedField = js.Any.fromFunction1(getDerivedField), getDerivedFieldData = js.Any.fromFunction0(getDerivedFieldData), getDerivedFields = js.Any.fromFunction0(getDerivedFields), getDerivedGroups = js.Any.fromFunction0(getDerivedGroups), getInfo = js.Any.fromFunction0(getInfo), getListData = js.Any.fromFunction0(getListData), getProperties = js.Any.fromFunction0(getProperties))
    __obj.asInstanceOf[IGenericDerivedFields]
  }
  
  @scala.inline
  implicit class IGenericDerivedFieldsOps[Self <: IGenericDerivedFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDerivedField(value: String => js.Promise[_]): Self = this.set("getDerivedField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDerivedFieldData(value: () => js.Promise[_]): Self = this.set("getDerivedFieldData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDerivedFields(value: () => js.Promise[_]): Self = this.set("getDerivedFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDerivedGroups(value: () => js.Promise[_]): Self = this.set("getDerivedGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[_]): Self = this.set("getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListData(value: () => js.Promise[_]): Self = this.set("getListData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericDerivedFieldProperties]): Self = this.set("getProperties", js.Any.fromFunction0(value))
  }
}
