package typings.sipJs.mod

import typings.sipJs.registererOptionsMod.RegistererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Registerer")
@js.native
class Registerer protected ()
  extends typings.sipJs.apiMod.Registerer {
  /**
    * Constructs a new instance of the `Registerer` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param options - Options bucket. See {@link RegistererOptions} for details.
    */
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
  def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: RegistererOptions) = this()
}
/* static members */
@JSImport("sip.js", "Registerer")
@js.native
object Registerer extends js.Object {
  
  val defaultExpires: js.Any = js.native
  
  /** Default registerer options. */
  var defaultOptions: js.Any = js.native
  
  var newUUID: js.Any = js.native
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  var stripUndefinedProperties: js.Any = js.native
}
