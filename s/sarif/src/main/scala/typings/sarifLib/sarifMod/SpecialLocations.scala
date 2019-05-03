package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecialLocations extends js.Object {
  /**
    * Provides a suggestion to SARIF consumers to display file paths relative to the specified location.
    */
  var displayBase: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the special locations.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object SpecialLocations {
  @scala.inline
  def apply(displayBase: ArtifactLocation = null, properties: PropertyBag = null): SpecialLocations = {
    val __obj = js.Dynamic.literal()
    if (displayBase != null) __obj.updateDynamic("displayBase")(displayBase)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[SpecialLocations]
  }
}

