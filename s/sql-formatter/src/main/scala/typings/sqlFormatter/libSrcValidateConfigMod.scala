package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcValidateConfigMod {
  
  @JSImport("sql-formatter/lib/src/validateConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql-formatter/lib/src/validateConfig", "ConfigError")
  @js.native
  open class ConfigError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def validateConfig(cfg: FormatOptions): FormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(cfg.asInstanceOf[js.Any]).asInstanceOf[FormatOptions]
}
