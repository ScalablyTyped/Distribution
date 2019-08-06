package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtifactIdentifier extends js.Object {
  var artifactIdentifier: String
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespaceType: js.UndefOr[String] = js.undefined
  var overrideArtifactName: js.UndefOr[Boolean] = js.undefined
  var packaging: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_ArtifactIdentifier {
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
  ): Anon_ArtifactIdentifier = {
    val __obj = js.Dynamic.literal(artifactIdentifier = artifactIdentifier)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType)
    if (!js.isUndefined(overrideArtifactName)) __obj.updateDynamic("overrideArtifactName")(overrideArtifactName)
    if (packaging != null) __obj.updateDynamic("packaging")(packaging)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_ArtifactIdentifier]
  }
}

