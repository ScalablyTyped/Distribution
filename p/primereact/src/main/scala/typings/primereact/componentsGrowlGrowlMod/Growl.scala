package typings.primereact.componentsGrowlGrowlMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("primereact/components/growl/Growl", "Growl")
@js.native
class Growl ()
  extends Component[GrowlProps, js.Any, js.Any] {
  def clear(): Unit = js.native
  def show(message: js.Array[GrowlMessage]): Unit = js.native
  def show(message: GrowlMessage): Unit = js.native
}

