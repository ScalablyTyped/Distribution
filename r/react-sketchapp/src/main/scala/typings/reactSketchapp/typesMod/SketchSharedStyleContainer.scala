package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchSharedStyleContainer extends js.Object {
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): js.Any
  def setObjects(objects: js.Array[SketchStyle]): Unit
}

object SketchSharedStyleContainer {
  @scala.inline
  def apply(
    addSharedStyleWithName_firstInstance: (String, SketchStyle) => js.Any,
    setObjects: js.Array[SketchStyle] => Unit
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), setObjects = js.Any.fromFunction1(setObjects))
  
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
}

