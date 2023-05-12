package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayPerformanceEntry[T] extends StObject {
  
  /**
    * Additional unstructured data to be included
    */
  var data: T
  
  /**
    * The end timestamp in seconds
    */
  var end: Double
  
  /**
    * A more specific description of the performance entry
    */
  var name: String
  
  /**
    * The start timestamp in seconds
    */
  var start: Double
  
  /**
    * One of these types https://developer.mozilla.org/en-US/docs/Web/API/PerformanceEntry/entryType
    */
  var `type`: String
}
object ReplayPerformanceEntry {
  
  inline def apply[T](data: T, end: Double, name: String, start: Double, `type`: String): ReplayPerformanceEntry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayPerformanceEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayPerformanceEntry[?], T] (val x: Self & ReplayPerformanceEntry[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
