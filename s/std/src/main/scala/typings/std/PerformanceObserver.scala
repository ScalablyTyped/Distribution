package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserver extends StObject {
  
  def disconnect(): Unit = js.native
  
  def observe(): Unit = js.native
  def observe(options: PerformanceObserverInit): Unit = js.native
  
  def takeRecords(): PerformanceEntryList = js.native
}
