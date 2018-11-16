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
  def getDerivedField(qId: java.lang.String): stdLib.Promise[_]
  /**
           * @returns qData
           */
  def getDerivedFieldData(): stdLib.Promise[_]
  /**
           * @returns qFields
           */
  def getDerivedFields(): stdLib.Promise[_]
  /**
           * @returns qGroups
           */
  def getDerivedGroups(): stdLib.Promise[_]
  /**
           * @returns qInfo
           */
  def getInfo(): stdLib.Promise[_]
  /**
           * @returns qListData
           */
  def getListData(): stdLib.Promise[_]
  /**
           * Shows the properties of an object.
           * Returns the identifier and the definition of the derived field.
           *
           * @returns - A Promise IGenericDerivedFieldProperties
           */
  def getProperties(): stdLib.Promise[IGenericDerivedFieldProperties]
}

