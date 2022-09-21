package typings.sqlFormatter

import typings.sqlFormatter.formatOptionsMod.FormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Formatter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formatter {
    def this(cfg: FormatOptions) = this()
    
    /* private */ /* CompleteClass */
    var cachedTokenizer: Any = js.native
    
    /* private */ /* CompleteClass */
    var cfg: Any = js.native
    
    /**
      * Formats an SQL query.
      * @param {string} query - The SQL query string to be formatted
      * @return {string} The formatter query
      */
    /* CompleteClass */
    override def format(query: String): String = js.native
    
    /* private */ /* CompleteClass */
    var formatAst: Any = js.native
    
    /* private */ /* CompleteClass */
    var formatStatement: Any = js.native
    
    /* private */ /* CompleteClass */
    var params: Any = js.native
    
    /* private */ /* CompleteClass */
    var parse: Any = js.native
    
    /* private */ /* CompleteClass */
    var postFormat: Any = js.native
    
    /**
      * SQL Tokenizer for this formatter, provided by subclasses.
      */
    /* protected */ /* CompleteClass */
    override def tokenizer(): typings.sqlFormatter.tokenizerMod.default = js.native
  }
  
  trait Formatter extends StObject {
    
    /* private */ var cachedTokenizer: Any
    
    /* private */ var cfg: Any
    
    /**
      * Formats an SQL query.
      * @param {string} query - The SQL query string to be formatted
      * @return {string} The formatter query
      */
    def format(query: String): String
    
    /* private */ var formatAst: Any
    
    /* private */ var formatStatement: Any
    
    /* private */ var params: Any
    
    /* private */ var parse: Any
    
    /* private */ var postFormat: Any
    
    /**
      * SQL Tokenizer for this formatter, provided by subclasses.
      */
    /* protected */ def tokenizer(): typings.sqlFormatter.tokenizerMod.default
  }
  object Formatter {
    
    inline def apply(
      cachedTokenizer: Any,
      cfg: Any,
      format: String => String,
      formatAst: Any,
      formatStatement: Any,
      params: Any,
      parse: Any,
      postFormat: Any,
      tokenizer: () => typings.sqlFormatter.tokenizerMod.default
    ): Formatter = {
      val __obj = js.Dynamic.literal(cachedTokenizer = cachedTokenizer.asInstanceOf[js.Any], cfg = cfg.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatAst = formatAst.asInstanceOf[js.Any], formatStatement = formatStatement.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], postFormat = postFormat.asInstanceOf[js.Any], tokenizer = js.Any.fromFunction0(tokenizer))
      __obj.asInstanceOf[Formatter]
    }
    
    extension [Self <: Formatter](x: Self) {
      
      inline def setCachedTokenizer(value: Any): Self = StObject.set(x, "cachedTokenizer", value.asInstanceOf[js.Any])
      
      inline def setCfg(value: Any): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatAst(value: Any): Self = StObject.set(x, "formatAst", value.asInstanceOf[js.Any])
      
      inline def setFormatStatement(value: Any): Self = StObject.set(x, "formatStatement", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParse(value: Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setPostFormat(value: Any): Self = StObject.set(x, "postFormat", value.asInstanceOf[js.Any])
      
      inline def setTokenizer(value: () => typings.sqlFormatter.tokenizerMod.default): Self = StObject.set(x, "tokenizer", js.Any.fromFunction0(value))
    }
  }
}
