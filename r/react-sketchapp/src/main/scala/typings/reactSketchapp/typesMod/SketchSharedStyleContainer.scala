package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchSharedStyleContainer extends js.Object {
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): js.Any = js.native
  def setObjects(objects: js.Array[SketchStyle]): Unit = js.native
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
  @scala.inline
  implicit class SketchSharedStyleContainerOps[Self <: SketchSharedStyleContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSharedStyleWithName_firstInstance(value: (String, SketchStyle) => js.Any): Self = this.set("addSharedStyleWithName_firstInstance", js.Any.fromFunction2(value))
    @scala.inline
    def setSetObjects(value: js.Array[SketchStyle] => Unit): Self = this.set("setObjects", js.Any.fromFunction1(value))
  }
  
}

