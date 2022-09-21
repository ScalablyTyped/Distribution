package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TimeRanges")
@js.native
/* standard dom */
open class TimeRanges ()
  extends StObject
     with typings.std.TimeRanges {
  
  /**
    * Returns the time for the end of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* standard dom */
  /* CompleteClass */
  override def end(index: Double): Double = js.native
  
  /** Returns the number of ranges in the object. */
  /* standard dom */
  /* CompleteClass */
  override val length: Double = js.native
  
  /**
    * Returns the time for the start of the range with the given index.
    *
    * Throws an "IndexSizeError" DOMException if the index is out of range.
    */
  /* standard dom */
  /* CompleteClass */
  override def start(index: Double): Double = js.native
}
