package typings.pulumiAws.tagMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagState extends js.Object {
  /**
    * The tag name.
    */
  val key: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the EC2 resource to manage the tag for.
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  /**
    * The value of the tag.
    */
  val value: js.UndefOr[Input[String]] = js.native
}

object TagState {
  @scala.inline
  def apply(): TagState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagState]
  }
  @scala.inline
  implicit class TagStateOps[Self <: TagState] (val x: Self) extends AnyVal {
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
    def setKey(value: Input[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

