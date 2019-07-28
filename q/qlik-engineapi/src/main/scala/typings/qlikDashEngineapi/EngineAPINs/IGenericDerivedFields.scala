package typings.qlikDashEngineapi.EngineAPINs

import typings.qlikDashEngineapi.enigmaJSNs.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenericDerivedFields extends IGeneratedAPI {
  /**
    * @returns qField
    */
  def getDerivedField(qId: String): js.Promise[_]
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[_]
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[_]
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[_]
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[_]
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[_]
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
}

