package typings.reactDashDom.reactDashDomMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch extends js.Object {
  def commit(): Unit = js.native
  def render(children: ReactNode): Work = js.native
  def `then`(): Unit = js.native
  def `then`(onComplete: js.Function0[Unit]): Unit = js.native
}

