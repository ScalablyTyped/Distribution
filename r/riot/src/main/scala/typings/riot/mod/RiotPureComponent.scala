package typings.riot.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotPureComponent[Context] extends js.Object {
  def mount(element: HTMLElement): RiotPureComponent[Context] = js.native
  def mount(element: HTMLElement, context: Context): RiotPureComponent[Context] = js.native
  def unmount(keepRootElement: Boolean): RiotPureComponent[Context] = js.native
  def update(): RiotPureComponent[Context] = js.native
  def update(context: Context): RiotPureComponent[Context] = js.native
}

