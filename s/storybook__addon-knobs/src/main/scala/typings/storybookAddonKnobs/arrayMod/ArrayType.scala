package typings.storybookAddonKnobs.arrayMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLTextAreaElement
import typings.storybookAddonKnobs.anon.ReadonlyArrayTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType
  extends Component[ArrayTypeProps, js.Object, js.Any] {
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MArrayType(nextProps: ReadonlyArrayTypeProps): Boolean = js.native
}

