package typings.storybookNodeLogger

import typings.storybookNodeLogger.anon.Message
import typings.storybookNodeLogger.storybookNodeLoggerStrings.error
import typings.storybookNodeLogger.storybookNodeLoggerStrings.info
import typings.storybookNodeLogger.storybookNodeLoggerStrings.verbose
import typings.storybookNodeLogger.storybookNodeLoggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/node-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object colors {
    
    @JSImport("@storybook/node-logger", "colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/node-logger", "colors.blue")
    @js.native
    def blue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def blue_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.gray")
    @js.native
    def gray: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def gray_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.green")
    @js.native
    def green: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def green_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.orange")
    @js.native
    def orange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def orange_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.pink")
    @js.native
    def pink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def pink_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.purple")
    @js.native
    def purple: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def purple_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/node-logger", "colors.red")
    @js.native
    def red: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any = js.native
    inline def red_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify chalk.Chalk */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
  }
  
  inline def deprecate(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object logger {
    
    @JSImport("@storybook/node-logger", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def line(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("line")().asInstanceOf[Unit]
    inline def line(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def plain(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plain")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setLevel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")().asInstanceOf[Unit]
    inline def setLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def trace(param0: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def verbose(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object once {
    
    inline def apply(`type`: verbose | info | warn | error): js.Function1[/* message */ String, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* message */ String, Unit]]
    
    @JSImport("@storybook/node-logger", "once")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def verbose(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
