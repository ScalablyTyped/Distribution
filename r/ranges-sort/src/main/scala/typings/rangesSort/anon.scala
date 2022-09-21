package typings.rangesSort

import typings.rangesSort.mod.ProgressFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ranges-sort.ranges-sort.Opts> */
  trait PartialOpts extends StObject {
    
    var progressFn: js.UndefOr[Null | ProgressFn] = js.undefined
    
    var strictlyTwoElementsInRangeArrays: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    extension [Self <: PartialOpts](x: Self) {
      
      inline def setProgressFn(value: /* percentageDone */ Double => Unit): Self = StObject.set(x, "progressFn", js.Any.fromFunction1(value))
      
      inline def setProgressFnNull: Self = StObject.set(x, "progressFn", null)
      
      inline def setProgressFnUndefined: Self = StObject.set(x, "progressFn", js.undefined)
      
      inline def setStrictlyTwoElementsInRangeArrays(value: Boolean): Self = StObject.set(x, "strictlyTwoElementsInRangeArrays", value.asInstanceOf[js.Any])
      
      inline def setStrictlyTwoElementsInRangeArraysUndefined: Self = StObject.set(x, "strictlyTwoElementsInRangeArrays", js.undefined)
    }
  }
}
