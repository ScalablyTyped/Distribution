package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList) */
@js.native
trait PerformanceObserverEntryList extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntries) */
  /* standard dom */
  def getEntries(): PerformanceEntryList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByName) */
  /* standard dom */
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByType) */
  /* standard dom */
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
}
