package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSArtboards extends js.Object {
  var artboards: SketchMSArtboard
  var name: java.lang.String
}

object SketchMSArtboards {
  @scala.inline
  def apply(artboards: SketchMSArtboard, name: java.lang.String): SketchMSArtboards = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artboards")(artboards)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SketchMSArtboards]
  }
}

