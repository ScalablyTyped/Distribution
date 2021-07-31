package typings.sipJs

import typings.sipJs.coreMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentTypeUnsupportedMod {
  
  @JSImport("sip.js/lib/api/exceptions/content-type-unsupported", "ContentTypeUnsupportedError")
  @js.native
  class ContentTypeUnsupportedError () extends Exception {
    def this(message: String) = this()
  }
}
