package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPropertyFile extends js.Object {
  /**
    * A stable, unique identifer for the external property file in the form of a GUID.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A non-negative integer specifying the number of items contained in the external property file.
    */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The location of the external property file.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the external property file.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ExternalPropertyFile {
  @scala.inline
  def apply(
    guid: java.lang.String = null,
    itemCount: scala.Int | scala.Double = null,
    location: ArtifactLocation = null,
    properties: PropertyBag = null
  ): ExternalPropertyFile = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ExternalPropertyFile]
  }
}

