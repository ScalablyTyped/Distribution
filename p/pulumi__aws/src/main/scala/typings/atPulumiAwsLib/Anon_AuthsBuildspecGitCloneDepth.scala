package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthsBuildspecGitCloneDepth extends js.Object {
  var auths: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ResourceType]]]
  ] = js.undefined
  var buildspec: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var gitCloneDepth: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var insecureSsl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var location: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var reportBuildStatus: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var sourceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AuthsBuildspecGitCloneDepth {
  @scala.inline
  def apply(
    sourceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    auths: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ResourceType]]] = null,
    buildspec: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    gitCloneDepth: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    insecureSsl: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    location: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    reportBuildStatus: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_AuthsBuildspecGitCloneDepth = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auths != null) __obj.updateDynamic("auths")(auths.asInstanceOf[js.Any])
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec.asInstanceOf[js.Any])
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (insecureSsl != null) __obj.updateDynamic("insecureSsl")(insecureSsl.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reportBuildStatus != null) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthsBuildspecGitCloneDepth]
  }
}

