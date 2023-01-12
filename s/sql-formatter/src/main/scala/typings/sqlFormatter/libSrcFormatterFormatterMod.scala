package typings.sqlFormatter

import typings.sqlFormatter.libSrcDialectMod.Dialect
import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterFormatterMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Formatter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formatter {
    def this(dialect: Dialect, cfg: FormatOptions) = this()
    
    /* private */ /* CompleteClass */
    var cfg: Any = js.native
    
    /* private */ /* CompleteClass */
    var dialect: Any = js.native
    
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
  }
  
  trait Formatter extends StObject {
    
    /* private */ var cfg: Any
    
    /* private */ var dialect: Any
    
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
  }
  object Formatter {
    
    inline def apply(
      cfg: Any,
      dialect: Any,
      format: String => String,
      formatAst: Any,
      formatStatement: Any,
      params: Any,
      parse: Any,
      postFormat: Any
    ): Formatter = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], dialect = dialect.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatAst = formatAst.asInstanceOf[js.Any], formatStatement = formatStatement.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], postFormat = postFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
      
      inline def setCfg(value: Any): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setDialect(value: Any): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatAst(value: Any): Self = StObject.set(x, "formatAst", value.asInstanceOf[js.Any])
      
      inline def setFormatStatement(value: Any): Self = StObject.set(x, "formatStatement", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParse(value: Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setPostFormat(value: Any): Self = StObject.set(x, "postFormat", value.asInstanceOf[js.Any])
    }
  }
}
