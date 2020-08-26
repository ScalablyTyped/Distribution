package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectEnvironmentEnvironmentVariable extends js.Object {
  /**
    * The environment variable's name or key.
    */
  var name: Input[String] = js.native
  /**
    * The type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
  /**
    * The environment variable's value.
    */
  var value: Input[String] = js.native
}

object ProjectEnvironmentEnvironmentVariable {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
  @scala.inline
  implicit class ProjectEnvironmentEnvironmentVariableOps[Self <: ProjectEnvironmentEnvironmentVariable] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

