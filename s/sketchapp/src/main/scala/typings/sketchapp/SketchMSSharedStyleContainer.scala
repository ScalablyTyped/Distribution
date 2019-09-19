package typings.sketchapp

import typings.sketchapp.sketchappStrings.sharedStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSharedStyleContainer extends js.Object {
  var _class: sharedStyleContainer
  var objects: js.Array[SketchMSSharedStyle]
}

object SketchMSSharedStyleContainer {
  @scala.inline
  def apply(_class: sharedStyleContainer, objects: js.Array[SketchMSSharedStyle]): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class, objects = objects)
  
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
}

