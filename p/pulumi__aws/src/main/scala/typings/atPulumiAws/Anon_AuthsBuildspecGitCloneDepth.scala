package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthsBuildspecGitCloneDepth extends js.Object {
  var auths: js.UndefOr[Input[js.Array[Input[Anon_ResourceType]]]] = js.undefined
  var buildspec: js.UndefOr[Input[String]] = js.undefined
  var gitCloneDepth: js.UndefOr[Input[Double]] = js.undefined
  var insecureSsl: js.UndefOr[Input[Boolean]] = js.undefined
  var location: js.UndefOr[Input[String]] = js.undefined
  var reportBuildStatus: js.UndefOr[Input[Boolean]] = js.undefined
  var sourceIdentifier: Input[String]
  var `type`: Input[String]
}

object Anon_AuthsBuildspecGitCloneDepth {
  @scala.inline
  def apply(
    sourceIdentifier: Input[String],
    `type`: Input[String],
    auths: Input[js.Array[Input[Anon_ResourceType]]] = null,
    buildspec: Input[String] = null,
    gitCloneDepth: Input[Double] = null,
    insecureSsl: Input[Boolean] = null,
    location: Input[String] = null,
    reportBuildStatus: Input[Boolean] = null
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

