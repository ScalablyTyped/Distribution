package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunAutomationDetails extends js.Object {
  /**
    * A stable, unique identifier for the equivalence class of runs to which this object's containing run object
    * belongs in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.native
  /**
    * A description of the identity and role played within the engineering system by this object's containing run
    * object.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * A stable, unique identifer for this object's containing run object in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * A hierarchical string that uniquely identifies this object's containing run object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the run automation details.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object RunAutomationDetails {
  @scala.inline
  def apply(): RunAutomationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAutomationDetails]
  }
  @scala.inline
  implicit class RunAutomationDetailsOps[Self <: RunAutomationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCorrelationGuid(value: String): Self = this.set("correlationGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationGuid: Self = this.set("correlationGuid", js.undefined)
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

