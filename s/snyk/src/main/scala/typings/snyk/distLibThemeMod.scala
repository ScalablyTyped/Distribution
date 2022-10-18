package typings.snyk

import typings.snyk.anon.Critical
import typings.snyk.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibThemeMod {
  
  object color {
    
    @JSImport("snyk/dist/lib/theme", "color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/theme", "color.severity")
    @js.native
    def severity: Critical = js.native
    inline def severity_=(x: Critical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("severity")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/theme", "color.status")
    @js.native
    def status: Error = js.native
    inline def status_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
  }
  
  object icon {
    
    @JSImport("snyk/dist/lib/theme", "icon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/theme", "icon.INFO")
    @js.native
    def INFO: String = js.native
    inline def INFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/theme", "icon.ISSUE")
    @js.native
    def ISSUE: String = js.native
    inline def ISSUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISSUE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/theme", "icon.RUN")
    @js.native
    def RUN: String = js.native
    inline def RUN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUN")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/theme", "icon.VALID")
    @js.native
    def VALID: String = js.native
    inline def VALID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALID")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/theme", "icon.WARNING")
    @js.native
    def WARNING: String = js.native
    inline def WARNING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
}
