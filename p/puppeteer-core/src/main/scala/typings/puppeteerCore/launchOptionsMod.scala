package typings.puppeteerCore

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launchOptionsMod {
  
  trait ChromeArgOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object ChromeArgOptions {
    
    @scala.inline
    def apply(): ChromeArgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeArgOptions]
    }
    
    @scala.inline
    implicit class ChromeArgOptionsMutableBuilder[Self <: ChromeArgOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      @scala.inline
      def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
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
    
    @scala.inline
    def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit class LaunchOptionsMutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
      
      @scala.inline
      def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      @scala.inline
      def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
      
      @scala.inline
      def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      @scala.inline
      def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
      
      @scala.inline
      def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
      
      @scala.inline
      def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value :_*))
      
      @scala.inline
      def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
