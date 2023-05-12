package typings.runApplescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("run-applescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runAppleScript(script: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAppleScript")(script.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def runAppleScript(script: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAppleScript")(script.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def runAppleScriptSync(script: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("runAppleScriptSync")(script.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def runAppleScriptSync(script: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("runAppleScriptSync")(script.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Change the output style.
    	When `false`, returns the value in a [recompilable source form](https://ss64.com/osx/osascript.html).
    	@default true
    	@example
    	```
    	import {runAppleScript} from 'run-applescript';
    	const result = await runAppleScript('return "unicorn"', {humanReadableOutput: false});
    	console.log(result);
    	//=> '"unicorn"'
    	```
    	*/
    val humanReadableOutput: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHumanReadableOutput(value: Boolean): Self = StObject.set(x, "humanReadableOutput", value.asInstanceOf[js.Any])
      
      inline def setHumanReadableOutputUndefined: Self = StObject.set(x, "humanReadableOutput", js.undefined)
    }
  }
}
