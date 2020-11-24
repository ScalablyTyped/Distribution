package typings.pulumiAws.baiduChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaiduChannelArgs extends js.Object {
  
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: Input[String] = js.native
  
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: Input[String] = js.native
}
object BaiduChannelArgs {
  
  @scala.inline
  def apply(apiKey: Input[String], applicationId: Input[String], secretKey: Input[String]): BaiduChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaiduChannelArgs]
  }
  
  @scala.inline
  implicit class BaiduChannelArgsOps[Self <: BaiduChannelArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKey(value: Input[String]): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: Input[String]): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
