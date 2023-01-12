package typings.storybookTelemetry

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9SanitizeMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanPaths(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPaths")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cleanPaths(str: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanPaths")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sanitizeError(error: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeError(error: js.Error, pathSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(error.asInstanceOf[js.Any], pathSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IErrorWithStdErrAndStdOut
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var stderr: js.UndefOr[Buffer | String] = js.undefined
    
    var stdout: js.UndefOr[Buffer | String] = js.undefined
  }
  object IErrorWithStdErrAndStdOut {
    
    inline def apply(): IErrorWithStdErrAndStdOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IErrorWithStdErrAndStdOut]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IErrorWithStdErrAndStdOut] (val x: Self) extends AnyVal {
      
      inline def setStderr(value: Buffer | String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Buffer | String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
