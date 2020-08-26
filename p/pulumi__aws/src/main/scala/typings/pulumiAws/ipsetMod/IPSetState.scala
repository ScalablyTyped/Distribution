package typings.pulumiAws.ipsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetState extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of the GuardDuty IPSet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: js.UndefOr[Input[String]] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object IPSetState {
  @scala.inline
  def apply(): IPSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPSetState]
  }
  @scala.inline
  implicit class IPSetStateOps[Self <: IPSetState] (val x: Self) extends AnyVal {
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
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    @scala.inline
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLocation(value: Input[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
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

