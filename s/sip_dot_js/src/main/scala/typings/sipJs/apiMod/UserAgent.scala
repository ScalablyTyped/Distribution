package typings.sipJs.apiMod

import typings.sipJs.anon.PartialUserAgentOptions
import typings.sipJs.coreMod.URI
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
  extends typings.sipJs.userAgentMod.UserAgent {
  def this(options: PartialUserAgentOptions) = this()
}

/* static members */
@JSImport("sip.js/lib/api", "UserAgent")
@js.native
object UserAgent extends js.Object {
  /** Default user agent options. */
  val defaultOptions: js.Any = js.native
  /**
    * Strip properties with undefined values from options.
    * This is a work around while waiting for missing vs undefined to be addressed (or not)...
    * https://github.com/Microsoft/TypeScript/issues/13195
    * @param options - Options to reduce
    */
  var stripUndefinedProperties: js.Any = js.native
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
}

