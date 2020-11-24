package typings.pulumiAws.inputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretSecret extends js.Object {
  
  var context: js.UndefOr[StringDictionary[String]] = js.native
  
  var grantTokens: js.UndefOr[js.Array[String]] = js.native
  
  var name: String = js.native
  
  var payload: String = js.native
}
object GetSecretSecret {
  
  @scala.inline
  def apply(name: String, payload: String): GetSecretSecret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretSecret]
  }
  
  @scala.inline
  implicit class GetSecretSecretOps[Self <: GetSecretSecret] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: StringDictionary[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setGrantTokensVarargs(value: String*): Self = this.set("grantTokens", js.Array(value :_*))
    
    @scala.inline
    def setGrantTokens(value: js.Array[String]): Self = this.set("grantTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantTokens: Self = this.set("grantTokens", js.undefined)
  }
}
