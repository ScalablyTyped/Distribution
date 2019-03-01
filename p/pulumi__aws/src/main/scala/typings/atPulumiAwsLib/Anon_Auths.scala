package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auths extends js.Object {
  var auths: js.UndefOr[js.Array[Anon_Resource]] = js.undefined
  var buildspec: js.UndefOr[java.lang.String] = js.undefined
  var gitCloneDepth: js.UndefOr[scala.Double] = js.undefined
  var insecureSsl: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var reportBuildStatus: js.UndefOr[scala.Boolean] = js.undefined
  var sourceIdentifier: java.lang.String
  var `type`: java.lang.String
}

object Anon_Auths {
  @scala.inline
  def apply(
    sourceIdentifier: java.lang.String,
    `type`: java.lang.String,
    auths: js.Array[Anon_Resource] = null,
    buildspec: java.lang.String = null,
    gitCloneDepth: scala.Int | scala.Double = null,
    insecureSsl: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    reportBuildStatus: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Auths = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("sourceIdentifier")(sourceIdentifier)
    if (auths != null) __obj.updateDynamic("auths")(auths)
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec)
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureSsl)) __obj.updateDynamic("insecureSsl")(insecureSsl)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(reportBuildStatus)) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus)
    __obj.asInstanceOf[Anon_Auths]
  }
}

