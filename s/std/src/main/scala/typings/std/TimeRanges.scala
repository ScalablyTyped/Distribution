package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to represent a set of time ranges, primarily for the purpose of tracking which portions of media have been buffered when loading it for use by the <audio> and <video> elements. */
trait TimeRanges extends StObject {
  
  /**
    * Returns the time for the end of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* standard dom */
  def end(index: Double): Double
  
  /** Returns the number of ranges in the object. */
  /* standard dom */
  val length: Double
  
  /**
    * Returns the time for the start of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* standard dom */
  def start(index: Double): Double
}
object TimeRanges {
  
  inline def apply(end: Double => Double, length: Double, start: Double => Double): TimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[TimeRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRanges] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
