package typings.sentryUtils

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @js.native
  class SentryError protected () extends Error {
    def this(message: String) = this()
  }
}
