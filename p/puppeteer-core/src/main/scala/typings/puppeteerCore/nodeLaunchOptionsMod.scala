package typings.puppeteerCore

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeLaunchOptionsMod {
  
  trait ChromeArgOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object ChromeArgOptions {
    
    inline def apply(): ChromeArgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeArgOptions]
    }
    
    extension [Self <: ChromeArgOptions](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  trait LaunchOptions extends StObject {
    
    var dumpio: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
    
    var executablePath: js.UndefOr[String] = js.undefined
    
    var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    var pipe: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    extension [Self <: LaunchOptions](x: Self) {
      
      inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
      
      inline def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
      
      inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
      
      inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
      
      inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
      
      inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
