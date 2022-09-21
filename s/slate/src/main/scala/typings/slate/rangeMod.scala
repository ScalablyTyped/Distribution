package typings.slate

import typings.slate.customTypesMod.ExtendedType
import typings.slate.operationMod.Operation
import typings.slate.pathMod.Path
import typings.slate.pointMod.Point
import typings.slate.pointMod.PointEntry
import typings.slate.typesMod.RangeDirection
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("slate/dist/interfaces/range", "Range")
  @js.native
  val Range: RangeInterface = js.native
  type Range = ExtendedType[typings.slate.slateStrings.Range, BaseRange]
  
  trait BaseRange extends StObject {
    
    var anchor: Point
    
    var focus: Point
  }
  object BaseRange {
    
    inline def apply(anchor: Point, focus: Point): BaseRange = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRange]
    }
    
    extension [Self <: BaseRange](x: Self) {
      
      inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Point): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeEdgesOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object RangeEdgesOptions {
    
    inline def apply(): RangeEdgesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeEdgesOptions]
    }
    
    extension [Self <: RangeEdgesOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait RangeInterface extends StObject {
    
    def edges(range: typings.slate.rangeMod.Range): js.Tuple2[Point, Point] = js.native
    def edges(range: typings.slate.rangeMod.Range, options: RangeEdgesOptions): js.Tuple2[Point, Point] = js.native
    
    def end(range: typings.slate.rangeMod.Range): Point = js.native
    
    def equals(range: typings.slate.rangeMod.Range, another: typings.slate.rangeMod.Range): Boolean = js.native
    
    def includes(range: typings.slate.rangeMod.Range, target: Point | typings.slate.rangeMod.Range): Boolean = js.native
    def includes(range: typings.slate.rangeMod.Range, target: Path): Boolean = js.native
    
    def intersection(range: typings.slate.rangeMod.Range, another: typings.slate.rangeMod.Range): typings.slate.rangeMod.Range | Null = js.native
    
    def isBackward(range: typings.slate.rangeMod.Range): Boolean = js.native
    
    def isCollapsed(range: typings.slate.rangeMod.Range): Boolean = js.native
    
    def isExpanded(range: typings.slate.rangeMod.Range): Boolean = js.native
    
    def isForward(range: typings.slate.rangeMod.Range): Boolean = js.native
    
    def isRange(value: Any): /* is slate.slate/dist/interfaces/range.Range */ Boolean = js.native
    
    def points(range: typings.slate.rangeMod.Range): Generator[PointEntry, Unit, Unit] = js.native
    
    def start(range: typings.slate.rangeMod.Range): Point = js.native
    
    def transform(range: typings.slate.rangeMod.Range, op: Operation): typings.slate.rangeMod.Range | Null = js.native
    def transform(range: typings.slate.rangeMod.Range, op: Operation, options: RangeTransformOptions): typings.slate.rangeMod.Range | Null = js.native
  }
  
  trait RangeTransformOptions extends StObject {
    
    var affinity: js.UndefOr[RangeDirection | Null] = js.undefined
  }
  object RangeTransformOptions {
    
    inline def apply(): RangeTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeTransformOptions]
    }
    
    extension [Self <: RangeTransformOptions](x: Self) {
      
      inline def setAffinity(value: RangeDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
