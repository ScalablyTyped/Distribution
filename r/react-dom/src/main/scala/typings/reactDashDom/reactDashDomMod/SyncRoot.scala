package typings.reactDashDom.reactDashDomMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncRoot extends js.Object {
  def render(children: ReactNode): Work = js.native
  def render(children: ReactNode, callback: js.Function0[Unit]): Work = js.native
  def unmount(): Unit = js.native
  def unmount(callback: js.Function0[Unit]): Unit = js.native
}

