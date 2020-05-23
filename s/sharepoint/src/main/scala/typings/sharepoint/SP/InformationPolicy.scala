package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.InformationPolicy")
@js.native
object InformationPolicy extends js.Object {
  @js.native
  trait ProjectPolicy extends ClientObject {
    def get_description(): String = js.native
    def get_emailBody(): String = js.native
    def get_emailBodyWithTeamMailbox(): String = js.native
    def get_emailSubject(): String = js.native
    def get_name(): String = js.native
    def savePolicy(): Unit = js.native
    def set_emailBody(value: String): String = js.native
    def set_emailBodyWithTeamMailbox(value: String): String = js.native
    def set_emailSubject(value: String): String = js.native
  }
  
}

