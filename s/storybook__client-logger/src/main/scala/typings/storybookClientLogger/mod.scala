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
    
    @scala.inline
    def debug(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def error(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def info(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def log(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def trace(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def warn(message: js.Any, rest: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object pretty {
    
    @scala.inline
    def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function1[/* repeated */ String, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ String, Unit]]
    
    @JSImport("@storybook/client-logger", "pretty")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def debug(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def error(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def info(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def trace(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def warn(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
