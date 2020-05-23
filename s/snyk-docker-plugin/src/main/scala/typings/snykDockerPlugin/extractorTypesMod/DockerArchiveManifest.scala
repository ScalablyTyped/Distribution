package typings.snykDockerPlugin.extractorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerArchiveManifest extends js.Object {
  var Config: String
  var Layers: js.Array[String]
  var RepoTags: js.Array[String]
}

object DockerArchiveManifest {
  @scala.inline
  def apply(Config: String, Layers: js.Array[String], RepoTags: js.Array[String]): DockerArchiveManifest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Layers = Layers.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerArchiveManifest]
  }
}

