package typings.r7insightJs

import typings.r7insightJs.r7insightJsStrings.`per-entry`
import typings.r7insightJs.r7insightJsStrings.`per-page`
import typings.r7insightJs.r7insightJsStrings.eu
import typings.r7insightJs.r7insightJsStrings.never
import typings.r7insightJs.r7insightJsStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("r7insight_js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def error(obj: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(obj.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def info(obj: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(obj.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def init(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def log(obj: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(obj.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def warn(obj: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(obj.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Log any uncaught JavaScript exceptions. This replaces the window.onerror handler, but if you've specified one already, it'll invoke that one afterwards
      */
    var catchall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sends events to Insight verbatim
      */
    var no_format: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Append basic information about browser capabilities
      */
    var page_info: js.UndefOr[never | `per-page` | `per-entry`] = js.undefined
    
    /**
      * Echo events to the screen via the console object. This will logged at the same level as the call to R7Insight, e.g. R7Insight.warn(msg) => console.warn(msg)
      */
    var print: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Insight log region
      */
    var region: eu | us
    
    /**
      * Use SSL/TLS to send events
      */
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Insight log token
      */
    var token: String
    
    /**
      * Adds a randomly generated trace code
      */
    var trace: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(region: eu | us, token: String): Options = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCatchall(value: Boolean): Self = StObject.set(x, "catchall", value.asInstanceOf[js.Any])
      
      inline def setCatchallUndefined: Self = StObject.set(x, "catchall", js.undefined)
      
      inline def setNo_format(value: Boolean): Self = StObject.set(x, "no_format", value.asInstanceOf[js.Any])
      
      inline def setNo_formatUndefined: Self = StObject.set(x, "no_format", js.undefined)
      
      inline def setPage_info(value: never | `per-page` | `per-entry`): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
      
      inline def setPage_infoUndefined: Self = StObject.set(x, "page_info", js.undefined)
      
      inline def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setRegion(value: eu | us): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
