package typings.reactTether.mod

import typings.react.mod.Component
import typings.reactTether.mod.ReactTether.TetherComponentProps
import typings.tether.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TetherComponent
  extends Component[TetherComponentProps, js.Object, js.Any] {
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getTetherInstance(): ^ = js.native
  
  def off(event: js.Any, handler: js.Any): Unit = js.native
  
  def on(event: js.Any, handler: js.Any): Unit = js.native
  def on(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
  
  def once(event: js.Any, handler: js.Any): Unit = js.native
  def once(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
  
  def position(): Unit = js.native
  
  @JSName("props")
  var props_TetherComponent: TetherComponentProps = js.native
}
