package typings.readlineTransform

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readline-transform", JSImport.Default)
  @js.native
  open class default () extends Transform {
    def this(options: ReadlineTransformOptions) = this()
  }
  
  type ReadlineTransform = Transform
  
  trait ReadlineTransformOptions
    extends StObject
       with TransformOptions {
    
    /** line break matcher for str.split() (default: /\r?\n/) */
    var breakMatcher: js.UndefOr[js.RegExp] = js.undefined
    
    /** if content ends with line break, ignore last empty line (default: true) */
    var ignoreEndOfBreak: js.UndefOr[Boolean] = js.undefined
    
    /** if line is empty string, skip it (default: false) */
    var skipEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object ReadlineTransformOptions {
    
    inline def apply(): ReadlineTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadlineTransformOptions]
    }
    
    extension [Self <: ReadlineTransformOptions](x: Self) {
      
      inline def setBreakMatcher(value: js.RegExp): Self = StObject.set(x, "breakMatcher", value.asInstanceOf[js.Any])
      
      inline def setBreakMatcherUndefined: Self = StObject.set(x, "breakMatcher", js.undefined)
      
      inline def setIgnoreEndOfBreak(value: Boolean): Self = StObject.set(x, "ignoreEndOfBreak", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEndOfBreakUndefined: Self = StObject.set(x, "ignoreEndOfBreak", js.undefined)
      
      inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyUndefined: Self = StObject.set(x, "skipEmpty", js.undefined)
    }
  }
}
