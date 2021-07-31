package typings.std.global

import typings.std.PerformanceObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserver protected ()
  extends StObject
     with typings.std.PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
}
object PerformanceObserver {
  
  @JSGlobal("PerformanceObserver.supportedEntryTypes")
  @js.native
  val supportedEntryTypes: js.Array[java.lang.String] = js.native
}
