package typings.sarif.mod

import typings.sarif.mod.Suppression.kind
import typings.sarif.mod.Suppression.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppression_ extends js.Object {
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
  var kind: kind
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
  var state: js.UndefOr[state] = js.undefined
}

object Suppression_ {
  @scala.inline
  def apply(
    kind: kind,
    guid: String = null,
    justification: String = null,
    location: Location = null,
    properties: PropertyBag = null,
    state: state = null
  ): Suppression_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (justification != null) __obj.updateDynamic("justification")(justification.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression_]
  }
}

