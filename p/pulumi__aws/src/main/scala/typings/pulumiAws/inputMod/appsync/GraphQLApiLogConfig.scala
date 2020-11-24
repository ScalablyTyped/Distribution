package typings.pulumiAws.inputMod.appsync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLApiLogConfig extends js.Object {
  
  /**
    * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
    */
  var cloudwatchLogsRoleArn: Input[String] = js.native
  
  /**
    * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging  level. Valid values: `true`, `false`. Default value: `false`
    */
  var excludeVerboseContent: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
    */
  var fieldLogLevel: Input[String] = js.native
}
object GraphQLApiLogConfig {
  
  @scala.inline
  def apply(cloudwatchLogsRoleArn: Input[String], fieldLogLevel: Input[String]): GraphQLApiLogConfig = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiLogConfig]
  }
  
  @scala.inline
  implicit class GraphQLApiLogConfigOps[Self <: GraphQLApiLogConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLogsRoleArn(value: Input[String]): Self = this.set("cloudwatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLogLevel(value: Input[String]): Self = this.set("fieldLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVerboseContent(value: Input[Boolean]): Self = this.set("excludeVerboseContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeVerboseContent: Self = this.set("excludeVerboseContent", js.undefined)
  }
}
