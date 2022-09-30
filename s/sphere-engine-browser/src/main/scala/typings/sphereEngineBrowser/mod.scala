package typings.sphereEngineBrowser

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Represents a text console. The player can use the console to view internal log messages as
    * well as enter commands to control the game's low-level workings.
    */
  @JSImport("console", JSImport.Default)
  @js.native
  /**
    * Construct a new console. There is rarely a need to make more than one.
    * @param options Options for the new console.
    */
  open class default () extends Console {
    def this(options: ConsoleOptions) = this()
  }
  
  /**
    * Represents a text console. The player can use the console to view internal log messages as
    * well as enter commands to control the game's low-level workings.
    */
  @js.native
  trait Console
    extends typings.sphereEngineBrowser.threadMod.default {
    
    /**
      * Registers an object and associated set of commands with the console.
      * @param name    The name of the object, as used in commands. Note that if this contains
      *                any spaces, the player will have to quote it.
      * @param object  The JavaScript object to be registered.
      * @param methods An object whose methods correspond to commands. When the user types the
      *                associated command, its method is called with `this` set to `thisArg`.
      */
    def defineObject[T](
      name: String,
      `object`: T,
      methods: Record[String, js.ThisFunction1[/* this */ T, /* repeated */ String | Double, Unit]]
    ): Unit = js.native
    
    /**
      * Write a line of text to the console.
      * @param texts One or more strings to write. If more than one string is provided, they will
      *              be separated will chevrons (`>>`).
      */
    def log(texts: String*): Unit = js.native
    
    /**
      * Unregisters a set of commands that was previously registered with `defineObject`.
      * @param name
      */
    def undefineObject(name: String): Unit = js.native
    
    /** Whether this console is currently being displayed to the player. */
    var visible: Boolean = js.native
  }
  
  /**
    * Specifies options for creating a console.
    */
  trait ConsoleOptions
    extends StObject
       with JobOptions {
    
    /**
      * The hotkey the player can use to display the console, or `null` to disable keyboard
      * activation.
      * @default null
      */
    var hotKey: js.UndefOr[Key | Null] = js.undefined
    
    /**
      * SphereFS path of a file to which all console output will be written, or `null` to disable
      * logging.
      * @default null
      */
    var logFileName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The mouse button the player can use to display the console, or `null` to disable mouse
      * activation.
      * @default null
      */
    var mouseKey: js.UndefOr[MouseKey | Null] = js.undefined
    
    /**
      * Text to show next to the command prompt at the top of the console.
      * @default "$"
      */
    var prompt: js.UndefOr[String] = js.undefined
  }
  object ConsoleOptions {
    
    inline def apply(): ConsoleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleOptions]
    }
    
    extension [Self <: ConsoleOptions](x: Self) {
      
      inline def setHotKey(value: Key): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
      
      inline def setHotKeyNull: Self = StObject.set(x, "hotKey", null)
      
      inline def setHotKeyUndefined: Self = StObject.set(x, "hotKey", js.undefined)
      
      inline def setLogFileName(value: String): Self = StObject.set(x, "logFileName", value.asInstanceOf[js.Any])
      
      inline def setLogFileNameNull: Self = StObject.set(x, "logFileName", null)
      
      inline def setLogFileNameUndefined: Self = StObject.set(x, "logFileName", js.undefined)
      
      inline def setMouseKey(value: MouseKey): Self = StObject.set(x, "mouseKey", value.asInstanceOf[js.Any])
      
      inline def setMouseKeyNull: Self = StObject.set(x, "mouseKey", null)
      
      inline def setMouseKeyUndefined: Self = StObject.set(x, "mouseKey", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    }
  }
}
