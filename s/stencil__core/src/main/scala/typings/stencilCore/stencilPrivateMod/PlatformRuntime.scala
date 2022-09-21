package typings.stencilCore.stencilPrivateMod

import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FrameRequestCallback
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformRuntime extends StObject {
  
  @JSName("$cssShim$")
  var DollarcssShimDollar: js.UndefOr[CssVarShim] = js.native
  
  @JSName("$flags$")
  var DollarflagsDollar: Double = js.native
  
  @JSName("$orgLocNodes$")
  var DollarorgLocNodesDollar: js.UndefOr[Map[String, RenderNode]] = js.native
  
  @JSName("$resourcesUrl$")
  var DollarresourcesUrlDollar: String = js.native
  
  def ael(el: EventTarget, eventName: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def ael(
    el: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def ce(eventName: String): CustomEvent[Any] = js.native
  def ce(eventName: String, opts: Any): CustomEvent[Any] = js.native
  
  def jmp(c: js.Function): Any = js.native
  
  def raf(c: FrameRequestCallback): Double = js.native
  
  def rel(el: EventTarget, eventName: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def rel(
    el: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
}
