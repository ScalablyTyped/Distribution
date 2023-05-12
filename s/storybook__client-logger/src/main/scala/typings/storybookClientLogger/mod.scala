package typings.storybookClientLogger

import typings.storybookClientLogger.storybookClientLoggerStrings.debug
import typings.storybookClientLogger.storybookClientLoggerStrings.error
import typings.storybookClientLogger.storybookClientLoggerStrings.info
import typings.storybookClientLogger.storybookClientLoggerStrings.log
import typings.storybookClientLogger.storybookClientLoggerStrings.trace
import typings.storybookClientLogger.storybookClientLoggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/client-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecate(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  object logger {
    
    @JSImport("@storybook/client-logger", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object once {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function2[/* message */ Any, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* message */ Any, /* repeated */ Any, Unit]]
    
    @JSImport("@storybook/client-logger", "once")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object pretty {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function2[/* message */ Any, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* message */ Any, /* repeated */ Any, Unit]]
    
    @JSImport("@storybook/client-logger", "pretty")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(message: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
}
