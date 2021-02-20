package typings.sipJs.mod

import typings.sipJs.registererOptionsMod.RegistererOptions
import org.scalablytyped.runtime.StObject
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
object Registerer {
  
  @JSImport("sip.js", "Registerer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Registerer.defaultExpires")
  @js.native
  val defaultExpires: js.Any = js.native
  
  /** Default registerer options. */
  @JSImport("sip.js", "Registerer.defaultOptions")
  @js.native
  def defaultOptions: js.Any = js.native
  @scala.inline
  def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("sip.js", "Registerer.newUUID")
  @js.native
  def newUUID: js.Any = js.native
  @scala.inline
  def newUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  @JSImport("sip.js", "Registerer.stripUndefinedProperties")
  @js.native
  def stripUndefinedProperties: js.Any = js.native
  @scala.inline
  def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
}
