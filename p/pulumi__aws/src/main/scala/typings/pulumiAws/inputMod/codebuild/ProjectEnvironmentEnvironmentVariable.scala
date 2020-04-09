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
  def apply(name: Input[String], value: Input[String], `type`: Input[String] = null): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
}

