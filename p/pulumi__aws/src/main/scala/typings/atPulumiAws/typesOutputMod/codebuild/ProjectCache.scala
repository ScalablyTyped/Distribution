package typings.atPulumiAws.typesOutputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectCache extends js.Object {
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, and `LOCAL_CUSTOM_CACHE`
    */
  var modes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ProjectCache {
  @scala.inline
  def apply(location: String = null, modes: js.Array[String] = null, `type`: String = null): ProjectCache = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (modes != null) __obj.updateDynamic("modes")(modes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectCache]
  }
}

