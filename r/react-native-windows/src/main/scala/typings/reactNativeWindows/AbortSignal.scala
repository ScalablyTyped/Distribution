package typings.reactNativeWindows

import typings.reactNativeWindows.anon.Capture
import typings.reactNativeWindows.anon.`1`
import typings.reactNativeWindows.reactNativeWindowsStrings.abort
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortSignal
  extends StObject
     with EventTarget {
  
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Capture
  ): Unit = js.native
  
  def onabort(event: AbortEvent): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: `1`
  ): Unit = js.native
}
