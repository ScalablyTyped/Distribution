package typings.sarif.sarifMod

import typings.sarif.sarifMod.SuppressionNs.kind
import typings.sarif.sarifMod.SuppressionNs.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppression extends js.Object {
  /**
    * A stable, unique identifer for the suprression in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * A string representing the justification for the suppression.
    */
  var justification: js.UndefOr[String] = js.undefined
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: typings.sarif.sarifMod.SuppressionNs.kind
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string that indicates the state of the suppression.
    */
  var state: js.UndefOr[typings.sarif.sarifMod.SuppressionNs.state] = js.undefined
}

object Suppression {
  @scala.inline
  def apply(
    kind: kind,
    guid: String = null,
    justification: String = null,
    location: Location = null,
    properties: PropertyBag = null,
    state: state = null
  ): Suppression = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (justification != null) __obj.updateDynamic("justification")(justification)
    if (location != null) __obj.updateDynamic("location")(location)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Suppression]
  }
}

