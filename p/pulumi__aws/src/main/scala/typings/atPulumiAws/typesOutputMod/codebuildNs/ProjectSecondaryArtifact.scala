package typings.atPulumiAws.typesOutputMod.codebuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSecondaryArtifact extends js.Object {
  /**
    * The artifact identifier. Must be the same specified inside AWS CodeBuild buildspec.
    */
  var artifactIdentifier: String
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values for this parameter are: `BUILD_ID` or `NONE`.
    */
  var namespaceType: js.UndefOr[String] = js.undefined
  /**
    * If set to true, a name specified in the build spec file overrides the artifact name.
    */
  var overrideArtifactName: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of build output artifact to create. If `type` is set to `S3`, valid values for this parameter are: `NONE` or `ZIP`
    */
  var packaging: js.UndefOr[String] = js.undefined
  /**
    * If `type` is set to `S3`, this is the path to the output artifact
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String
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
    val __obj = js.Dynamic.literal(artifactIdentifier = artifactIdentifier)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType)
    if (!js.isUndefined(overrideArtifactName)) __obj.updateDynamic("overrideArtifactName")(overrideArtifactName)
    if (packaging != null) __obj.updateDynamic("packaging")(packaging)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ProjectSecondaryArtifact]
  }
}

