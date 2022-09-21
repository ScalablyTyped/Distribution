package typings.rangesMerge

import org.scalablytyped.runtime.StringDictionary
import typings.rangesMerge.anon.PartialOpts
import typings.rangesMerge.rangesMergeNumbers.`1`
import typings.rangesMerge.rangesMergeNumbers.`2`
import typings.rangesSort.mod.Ranges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ranges-merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ranges-merge", "defaults")
  @js.native
  val defaults: Opts = js.native
  
  inline def rMerge(arrOfRanges: Ranges): Ranges = ^.asInstanceOf[js.Dynamic].applyDynamic("rMerge")(arrOfRanges.asInstanceOf[js.Any]).asInstanceOf[Ranges]
  inline def rMerge(arrOfRanges: Ranges, originalOpts: PartialOpts): Ranges = (^.asInstanceOf[js.Dynamic].applyDynamic("rMerge")(arrOfRanges.asInstanceOf[js.Any], originalOpts.asInstanceOf[js.Any])).asInstanceOf[Ranges]
  
  @JSImport("ranges-merge", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    var joinRangesThatTouchEdges: Boolean
    
    var mergeType: `1` | `2` | typings.rangesMerge.rangesMergeStrings.`1` | typings.rangesMerge.rangesMergeStrings.`2`
    
    var progressFn: js.UndefOr[Null | ProgressFn] = js.undefined
  }
  object Opts {
    
    inline def apply(
      joinRangesThatTouchEdges: Boolean,
      mergeType: `1` | `2` | typings.rangesMerge.rangesMergeStrings.`1` | typings.rangesMerge.rangesMergeStrings.`2`
    ): Opts = {
      val __obj = js.Dynamic.literal(joinRangesThatTouchEdges = joinRangesThatTouchEdges.asInstanceOf[js.Any], mergeType = mergeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setJoinRangesThatTouchEdges(value: Boolean): Self = StObject.set(x, "joinRangesThatTouchEdges", value.asInstanceOf[js.Any])
      
      inline def setMergeType(
        value: `1` | `2` | typings.rangesMerge.rangesMergeStrings.`1` | typings.rangesMerge.rangesMergeStrings.`2`
      ): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
      
      inline def setProgressFn(value: /* percentageDone */ Double => Unit): Self = StObject.set(x, "progressFn", js.Any.fromFunction1(value))
      
      inline def setProgressFnNull: Self = StObject.set(x, "progressFn", null)
      
      inline def setProgressFnUndefined: Self = StObject.set(x, "progressFn", js.undefined)
    }
  }
  
  type ProgressFn = js.Function1[/* percentageDone */ Double, Unit]
  
  type UnknownValueObj = StringDictionary[Any]
}
