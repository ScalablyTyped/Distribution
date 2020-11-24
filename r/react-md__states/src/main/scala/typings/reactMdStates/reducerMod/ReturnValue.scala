package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleEvent
import typings.reactMdStates.typesMod.RippleState
import typings.reactMdStates.typesMod.RipplesState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue[E /* <: HTMLElement */] extends js.Object {
  
  def cancel(): Unit = js.native
  def cancel(ease: Boolean): Unit = js.native
  
  def create(event: RippleEvent[E]): Unit = js.native
  
  def entered(ripple: RippleState): Unit = js.native
  
  def release(event: RippleEvent[E]): Unit = js.native
  
  def remove(ripple: RippleState): Unit = js.native
  
  var state: RipplesState = js.native
}
