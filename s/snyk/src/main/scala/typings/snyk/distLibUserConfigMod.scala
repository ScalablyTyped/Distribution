package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUserConfigMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("snyk/dist/lib/user-config", "ConfigStoreWithEnvironmentVariables")
  @js.native
  open class ConfigStoreWithEnvironmentVariables protected () extends StObject {
    def this(id: Any) = this()
    def this(id: Any, defaults: Unit, options: js.Object) = this()
    
    def get(key: String): js.UndefOr[String] = js.native
  }
  
  @JSImport("snyk/dist/lib/user-config", "config")
  @js.native
  val config: ConfigStoreWithEnvironmentVariables = js.native
}
