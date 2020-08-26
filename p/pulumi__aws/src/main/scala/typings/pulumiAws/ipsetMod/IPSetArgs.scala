package typings.pulumiAws.ipsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetArgs extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: Input[Boolean] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Input[String] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: Input[String] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: Input[String] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object IPSetArgs {
  @scala.inline
  def apply(
    activate: Input[Boolean],
    detectorId: Input[String],
    format: Input[String],
    location: Input[String]
  ): IPSetArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetArgs]
  }
  @scala.inline
  implicit class IPSetArgsOps[Self <: IPSetArgs] (val x: Self) extends AnyVal {
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
    def setActivate(value: Input[Boolean]): Self = this.set("activate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Input[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

