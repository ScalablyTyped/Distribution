package typings.slate

import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesPointMod.PointEntry
import typings.slate.distTypesCustomTypesMod.ExtendedType
import typings.slate.distTypesTypesMod.RangeDirection
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesRangeMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseRange] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeEdgesOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait RangeInterface extends StObject {
    
    /**
      * Get the start and end points of a range, in the order in which they appear
      * in the document.
      */
    def edges(range: typings.slate.distInterfacesRangeMod.Range): js.Tuple2[Point, Point] = js.native
    def edges(range: typings.slate.distInterfacesRangeMod.Range, options: RangeEdgesOptions): js.Tuple2[Point, Point] = js.native
    
    /**
      * Get the end point of a range.
      */
    def end(range: typings.slate.distInterfacesRangeMod.Range): Point = js.native
    
    /**
      * Check if a range is exactly equal to another.
      */
    def equals(
      range: typings.slate.distInterfacesRangeMod.Range,
      another: typings.slate.distInterfacesRangeMod.Range
    ): Boolean = js.native
    
    /**
      * Check if a range includes a path, a point or part of another range.
      */
    def includes(range: typings.slate.distInterfacesRangeMod.Range, target: Path): Boolean = js.native
    def includes(range: typings.slate.distInterfacesRangeMod.Range, target: Point): Boolean = js.native
    def includes(
      range: typings.slate.distInterfacesRangeMod.Range,
      target: typings.slate.distInterfacesRangeMod.Range
    ): Boolean = js.native
    
    /**
      * Get the intersection of a range with another.
      */
    def intersection(
      range: typings.slate.distInterfacesRangeMod.Range,
      another: typings.slate.distInterfacesRangeMod.Range
    ): typings.slate.distInterfacesRangeMod.Range | Null = js.native
    
    /**
      * Check if a range is backward, meaning that its anchor point appears in the
      * document _after_ its focus point.
      */
    def isBackward(range: typings.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    /**
      * Check if a range is collapsed, meaning that both its anchor and focus
      * points refer to the exact same position in the document.
      */
    def isCollapsed(range: typings.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    /**
      * Check if a range is expanded.
      *
      * This is the opposite of [[Range.isCollapsed]] and is provided for legibility.
      */
    def isExpanded(range: typings.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    /**
      * Check if a range is forward.
      *
      * This is the opposite of [[Range.isBackward]] and is provided for legibility.
      */
    def isForward(range: typings.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    /**
      * Check if a value implements the [[Range]] interface.
      */
    def isRange(value: Any): /* is slate.slate/dist/interfaces/range.Range */ Boolean = js.native
    
    /**
      * Iterate through all of the point entries in a range.
      */
    def points(range: typings.slate.distInterfacesRangeMod.Range): Generator[PointEntry, Unit, Unit] = js.native
    
    /**
      * Get the start point of a range.
      */
    def start(range: typings.slate.distInterfacesRangeMod.Range): Point = js.native
    
    /**
      * Transform a range by an operation.
      */
    def transform(range: typings.slate.distInterfacesRangeMod.Range, op: Operation): typings.slate.distInterfacesRangeMod.Range | Null = js.native
    def transform(range: typings.slate.distInterfacesRangeMod.Range, op: Operation, options: RangeTransformOptions): typings.slate.distInterfacesRangeMod.Range | Null = js.native
  }
  
  trait RangeTransformOptions extends StObject {
    
    var affinity: js.UndefOr[RangeDirection | Null] = js.undefined
  }
  object RangeTransformOptions {
    
    inline def apply(): RangeTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeTransformOptions] (val x: Self) extends AnyVal {
      
      inline def setAffinity(value: RangeDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
