package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserverEntryList extends StObject {
  
  /* standard dom */
  def getEntries(): PerformanceEntryList = js.native
  
  /* standard dom */
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  /* standard dom */
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
}
