package typings.pulumiAws.applicationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  /**
    * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  @scala.inline
  implicit class ApplicationStateOps[Self <: ApplicationState] (val x: Self) extends AnyVal {
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
    def setComputePlatform(value: Input[String]): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

