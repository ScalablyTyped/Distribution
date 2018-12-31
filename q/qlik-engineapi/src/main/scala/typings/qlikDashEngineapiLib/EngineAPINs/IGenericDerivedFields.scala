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

