package typings.sentryUtils

import typings.sentryTypes.dsnMod.DsnComponents
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryTypes.dsnMod.DsnProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dsnMod {
  
  @JSImport("@sentry/utils/dist/dsn", "Dsn")
  @js.native
  class Dsn protected ()
    extends StObject
       with DsnComponents {
    /** Creates a new Dsn component */
    def this(from: DsnLike) = this()
    
    /** Maps Dsn components into this instance. */
    /* private */ var _fromComponents: js.Any = js.native
    
    /** Parses a string into this Dsn. */
    /* private */ var _fromString: js.Any = js.native
    
    /** Validates this Dsn and throws on error. */
    /* private */ var _validate: js.Any = js.native
    
    /** Hostname of the Sentry instance. */
    /* CompleteClass */
    var host: String = js.native
    
    /** Private authorization key (deprecated, optional). */
    @JSName("pass")
    var pass_Dsn: String = js.native
    
    /** Path */
    @JSName("path")
    var path_Dsn: String = js.native
    
    /** Port of the Sentry instance. */
    @JSName("port")
    var port_Dsn: String = js.native
    
    /** Project ID */
    /* CompleteClass */
    var projectId: String = js.native
    
    /** Protocol used to connect to Sentry. */
    /* CompleteClass */
    var protocol: DsnProtocol = js.native
    
    def toString(withPassword: Boolean): String = js.native
    
    /** Public authorization key. */
    /* CompleteClass */
    var user: String = js.native
  }
}
