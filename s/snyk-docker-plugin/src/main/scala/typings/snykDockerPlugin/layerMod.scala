package typings.snykDockerPlugin

import typings.node.streamMod.Readable
import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayersAndManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/extractor/layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  def extractDockerArchive(dockerArchiveFilesystemPath: String, extractActions: js.Array[ExtractAction]): js.Promise[ExtractedLayersAndManifest] = js.native
  def extractImageLayer(layerTarStream: Readable, extractActions: js.Array[ExtractAction]): js.Promise[ExtractedLayers] = js.native
}

