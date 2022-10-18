package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.libCoreTypesMod.Config
import typings.sqltoolsFormatter.libCoreTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sqltools/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@sqltools/formatter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(query: String, cfg: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def tokenize(query: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
    inline def tokenize(query: String, cfg: Config): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  }
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tokenize(query: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def tokenize(query: String, cfg: Config): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
}
