package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSecondarySourceAuth extends js.Object {
  /**
    * The resource value that applies to the specified authorization type.
    */
  var resource: js.UndefOr[String] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String
}

object ProjectSecondarySourceAuth {
  @scala.inline
  def apply(`type`: String, resource: String = null): ProjectSecondarySourceAuth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ProjectSecondarySourceAuth]
  }
}

