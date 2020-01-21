package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/content-type-unsupported", JSImport.Namespace)
@js.native
object contentTypeUnsupportedMod extends js.Object {
  @js.native
  class ContentTypeUnsupportedError () extends Exception {
    def this(message: String) = this()
  }
  
}

