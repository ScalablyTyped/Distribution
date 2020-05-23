package typings.snykDockerPlugin.lsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/ls-utils", "parseLsOutput")
@js.native
object parseLsOutput extends js.Object {
  /**
    * Parse the output of a ls command and return a DiscoveredDirectory
    * structure. Can handle plain and recursive output. Root path will
    * always be normalized to '/'. State scope is a directory i.e. the
    * parser can handle missing parent directories or an out-of-order
    * directory sequence.
    */
  def apply(output: String): DiscoveredDirectory = js.native
}

