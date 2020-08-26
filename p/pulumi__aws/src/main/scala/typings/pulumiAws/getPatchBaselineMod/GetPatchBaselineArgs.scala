package typings.pulumiAws.getPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineArgs extends js.Object {
  /**
    * Filters the results against the baselines defaultBaseline field.
    */
  val defaultBaseline: js.UndefOr[Boolean] = js.native
  /**
    * Filter results by the baseline name prefix.
    */
  val namePrefix: js.UndefOr[String] = js.native
  /**
    * The specified OS for the baseline.
    */
  val operatingSystem: js.UndefOr[String] = js.native
  /**
    * The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
    */
  val owner: String = js.native
}

object GetPatchBaselineArgs {
  @scala.inline
  def apply(owner: String): GetPatchBaselineArgs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineArgs]
  }
  @scala.inline
  implicit class GetPatchBaselineArgsOps[Self <: GetPatchBaselineArgs] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultBaseline(value: Boolean): Self = this.set("defaultBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultBaseline: Self = this.set("defaultBaseline", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
  }
  
}

