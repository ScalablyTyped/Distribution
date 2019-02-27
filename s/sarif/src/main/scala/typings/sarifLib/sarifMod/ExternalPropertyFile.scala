package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFile extends js.Object {
  /**
    * The location of the external property file.
    */
  var artifactLocation: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * A stable, unique identifer for the external property file in the form of a GUID.
    */
  var instanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A non-negative integer specifying the number of items contained in the external property file.
    */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external property file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

