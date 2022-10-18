package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliExitCodesMod {
  
  object EXIT_CODES {
    
    @JSImport("snyk/dist/cli/exit-codes", "EXIT_CODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/cli/exit-codes", "EXIT_CODES.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/cli/exit-codes", "EXIT_CODES.NO_SUPPORTED_PROJECTS_DETECTED")
    @js.native
    def NO_SUPPORTED_PROJECTS_DETECTED: Double = js.native
    inline def NO_SUPPORTED_PROJECTS_DETECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_SUPPORTED_PROJECTS_DETECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/cli/exit-codes", "EXIT_CODES.VULNS_FOUND")
    @js.native
    def VULNS_FOUND: Double = js.native
    inline def VULNS_FOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VULNS_FOUND")(x.asInstanceOf[js.Any])
  }
}
