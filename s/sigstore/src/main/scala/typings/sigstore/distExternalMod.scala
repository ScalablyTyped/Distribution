package typings.sigstore

import typings.sigstore.distExternalErrorMod.Response
import typings.sigstore.distExternalFulcioMod.FulcioOptions
import typings.sigstore.distExternalRekorMod.RekorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExternalMod {
  
  @JSImport("sigstore/dist/external", "Fulcio")
  @js.native
  open class Fulcio protected ()
    extends typings.sigstore.distExternalFulcioMod.Fulcio {
    def this(options: FulcioOptions) = this()
  }
  
  @JSImport("sigstore/dist/external", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends typings.sigstore.distExternalErrorMod.HTTPError {
    def this(response: Response) = this()
  }
  
  @JSImport("sigstore/dist/external", "Rekor")
  @js.native
  open class Rekor protected ()
    extends typings.sigstore.distExternalRekorMod.Rekor {
    def this(options: RekorOptions) = this()
  }
}
