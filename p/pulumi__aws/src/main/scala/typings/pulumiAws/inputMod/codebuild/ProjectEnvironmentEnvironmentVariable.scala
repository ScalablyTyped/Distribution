package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectEnvironmentEnvironmentVariable extends js.Object {
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: Input[String] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
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

