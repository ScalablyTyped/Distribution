package typings.reactNative

import typings.reactNative.anon.Capture
import typings.reactNative.anon.`1`
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
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Capture
  ): Unit = js.native
  
  def onabort(event: AbortEvent): Unit = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* event */ Any, Any],
    options: `1`
  ): Unit = js.native
}
