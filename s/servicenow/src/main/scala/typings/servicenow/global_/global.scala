package typings.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global")
@js.native
object global extends js.Object {
  @js.native
  class Workflow ()
    extends typings.servicenow.global.Workflow
  
  @js.native
  object Class extends js.Object {
    def create(): js.Any = js.native
  }
  
  @js.native
  object GlideStringUtil extends js.Object {
    def base64Decode(value: String): String = js.native
    def base64DecodeAsBytes(value: String): js.Any = js.native
    def escapeHTML(value: String): String = js.native
    def getStringFromStream(stream: js.Object): String = js.native
  }
  
}

