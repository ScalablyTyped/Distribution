package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectLayout...
  */
trait IGenericObjectLayout extends IGenericBaseLayout {
  /**
    * This parameter is optional.
    * Gives information on the error.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.undefined
  /**
    * Should be set to create an object that is linked to another object.
    * Enter the identifier of the object you want to link to.
    * If you do not want to link your object, set this parameter to an empty string.
    */
  var qExtendsId: java.lang.String
  /**
    * Is set to true if the generic object contains some properties that are not persistent
    * (a soft patch was applied).
    */
  var qHasSoftPatches: scala.Boolean
  /**
    * Information about the selections.
    */
  var qSelectionInfo: INxSelectionInfo
}

