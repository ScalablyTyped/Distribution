package typings.split

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ThroughStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ThroughStream]
  inline def apply(matcher: js.Any): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  inline def apply(matcher: js.Any, mapper: js.Any): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: js.Any, mapper: js.Any, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: js.Any, mapper: Unit, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: js.Any): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: js.Any, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: Unit, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  
  @JSImport("split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SplitOptions extends StObject {
    
    var maxLength: Double
  }
  object SplitOptions {
    
    inline def apply(maxLength: Double): SplitOptions = {
      val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitOptions]
    }
    
    extension [Self <: SplitOptions](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    }
  }
}
