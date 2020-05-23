package typings.snykDockerPlugin.analyzerTypesMod

import typings.snykDockerPlugin.anon.Layers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerInspectOutput extends js.Object {
  var Id: String
  var RootFS: Layers
}

object DockerInspectOutput {
  @scala.inline
  def apply(Id: String, RootFS: Layers): DockerInspectOutput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], RootFS = RootFS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerInspectOutput]
  }
}

