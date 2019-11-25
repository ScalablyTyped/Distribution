package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolContainers extends js.Object {
  var _class: symbolContainer
  var objects: js.Array[_]
}

object SketchMSSymbolContainers {
  @scala.inline
  def apply(_class: symbolContainer, objects: js.Array[_]): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
}

