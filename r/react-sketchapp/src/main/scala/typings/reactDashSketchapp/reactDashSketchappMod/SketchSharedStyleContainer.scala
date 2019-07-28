package typings.reactDashSketchapp.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchSharedStyleContainer extends js.Object {
  def addSharedStyleWithName_firstInstance(name: String, ins: js.Any): Unit
  def setObjects(objects: js.Array[_]): Unit
}

object SketchSharedStyleContainer {
  @scala.inline
  def apply(addSharedStyleWithName_firstInstance: (String, js.Any) => Unit, setObjects: js.Array[_] => Unit): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), setObjects = js.Any.fromFunction1(setObjects))
  
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
}

