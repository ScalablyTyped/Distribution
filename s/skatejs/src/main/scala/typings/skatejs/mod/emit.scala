package typings.skatejs.mod

import typings.skatejs.typesMod.EventOptions
import typings.skatejs.typesMod.HTMLElementClass
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs", "emit")
@js.native
object emit extends js.Object {
  
  def apply(elem: HTMLElementClass, eventName: String): Boolean = js.native
  def apply(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def apply(elem: EventTarget, eventName: String): Boolean = js.native
  def apply(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
}
