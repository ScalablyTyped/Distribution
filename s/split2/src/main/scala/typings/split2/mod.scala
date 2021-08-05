package typings.split2

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(mapper: Mapper): Transform = ^.asInstanceOf[js.Dynamic].apply(mapper.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(mapper: Mapper, options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(matcher: Matcher): Transform = ^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(matcher: Matcher, mapper: Mapper): Transform = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(matcher: Matcher, mapper: Mapper, options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(matcher: Matcher, options: Options): Transform = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("split2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Mapper = js.Function1[/* line */ String, js.Any]
  
  type Matcher = String | RegExp
  
  trait Options
    extends StObject
       with TransformOptions {
    
    var maxLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
}
