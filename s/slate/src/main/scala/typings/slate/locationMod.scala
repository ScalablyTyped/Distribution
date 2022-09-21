package typings.slate

import typings.slate.pathMod.Path
import typings.slate.pointMod.Point
import typings.slate.rangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationMod {
  
  @JSImport("slate/dist/interfaces/location", "Location")
  @js.native
  val Location: LocationInterface = js.native
  type Location = Path | Point | Range
  
  @JSImport("slate/dist/interfaces/location", "Span")
  @js.native
  val Span: SpanInterface = js.native
  type Span = js.Tuple2[Path, Path]
  
  trait LocationInterface extends StObject {
    
    def isLocation(value: Any): /* is slate.slate/dist/interfaces/location.Location */ Boolean
  }
  object LocationInterface {
    
    inline def apply(isLocation: Any => /* is slate.slate/dist/interfaces/location.Location */ Boolean): LocationInterface = {
      val __obj = js.Dynamic.literal(isLocation = js.Any.fromFunction1(isLocation))
      __obj.asInstanceOf[LocationInterface]
    }
    
    extension [Self <: LocationInterface](x: Self) {
      
      inline def setIsLocation(value: Any => /* is slate.slate/dist/interfaces/location.Location */ Boolean): Self = StObject.set(x, "isLocation", js.Any.fromFunction1(value))
    }
  }
  
  trait SpanInterface extends StObject {
    
    def isSpan(value: Any): /* is slate.slate/dist/interfaces/location.Span */ Boolean
  }
  object SpanInterface {
    
    inline def apply(isSpan: Any => /* is slate.slate/dist/interfaces/location.Span */ Boolean): SpanInterface = {
      val __obj = js.Dynamic.literal(isSpan = js.Any.fromFunction1(isSpan))
      __obj.asInstanceOf[SpanInterface]
    }
    
    extension [Self <: SpanInterface](x: Self) {
      
      inline def setIsSpan(value: Any => /* is slate.slate/dist/interfaces/location.Span */ Boolean): Self = StObject.set(x, "isSpan", js.Any.fromFunction1(value))
    }
  }
}
