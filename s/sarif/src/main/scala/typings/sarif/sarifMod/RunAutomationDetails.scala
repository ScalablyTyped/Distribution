package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunAutomationDetails extends js.Object {
  /**
    * A stable, unique identifier for the equivalence class of runs to which this object's containing run object
    * belongs in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.undefined
  /**
    * A description of the identity and role played within the engineering system by this object's containing run
    * object.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * A stable, unique identifer for this object's containing run object in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * A hierarchical string that uniquely identifies this object's containing run object.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the run automation details.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object RunAutomationDetails {
  @scala.inline
  def apply(
    correlationGuid: String = null,
    description: Message = null,
    guid: String = null,
    id: String = null,
    properties: PropertyBag = null
  ): RunAutomationDetails = {
    val __obj = js.Dynamic.literal()
    if (correlationGuid != null) __obj.updateDynamic("correlationGuid")(correlationGuid.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAutomationDetails]
  }
}

