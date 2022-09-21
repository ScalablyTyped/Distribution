package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserver extends StObject {
  
  /* standard dom */
  def disconnect(): Unit = js.native
  
  /* standard dom */
  def observe(): Unit = js.native
  def observe(options: PerformanceObserverInit): Unit = js.native
  
  /* standard dom */
  def takeRecords(): PerformanceEntryList = js.native
}
