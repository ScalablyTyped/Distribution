package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends js.Object {
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var created_at_min: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created before the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_max: js.UndefOr[String] = js.native
  /**
    * Retrieve only objects that were created after the given date and time (format: 2014-04-25T16:15:47-04:00).
    */
  var updated_at_min: js.UndefOr[String] = js.native
}

object DateOptions {
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
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
    def setCreated_at_max(value: String): Self = this.set("created_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at_max: Self = this.set("created_at_max", js.undefined)
    @scala.inline
    def setCreated_at_min(value: String): Self = this.set("created_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at_min: Self = this.set("created_at_min", js.undefined)
    @scala.inline
    def setUpdated_at_max(value: String): Self = this.set("updated_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at_max: Self = this.set("updated_at_max", js.undefined)
    @scala.inline
    def setUpdated_at_min(value: String): Self = this.set("updated_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at_min: Self = this.set("updated_at_min", js.undefined)
  }
  
}

