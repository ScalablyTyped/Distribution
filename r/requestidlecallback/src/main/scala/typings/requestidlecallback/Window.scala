package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  def requestIdleCallback(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
}
