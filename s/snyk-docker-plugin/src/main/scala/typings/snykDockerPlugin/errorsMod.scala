package typings.snykDockerPlugin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  def tryGetAnalysisError(error: js.Any, targetImage: String): Error = js.native
}

