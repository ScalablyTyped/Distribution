package typings.snykDockerPlugin.extractorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractedLayersAndManifest extends js.Object {
  var layers: js.Array[ExtractedLayers]
  var manifest: DockerArchiveManifest
}

object ExtractedLayersAndManifest {
  @scala.inline
  def apply(layers: js.Array[ExtractedLayers], manifest: DockerArchiveManifest): ExtractedLayersAndManifest = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractedLayersAndManifest]
  }
}

