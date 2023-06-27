package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver) */
@js.native
trait PerformanceObserver extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/disconnect) */
  /* standard dom */
  def disconnect(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/observe) */
  /* standard dom */
  def observe(): Unit = js.native
  def observe(options: PerformanceObserverInit): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/takeRecords) */
  /* standard dom */
  def takeRecords(): PerformanceEntryList = js.native
}
