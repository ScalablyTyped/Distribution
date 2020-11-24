package typings.pulumiAws.outputMod.config

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssumeRole extends js.Object {
  
  var durationSeconds: js.UndefOr[Double] = js.native
  
  var externalId: js.UndefOr[String] = js.native
  
  var policy: js.UndefOr[String] = js.native
  
  var policyArns: js.UndefOr[js.Array[String]] = js.native
  
  var roleArn: js.UndefOr[String] = js.native
  
  var sessionName: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var transitiveTagKeys: js.UndefOr[js.Array[String]] = js.native
}
object AssumeRole {
  
  @scala.inline
  def apply(): AssumeRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRole]
  }
  
  @scala.inline
  implicit class AssumeRoleOps[Self <: AssumeRole] (val x: Self) extends AnyVal {
    
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
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setPolicyArnsVarargs(value: String*): Self = this.set("policyArns", js.Array(value :_*))
    
    @scala.inline
    def setPolicyArns(value: js.Array[String]): Self = this.set("policyArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyArns: Self = this.set("policyArns", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setSessionName(value: String): Self = this.set("sessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionName: Self = this.set("sessionName", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransitiveTagKeysVarargs(value: String*): Self = this.set("transitiveTagKeys", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveTagKeys(value: js.Array[String]): Self = this.set("transitiveTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitiveTagKeys: Self = this.set("transitiveTagKeys", js.undefined)
  }
}
