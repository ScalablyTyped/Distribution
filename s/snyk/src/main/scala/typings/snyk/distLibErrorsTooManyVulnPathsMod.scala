package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsTooManyVulnPathsMod {
  
  @JSImport("snyk/dist/lib/errors/too-many-vuln-paths", "TooManyVulnPaths")
  @js.native
  open class TooManyVulnPaths () extends CustomError
  /* static members */
  object TooManyVulnPaths {
    
    @JSImport("snyk/dist/lib/errors/too-many-vuln-paths", "TooManyVulnPaths")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/too-many-vuln-paths", "TooManyVulnPaths.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/too-many-vuln-paths", "TooManyVulnPaths.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/too-many-vuln-paths", "TooManyVulnPaths.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
}
