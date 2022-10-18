package typings.slate

import typings.slate.distInterfacesCustomTypesMod.ExtendedType
import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesTypesMod.TextDirection
import typings.slate.slateInts.`-1`
import typings.slate.slateInts.`0`
import typings.slate.slateInts.`1`
import typings.slate.slateStrings.anchor
import typings.slate.slateStrings.focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesPointMod {
  
  @JSImport("slate/dist/interfaces/point", "Point")
  @js.native
  val Point: PointInterface = js.native
  type Point = ExtendedType[typings.slate.slateStrings.Point, BasePoint]
  
  trait BasePoint extends StObject {
    
    var offset: Double
    
    var path: Path
  }
  object BasePoint {
    
    inline def apply(offset: Double, path: Path): BasePoint = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePoint]
    }
    
    extension [Self <: BasePoint](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  type PointEntry = js.Tuple2[typings.slate.distInterfacesPointMod.Point, anchor | focus]
  
  @js.native
  trait PointInterface extends StObject {
    
    def compare(
      point: typings.slate.distInterfacesPointMod.Point,
      another: typings.slate.distInterfacesPointMod.Point
    ): `-1` | `0` | `1` = js.native
    
    def equals(
      point: typings.slate.distInterfacesPointMod.Point,
      another: typings.slate.distInterfacesPointMod.Point
    ): Boolean = js.native
    
    def isAfter(
      point: typings.slate.distInterfacesPointMod.Point,
      another: typings.slate.distInterfacesPointMod.Point
    ): Boolean = js.native
    
    def isBefore(
      point: typings.slate.distInterfacesPointMod.Point,
      another: typings.slate.distInterfacesPointMod.Point
    ): Boolean = js.native
    
    def isPoint(value: Any): /* is slate.slate/dist/interfaces/point.Point */ Boolean = js.native
    
    def transform(point: typings.slate.distInterfacesPointMod.Point, op: Operation): typings.slate.distInterfacesPointMod.Point | Null = js.native
    def transform(point: typings.slate.distInterfacesPointMod.Point, op: Operation, options: PointTransformOptions): typings.slate.distInterfacesPointMod.Point | Null = js.native
  }
  
  trait PointTransformOptions extends StObject {
    
    var affinity: js.UndefOr[TextDirection | Null] = js.undefined
  }
  object PointTransformOptions {
    
    inline def apply(): PointTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointTransformOptions]
    }
    
    extension [Self <: PointTransformOptions](x: Self) {
      
      inline def setAffinity(value: TextDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
