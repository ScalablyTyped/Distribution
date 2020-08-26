package typings.pulumiAws.devicefarmProjectMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectState extends js.Object {
  /**
    * The Amazon Resource Name of this project
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the project
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ProjectState {
  @scala.inline
  def apply(): ProjectState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectState]
  }
  @scala.inline
  implicit class ProjectStateOps[Self <: ProjectState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

