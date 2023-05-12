package typings.slate

import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesLocationMod {
  
  @JSImport("slate/dist/interfaces/location", "Location")
  @js.native
  val Location: LocationInterface = js.native
  type Location = Path | Point | Range
  
  @JSImport("slate/dist/interfaces/location", "Span")
  @js.native
  val Span: SpanInterface = js.native
  type Span = js.Tuple2[Path, Path]
  
  trait LocationInterface extends StObject {
    
    /**
      * Check if a value implements the `Location` interface.
      */
    def isLocation(value: Any): /* is slate.slate/dist/interfaces/location.Location */ Boolean
  }
  object LocationInterface {
    
    inline def apply(isLocation: Any => /* is slate.slate/dist/interfaces/location.Location */ Boolean): LocationInterface = {
      val __obj = js.Dynamic.literal(isLocation = js.Any.fromFunction1(isLocation))
      __obj.asInstanceOf[LocationInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationInterface] (val x: Self) extends AnyVal {
      
      inline def setIsLocation(value: Any => /* is slate.slate/dist/interfaces/location.Location */ Boolean): Self = StObject.set(x, "isLocation", js.Any.fromFunction1(value))
    }
  }
  
  trait SpanInterface extends StObject {
    
    /**
      * Check if a value implements the `Span` interface.
      */
    def isSpan(value: Any): /* is slate.slate/dist/interfaces/location.Span */ Boolean
  }
  object SpanInterface {
    
    inline def apply(isSpan: Any => /* is slate.slate/dist/interfaces/location.Span */ Boolean): SpanInterface = {
      val __obj = js.Dynamic.literal(isSpan = js.Any.fromFunction1(isSpan))
      __obj.asInstanceOf[SpanInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanInterface] (val x: Self) extends AnyVal {
      
      inline def setIsSpan(value: Any => /* is slate.slate/dist/interfaces/location.Span */ Boolean): Self = StObject.set(x, "isSpan", js.Any.fromFunction1(value))
    }
  }
}
