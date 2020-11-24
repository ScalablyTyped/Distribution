package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLApiUserPoolConfig extends js.Object {
  
  /**
    * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.native
  
  /**
    * The AWS region in which the user pool was created.
    */
  var awsRegion: String = js.native
  
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
    */
  var defaultAction: String = js.native
  
  /**
    * The user pool ID.
    */
  var userPoolId: String = js.native
}
object GraphQLApiUserPoolConfig {
  
  @scala.inline
  def apply(awsRegion: String, defaultAction: String, userPoolId: String): GraphQLApiUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiUserPoolConfig]
  }
  
  @scala.inline
  implicit class GraphQLApiUserPoolConfigOps[Self <: GraphQLApiUserPoolConfig] (val x: Self) extends AnyVal {
    
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
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAction(value: String): Self = this.set("defaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdClientRegex(value: String): Self = this.set("appIdClientRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIdClientRegex: Self = this.set("appIdClientRegex", js.undefined)
  }
}
