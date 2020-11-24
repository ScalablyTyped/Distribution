package typings.sentryUtils

import typings.sentryTypes.dsnMod.DsnComponents
import typings.sentryTypes.dsnMod.DsnLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/dsn", JSImport.Namespace)
@js.native
object dsnMod extends js.Object {
  
  @js.native
  class Dsn protected () extends DsnComponents {
    /** Creates a new Dsn component */
    def this(from: DsnLike) = this()
    
    /** Maps Dsn components into this instance. */
    var _fromComponents: js.Any = js.native
    
    /** Parses a string into this Dsn. */
    var _fromString: js.Any = js.native
    
    /** Validates this Dsn and throws on error. */
    var _validate: js.Any = js.native
    
    /** Private authorization key (deprecated, optional). */
    @JSName("pass")
    var pass_Dsn: String = js.native
    
    /** Path */
    @JSName("path")
    var path_Dsn: String = js.native
    
    /** Port of the Sentry instance. */
    @JSName("port")
    var port_Dsn: String = js.native
    
    def toString(withPassword: Boolean): String = js.native
  }
}
