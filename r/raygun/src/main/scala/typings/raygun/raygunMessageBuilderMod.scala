package typings.raygun

import typings.raygun.typesMod.CustomData
import typings.raygun.typesMod.Message
import typings.raygun.typesMod.MessageBuilderOptions
import typings.raygun.typesMod.MessageBuilding
import typings.raygun.typesMod.RawUserData
import typings.raygun.typesMod.RequestParams
import typings.raygun.typesMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun/build/raygun.messageBuilder", JSImport.Namespace)
@js.native
object raygunMessageBuilderMod extends js.Object {
  @js.native
  class RaygunMessageBuilder () extends js.Object {
    def this(options: MessageBuilderOptions) = this()
    var _filters: js.Array[String] = js.native
    var extractUserProperties: js.Any = js.native
    var message: MessageBuilding = js.native
    var options: MessageBuilderOptions = js.native
    def build(): Message = js.native
    def setEnvironmentDetails(): this.type = js.native
    def setErrorDetails(error: js.Any): this.type = js.native
    def setMachineName(): this.type = js.native
    def setMachineName(machineName: String): this.type = js.native
    def setRequestDetails(): this.type = js.native
    def setRequestDetails(request: RequestParams): this.type = js.native
    def setTags(tags: js.Array[Tag]): this.type = js.native
    def setUser(user: js.Function0[UserMessageData]): this.type = js.native
    def setUser(user: UserMessageData): this.type = js.native
    def setUserCustomData(): this.type = js.native
    def setUserCustomData(customData: CustomData): this.type = js.native
    def setVersion(version: String): this.type = js.native
  }
  
  type UserMessageData = js.UndefOr[RawUserData | String]
}

