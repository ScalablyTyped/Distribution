package typings.pulumiAws.getActivityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the activity.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The name that identifies the activity.
    */
  val name: js.UndefOr[String] = js.native
}

object GetActivityArgs {
  @scala.inline
  def apply(): GetActivityArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActivityArgs]
  }
  @scala.inline
  implicit class GetActivityArgsOps[Self <: GetActivityArgs] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

