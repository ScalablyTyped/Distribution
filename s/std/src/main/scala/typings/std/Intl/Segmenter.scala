package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segmenter extends StObject {
  
  /* standard es2022.intl */
  def resolvedOptions(): ResolvedSegmenterOptions
  
  /**
    * Returns `Segments` object containing the segments of the input string, using the segmenter's locale and granularity.
    *
    * @param input - The text to be segmented as a `string`.
    *
    * @returns A new iterable Segments object containing the segments of the input string, using the segmenter's locale and granularity.
    */
  /* standard es2022.intl */
  def segment(input: String): Segments
}
object Segmenter {
  
  inline def apply(resolvedOptions: () => ResolvedSegmenterOptions, segment: String => Segments): Segmenter = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), segment = js.Any.fromFunction1(segment))
    __obj.asInstanceOf[Segmenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Segmenter] (val x: Self) extends AnyVal {
    
    inline def setResolvedOptions(value: () => ResolvedSegmenterOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    
    inline def setSegment(value: String => Segments): Self = StObject.set(x, "segment", js.Any.fromFunction1(value))
  }
}
