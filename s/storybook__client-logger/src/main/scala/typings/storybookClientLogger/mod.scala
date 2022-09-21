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
  
  object logger {
    
    @JSImport("@storybook/client-logger", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object once {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function2[/* message */ Any, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* message */ Any, /* repeated */ Any, Unit]]
    
    @JSImport("@storybook/client-logger", "once")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object pretty {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function1[/* repeated */ String, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ String, Unit]]
    
    @JSImport("@storybook/client-logger", "pretty")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def error(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def info(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def trace(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def warn(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
}
