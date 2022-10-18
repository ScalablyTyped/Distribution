package typings.sipJs.mod

import typings.sipJs.anon.PartialUserAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "UserAgent")
@js.native
/**
  * Constructs a new instance of the `UserAgent` class.
  * @param options - Options bucket. See {@link UserAgentOptions} for details.
  */
open class UserAgent ()
  extends typings.sipJs.libApiMod.UserAgent {
  def this(options: PartialUserAgentOptions) = this()
}
/* static members */
object UserAgent {
  
  @JSImport("sip.js", "UserAgent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default user agent options. */
  @JSImport("sip.js", "UserAgent.defaultOptions")
  @js.native
  def defaultOptions: Any = js.native
  inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Create a URI instance from a string.
    * @param uri - The string to parse.
    *
    * @example
    * ```ts
    * const uri = UserAgent.makeURI("sip:edgar@example.com");
    * ```
    */
  inline def makeURI(uri: String): js.UndefOr[typings.sipJs.libCoreMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.libCoreMod.URI]]
  
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  @JSImport("sip.js", "UserAgent.stripUndefinedProperties")
  @js.native
  def stripUndefinedProperties: Any = js.native
  inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
}
