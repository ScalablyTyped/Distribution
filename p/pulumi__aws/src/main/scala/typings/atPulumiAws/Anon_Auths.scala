package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auths extends js.Object {
  var auths: js.UndefOr[js.Array[Anon_Resource]] = js.undefined
  var buildspec: js.UndefOr[String] = js.undefined
  var gitCloneDepth: js.UndefOr[Double] = js.undefined
  var insecureSsl: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var reportBuildStatus: js.UndefOr[Boolean] = js.undefined
  var sourceIdentifier: String
  var `type`: String
}

object Anon_Auths {
  @scala.inline
  def apply(
    sourceIdentifier: String,
    `type`: String,
    auths: js.Array[Anon_Resource] = null,
    buildspec: String = null,
    gitCloneDepth: Int | Double = null,
    insecureSsl: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    reportBuildStatus: js.UndefOr[Boolean] = js.undefined
  ): Anon_Auths = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier)
    __obj.updateDynamic("type")(`type`)
    if (auths != null) __obj.updateDynamic("auths")(auths)
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec)
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSsl)) __obj.updateDynamic("insecureSsl")(insecureSsl)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(reportBuildStatus)) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus)
    __obj.asInstanceOf[Anon_Auths]
  }
}

