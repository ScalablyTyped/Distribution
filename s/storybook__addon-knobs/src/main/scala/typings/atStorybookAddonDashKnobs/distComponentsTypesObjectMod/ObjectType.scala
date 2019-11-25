package typings.atStorybookAddonDashKnobs.distComponentsTypesObjectMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends Component[ObjectTypeProps[T], js.Object, js.Any] {
  @JSName("state")
  var state_ObjectType: ObjectTypeState[T] = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
}

