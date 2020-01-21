package typings.reactDom.mod

import typings.react.mod.ReactChild
import typings.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Root extends js.Object {
  def render(children: ReactChild): Unit = js.native
  def render(children: ReactChild, callback: js.Function0[Unit]): Unit = js.native
  def render(children: ReactNodeArray): Unit = js.native
  def render(children: ReactNodeArray, callback: js.Function0[Unit]): Unit = js.native
  def unmount(): Unit = js.native
  def unmount(callback: js.Function0[Unit]): Unit = js.native
}

