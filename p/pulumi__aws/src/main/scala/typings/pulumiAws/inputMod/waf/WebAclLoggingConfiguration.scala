package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfiguration extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
    */
  var logDestination: Input[String] = js.native
  
  /**
    * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
    */
  var redactedFields: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFields]] = js.native
}
object WebAclLoggingConfiguration {
  
  @scala.inline
  def apply(logDestination: Input[String]): WebAclLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfiguration]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationOps[Self <: WebAclLoggingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLogDestination(value: Input[String]): Self = this.set("logDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedFields(value: Input[WebAclLoggingConfigurationRedactedFields]): Self = this.set("redactedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedactedFields: Self = this.set("redactedFields", js.undefined)
  }
}
