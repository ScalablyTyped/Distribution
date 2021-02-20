package typings.sentryUtils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@sentry/utils/dist/error", "SentryError")
  @js.native
  class SentryError protected () extends Error {
    def this(message: String) = this()
  }
}
