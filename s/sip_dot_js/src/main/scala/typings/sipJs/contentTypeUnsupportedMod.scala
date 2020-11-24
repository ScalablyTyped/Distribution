package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/exceptions/content-type-unsupported", JSImport.Namespace)
@js.native
object contentTypeUnsupportedMod extends js.Object {
  
  @js.native
  class ContentTypeUnsupportedError () extends Exception {
    def this(message: String) = this()
  }
}
