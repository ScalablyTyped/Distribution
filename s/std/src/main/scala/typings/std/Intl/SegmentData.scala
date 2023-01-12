package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentData extends StObject {
  
  /** The code unit index in the original input string at which the segment begins. */
  /* standard es2022.intl */
  var index: Double
  
  /** The complete input string that was segmented. */
  /* standard es2022.intl */
  var input: String
  
  /**
    * A boolean value only if granularity is "word"; otherwise, undefined.
    * If granularity is "word", then isWordLike is true when the segment is word-like (i.e., consists of letters/numbers/ideographs/etc.); otherwise, false.
    */
  /* standard es2022.intl */
  var isWordLike: js.UndefOr[Boolean] = js.undefined
  
  /** A string containing the segment extracted from the original input string. */
  /* standard es2022.intl */
  var segment: String
}
object SegmentData {
  
  inline def apply(index: Double, input: String, segment: String): SegmentData = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setIsWordLike(value: Boolean): Self = StObject.set(x, "isWordLike", value.asInstanceOf[js.Any])
    
    inline def setIsWordLikeUndefined: Self = StObject.set(x, "isWordLike", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
  }
}
