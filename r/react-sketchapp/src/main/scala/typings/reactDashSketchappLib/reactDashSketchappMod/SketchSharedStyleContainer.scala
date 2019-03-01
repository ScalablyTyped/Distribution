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
    addSharedStyleWithName_firstInstance: js.Function2[java.lang.String, js.Any, scala.Unit],
    setObjects: js.Function1[js.Array[_], scala.Unit]
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSharedStyleWithName_firstInstance")(addSharedStyleWithName_firstInstance)
    __obj.updateDynamic("setObjects")(setObjects)
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
}

