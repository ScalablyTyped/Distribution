package typings.reactDashTools.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("React", "Component")
@js.native
class Component () extends js.Object {
  def this(props: js.Any) = this()
  def this(props: js.Any, context: js.Any) = this()
  var context: js.Any = js.native
  var props: js.Any = js.native
  var state: js.Any = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Any): Unit = js.native
  def setState(partial: js.Any): Unit = js.native
  def setState(partial: js.Any, callback: js.Any): Unit = js.native
}

/* static members */
@JSImport("React", "Component")
@js.native
object Component extends js.Object {
  var name: String = js.native
}

