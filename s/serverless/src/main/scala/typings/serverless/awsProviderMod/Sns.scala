package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sns extends js.Object {
  
  var arn: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var filterPolicy: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.native
  
  var redrivePolicy: js.UndefOr[RedrivePolicy] = js.native
  
  var topicName: js.UndefOr[String] = js.native
}
object Sns {
  
  @scala.inline
  def apply(): Sns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sns]
  }
  
  @scala.inline
  implicit class SnsOps[Self <: Sns] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFilterPolicyVarargs(value: String*): Self = this.set("filterPolicy", js.Array(value :_*))
    
    @scala.inline
    def setFilterPolicy(value: js.Array[String] | StringDictionary[String]): Self = this.set("filterPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPolicy: Self = this.set("filterPolicy", js.undefined)
    
    @scala.inline
    def setRedrivePolicy(value: RedrivePolicy): Self = this.set("redrivePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedrivePolicy: Self = this.set("redrivePolicy", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
