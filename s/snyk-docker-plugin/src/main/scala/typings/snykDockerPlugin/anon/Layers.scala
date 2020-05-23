package typings.snykDockerPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layers extends js.Object {
  var Layers: js.Array[String]
  var Type: String
}

object Layers {
  @scala.inline
  def apply(Layers: js.Array[String], Type: String): Layers = {
    val __obj = js.Dynamic.literal(Layers = Layers.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layers]
  }
}

