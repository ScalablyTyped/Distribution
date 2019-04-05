package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppression extends js.Object {
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: sarifLib.sarifMod.SuppressionNs.kind
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Suppression {
  @scala.inline
  def apply(
    kind: sarifLib.sarifMod.SuppressionNs.kind,
    location: Location = null,
    properties: PropertyBag = null
  ): Suppression = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Suppression]
  }
}

