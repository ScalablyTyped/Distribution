package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatterExpressionFormatterMod.DialectFormatOptions
import typings.sqlFormatter.libSrcFormatterExpressionFormatterMod.ProcessedDialectFormatOptions
import typings.sqlFormatter.libSrcLexerTokenizerMod.default
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.TokenizerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcDialectMod {
  
  @JSImport("sql-formatter/lib/src/dialect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDialect(options: DialectOptions): Dialect = ^.asInstanceOf[js.Dynamic].applyDynamic("createDialect")(options.asInstanceOf[js.Any]).asInstanceOf[Dialect]
  
  trait Dialect extends StObject {
    
    var formatOptions: ProcessedDialectFormatOptions
    
    var tokenizer: default
  }
  object Dialect {
    
    inline def apply(formatOptions: ProcessedDialectFormatOptions, tokenizer: default): Dialect = {
      val __obj = js.Dynamic.literal(formatOptions = formatOptions.asInstanceOf[js.Any], tokenizer = tokenizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialect]
    }
    
    extension [Self <: Dialect](x: Self) {
      
      inline def setFormatOptions(value: ProcessedDialectFormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setTokenizer(value: default): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialectOptions extends StObject {
    
    var formatOptions: DialectFormatOptions
    
    var tokenizerOptions: TokenizerOptions
  }
  object DialectOptions {
    
    inline def apply(formatOptions: DialectFormatOptions, tokenizerOptions: TokenizerOptions): DialectOptions = {
      val __obj = js.Dynamic.literal(formatOptions = formatOptions.asInstanceOf[js.Any], tokenizerOptions = tokenizerOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialectOptions]
    }
    
    extension [Self <: DialectOptions](x: Self) {
      
      inline def setFormatOptions(value: DialectFormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setTokenizerOptions(value: TokenizerOptions): Self = StObject.set(x, "tokenizerOptions", value.asInstanceOf[js.Any])
    }
  }
}
