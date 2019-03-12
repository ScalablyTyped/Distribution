package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchSharedStyleContainer extends js.Object {
  def addSharedStyleWithName_firstInstance(name: java.lang.String, ins: js.Any): scala.Unit
  def setObjects(objects: js.Array[_]): scala.Unit
}

object SketchSharedStyleContainer {
  @scala.inline
  def apply(
    addSharedStyleWithName_firstInstance: (java.lang.String, js.Any) => scala.Unit,
    setObjects: js.Array[_] => scala.Unit
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), setObjects = js.Any.fromFunction1(setObjects))
  
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
}

