package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  def requestIdleCallback(callback: js.Function1[/* deadline */ IdleDeadline, Unit]): IdleCallbackHandle = js.native
  def requestIdleCallback(callback: js.Function1[/* deadline */ IdleDeadline, Unit], options: IdleRequestOptions): IdleCallbackHandle = js.native
}
