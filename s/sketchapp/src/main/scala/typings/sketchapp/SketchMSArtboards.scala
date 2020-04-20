package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSArtboards extends js.Object {
  var artboards: SketchMSArtboard
  var name: String
}

object SketchMSArtboards {
  @scala.inline
  def apply(artboards: SketchMSArtboard, name: String): SketchMSArtboards = {
    val __obj = js.Dynamic.literal(artboards = artboards.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboards]
  }
}

