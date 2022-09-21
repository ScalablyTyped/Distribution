package typings.storybookComponents.typesPrettierIndexMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser[T] extends StObject {
  
  var astFormat: String
  
  var hasPragma: js.UndefOr[js.Function1[/* text */ String, Boolean]] = js.undefined
  
  def locEnd(node: T): Double
  
  def locStart(node: T): Double
  
  def parse(text: String, parsers: StringDictionary[Parser[Any]], options: ParserOptions[T]): T
  
  var preprocess: js.UndefOr[js.Function2[/* text */ String, /* options */ ParserOptions[T], String]] = js.undefined
}
object Parser {
  
  inline def apply[T](
    astFormat: String,
    locEnd: T => Double,
    locStart: T => Double,
    parse: (String, StringDictionary[Parser[Any]], ParserOptions[T]) => T
  ): Parser[T] = {
    val __obj = js.Dynamic.literal(astFormat = astFormat.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[Parser[T]]
  }
  
  extension [Self <: Parser[?], T](x: Self & Parser[T]) {
    
    inline def setAstFormat(value: String): Self = StObject.set(x, "astFormat", value.asInstanceOf[js.Any])
    
    inline def setHasPragma(value: /* text */ String => Boolean): Self = StObject.set(x, "hasPragma", js.Any.fromFunction1(value))
    
    inline def setHasPragmaUndefined: Self = StObject.set(x, "hasPragma", js.undefined)
    
    inline def setLocEnd(value: T => Double): Self = StObject.set(x, "locEnd", js.Any.fromFunction1(value))
    
    inline def setLocStart(value: T => Double): Self = StObject.set(x, "locStart", js.Any.fromFunction1(value))
    
    inline def setParse(value: (String, StringDictionary[Parser[Any]], ParserOptions[T]) => T): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    
    inline def setPreprocess(value: (/* text */ String, /* options */ ParserOptions[T]) => String): Self = StObject.set(x, "preprocess", js.Any.fromFunction2(value))
    
    inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
  }
}
