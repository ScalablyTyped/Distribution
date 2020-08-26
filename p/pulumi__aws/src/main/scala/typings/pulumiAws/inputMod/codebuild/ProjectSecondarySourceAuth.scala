package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSecondarySourceAuth extends js.Object {
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[Input[String]] = js.native
  /**
    * The authorization type to use. The only valid value is `OAUTH`
    */
  var `type`: Input[String] = js.native
}

object ProjectSecondarySourceAuth {
  @scala.inline
  def apply(`type`: Input[String]): ProjectSecondarySourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySourceAuth]
  }
  @scala.inline
  implicit class ProjectSecondarySourceAuthOps[Self <: ProjectSecondarySourceAuth] (val x: Self) extends AnyVal {
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Input[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

