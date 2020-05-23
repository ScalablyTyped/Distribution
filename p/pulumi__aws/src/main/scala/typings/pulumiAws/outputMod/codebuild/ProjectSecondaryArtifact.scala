package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSecondaryArtifact extends js.Object {
  /**
    * The artifact identifier. Must be the same specified inside AWS CodeBuild buildspec.
    */
  var artifactIdentifier: String = js.native
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Information about the build output artifact location. If `type` is set to `CODEPIPELINE` or `NO_ARTIFACTS` then this value will be ignored. If `type` is set to `S3`, this is the name of the output bucket. If `path` is not also specified, then `location` can also specify the path of the output artifact in the output bucket.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values for this parameter are: `BUILD_ID` or `NONE`.
    */
  var namespaceType: js.UndefOr[String] = js.native
  /**
    * If set to true, a name specified in the build spec file overrides the artifact name.
    */
  var overrideArtifactName: js.UndefOr[Boolean] = js.native
  /**
    * The type of build output artifact to create. If `type` is set to `S3`, valid values for this parameter are: `NONE` or `ZIP`
    */
  var packaging: js.UndefOr[String] = js.native
  /**
    * If `type` is set to `S3`, this is the path to the output artifact
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The build output artifact's type. Valid values for this parameter are: `CODEPIPELINE`, `NO_ARTIFACTS` or `S3`.
    */
  var `type`: String = js.native
}

object ProjectSecondaryArtifact {
  @scala.inline
  def apply(
    artifactIdentifier: String,
    `type`: String,
    encryptionDisabled: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    name: String = null,
    namespaceType: String = null,
    overrideArtifactName: js.UndefOr[Boolean] = js.undefined,
    packaging: String = null,
    path: String = null
  ): ProjectSecondaryArtifact = {
    val __obj = js.Dynamic.literal(artifactIdentifier = artifactIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideArtifactName)) __obj.updateDynamic("overrideArtifactName")(overrideArtifactName.get.asInstanceOf[js.Any])
    if (packaging != null) __obj.updateDynamic("packaging")(packaging.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondaryArtifact]
  }
}

