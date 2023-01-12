package typings.split

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ThroughStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ThroughStream]
  inline def apply(matcher: Any): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  inline def apply(matcher: Any, mapper: Any): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Any, mapper: Any, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Any, mapper: Unit, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: Any): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: Any, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(matcher: Unit, mapper: Unit, options: SplitOptions): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(matcher.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  
  @JSImport("split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // doc-strings taken from https://github.com/dominictarr/split, used under MIT license
  trait SplitOptions extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * By default the last buffer not delimited by a newline or `matcher` will be emitted.
      * To prevent this set `options.trailing` to `false`.
      */
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object SplitOptions {
    
    inline def apply(): SplitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
