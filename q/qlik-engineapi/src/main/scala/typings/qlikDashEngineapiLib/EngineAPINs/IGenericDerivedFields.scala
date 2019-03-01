package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenericDerivedFields
  extends qlikDashEngineapiLib.enigmaJSNs.IGeneratedAPI {
  /**
    * @returns qField
    */
  def getDerivedField(qId: java.lang.String): js.Promise[_]
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
    getDerivedField: js.Function1[java.lang.String, js.Promise[_]],
    getDerivedFieldData: js.Function0[js.Promise[_]],
    getDerivedFields: js.Function0[js.Promise[_]],
    getDerivedGroups: js.Function0[js.Promise[_]],
    getInfo: js.Function0[js.Promise[_]],
    getListData: js.Function0[js.Promise[_]],
    getProperties: js.Function0[js.Promise[IGenericDerivedFieldProperties]]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDerivedField")(getDerivedField)
    __obj.updateDynamic("getDerivedFieldData")(getDerivedFieldData)
    __obj.updateDynamic("getDerivedFields")(getDerivedFields)
    __obj.updateDynamic("getDerivedGroups")(getDerivedGroups)
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("getListData")(getListData)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.asInstanceOf[IGenericDerivedFields]
  }
}

