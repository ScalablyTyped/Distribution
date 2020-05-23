package typings.snykDockerPlugin

import typings.node.Buffer
import typings.snykDockerPlugin.anon.Manifest
import typings.snykDockerPlugin.extractorTypesMod.ExtractAction
import typings.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/extractor", JSImport.Namespace)
@js.native
object extractorMod extends js.Object {
  def getContentAsBuffer(extractedLayers: ExtractedLayers, extractAction: ExtractAction): js.UndefOr[Buffer] = js.native
  def getContentAsString(extractedLayers: ExtractedLayers, extractAction: ExtractAction): js.UndefOr[String] = js.native
  /**
    * Given a path on the file system to a docker-archive, open it up to inspect the layers
    * and look for specific files. File content can be transformed with a custom callback function if needed.
    * @param fileSystemPath Path to an existing docker-archive.
    * @param extractActions This denotes a file pattern to look for and how to transform the file if it is found.
    * By default the file is returned raw if no processing is desired.
    */
  def getDockerArchiveLayersAndManifest(fileSystemPath: String, extractActions: js.Array[ExtractAction]): js.Promise[Manifest] = js.native
}

