package typings.pulumiAws.getPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineResult extends js.Object {
  val defaultBaseline: js.UndefOr[Boolean] = js.native
  /**
    * The description of the baseline.
    */
  val description: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the baseline.
    */
  val name: String = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val operatingSystem: js.UndefOr[String] = js.native
  val owner: String = js.native
}

object GetPatchBaselineResult {
  @scala.inline
  def apply(description: String, id: String, name: String, owner: String): GetPatchBaselineResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineResult]
  }
  @scala.inline
  implicit class GetPatchBaselineResultOps[Self <: GetPatchBaselineResult] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
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

