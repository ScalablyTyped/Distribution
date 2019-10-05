package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironmentEnvironmentVariable extends js.Object {
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: String
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The environment variable's value.
    */
  var value: String
}

object ProjectEnvironmentEnvironmentVariable {
  @scala.inline
  def apply(name: String, value: String, `type`: String = null): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
}

