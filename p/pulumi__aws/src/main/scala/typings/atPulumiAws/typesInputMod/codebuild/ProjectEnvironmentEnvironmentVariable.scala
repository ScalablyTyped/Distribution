package typings.atPulumiAws.typesInputMod.codebuild

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironmentEnvironmentVariable extends js.Object {
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: Input[String]
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  /**
    * The environment variable's value.
    */
  var value: Input[String]
}

object ProjectEnvironmentEnvironmentVariable {
  @scala.inline
  def apply(name: Input[String], value: Input[String], `type`: Input[String] = null): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
}

