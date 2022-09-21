package typings.storybookComponents.anon

import typings.storybookComponents.typesPrettierIndexMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndOfLine[T] extends StObject {
  
  var endOfLine: js.UndefOr[
    js.Function5[
      /* commentNode */ Any, 
      /* text */ String, 
      /* options */ ParserOptions[T], 
      /* ast */ T, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
  
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ Any, 
      /* text */ String, 
      /* options */ ParserOptions[T], 
      /* ast */ T, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
  
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ Any, 
      /* text */ String, 
      /* options */ ParserOptions[T], 
      /* ast */ T, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
}
object EndOfLine {
  
  inline def apply[T](): EndOfLine[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfLine[T]]
  }
  
  extension [Self <: EndOfLine[?], T](x: Self & EndOfLine[T]) {
    
    inline def setEndOfLine(
      value: (/* commentNode */ Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
    ): Self = StObject.set(x, "endOfLine", js.Any.fromFunction5(value))
    
    inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
    
    inline def setOwnLine(
      value: (/* commentNode */ Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
    ): Self = StObject.set(x, "ownLine", js.Any.fromFunction5(value))
    
    inline def setOwnLineUndefined: Self = StObject.set(x, "ownLine", js.undefined)
    
    inline def setRemaining(
      value: (/* commentNode */ Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
    ): Self = StObject.set(x, "remaining", js.Any.fromFunction5(value))
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
  }
}
