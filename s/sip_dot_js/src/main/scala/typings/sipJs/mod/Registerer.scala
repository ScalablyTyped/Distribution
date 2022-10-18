package typings.sipJs.mod

import typings.sipJs.libApiRegistererOptionsMod.RegistererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Registerer")
@js.native
open class Registerer protected ()
  extends typings.sipJs.libApiMod.Registerer {
  /**
    * Constructs a new instance of the `Registerer` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param options - Options bucket. See {@link RegistererOptions} for details.
    */
  def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent) = this()
  def this(userAgent: typings.sipJs.libApiUserAgentMod.UserAgent, options: RegistererOptions) = this()
}
/* static members */
object Registerer {
  
  @JSImport("sip.js", "Registerer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Registerer.defaultExpires")
  @js.native
  val defaultExpires: Any = js.native
  
  /** Default registerer options. */
  @JSImport("sip.js", "Registerer.defaultOptions")
  @js.native
  def defaultOptions: Any = js.native
  inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("sip.js", "Registerer.defaultRefreshFrequency")
  @js.native
  val defaultRefreshFrequency: Any = js.native
  
  @JSImport("sip.js", "Registerer.newUUID")
  @js.native
  def newUUID: Any = js.native
  inline def newUUID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  @JSImport("sip.js", "Registerer.stripUndefinedProperties")
  @js.native
  def stripUndefinedProperties: Any = js.native
  inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
}
