package typings.sipDotJs.libApiMod

import typings.sipDotJs.libApiUserDashAgentDashOptionsMod.UserAgentOptions
import typings.sipDotJs.libCoreMod.URI
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "UserAgent")
@js.native
/**
  * Constructs a new instance of the `UserAgent` class.
  * @param options - Options bucket. See {@link UserAgentOptions} for details.
  */
class UserAgent ()
  extends typings.sipDotJs.libApiUserDashAgentMod.UserAgent {
  def this(options: Partial[UserAgentOptions]) = this()
}

/* static members */
@JSImport("sip.js/lib/api", "UserAgent")
@js.native
object UserAgent extends js.Object {
  /** Default user agent options. */
  val defaultOptions: js.Any = js.native
  /**
    * Create a URI instance from a string.
    * @param uri - The string to parse.
    *
    * @example
    * ```ts
    * const uri = UserAgent.makeURI("sip:edgar@example.com");
    * ```
    */
  def makeURI(uri: String): js.UndefOr[URI] = js.native
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  /* protected */ def stripUndefinedProperties(options: Partial[UserAgentOptions]): Partial[UserAgentOptions] = js.native
}

