package typings.scroll.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scroll", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def left(el: HTMLElement, to: Double): Cancel = js.native
  def left(el: HTMLElement, to: Double, opts: js.UndefOr[scala.Nothing], cb: ScrollCallback): Cancel = js.native
  def left(el: HTMLElement, to: Double, opts: ScrollCallback): Cancel = js.native
  def left(el: HTMLElement, to: Double, opts: ScrollCallback, cb: ScrollCallback): Cancel = js.native
  def left(el: HTMLElement, to: Double, opts: ScrollOptions): Cancel = js.native
  def left(el: HTMLElement, to: Double, opts: ScrollOptions, cb: ScrollCallback): Cancel = js.native
  @JSName("left")
  var left_Original: Scroll = js.native
  
  def top(el: HTMLElement, to: Double): Cancel = js.native
  def top(el: HTMLElement, to: Double, opts: js.UndefOr[scala.Nothing], cb: ScrollCallback): Cancel = js.native
  def top(el: HTMLElement, to: Double, opts: ScrollCallback): Cancel = js.native
  def top(el: HTMLElement, to: Double, opts: ScrollCallback, cb: ScrollCallback): Cancel = js.native
  def top(el: HTMLElement, to: Double, opts: ScrollOptions): Cancel = js.native
  def top(el: HTMLElement, to: Double, opts: ScrollOptions, cb: ScrollCallback): Cancel = js.native
  @JSName("top")
  var top_Original: Scroll = js.native
}
