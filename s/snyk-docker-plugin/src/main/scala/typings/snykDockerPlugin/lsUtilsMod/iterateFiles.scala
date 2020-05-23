package typings.snykDockerPlugin.lsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/ls-utils", "iterateFiles")
@js.native
object iterateFiles extends js.Object {
  /**
    * Iterate over all files of a given DiscoveredDirectory structure.
    */
  def apply(root: DiscoveredDirectory, iterator: js.Function1[/* f */ DiscoveredFile, Unit]): js.Promise[Unit] = js.native
}

