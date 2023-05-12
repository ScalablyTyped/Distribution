package typings.remixRunWebFetch

import typings.remixRunWebFetch.distSrcErrorsBaseMod.FetchBaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsAbortErrorMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/errors/abort-error", "AbortError")
  @js.native
  open class AbortError protected () extends FetchBaseError {
    /**
      * @param {string} message
      * @param {string} [type]
      */
    def this(message: String) = this()
    def this(message: String, `type`: String) = this()
  }
}
