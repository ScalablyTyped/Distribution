package typings.pulumiAws.getParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParameterArgs extends js.Object {
  
  /**
    * The name of the parameter.
    */
  val name: String = js.native
  
  /**
    * Whether to return decrypted `SecureString` value. Defaults to `true`.
    */
  val withDecryption: js.UndefOr[Boolean] = js.native
}
object GetParameterArgs {
  
  @scala.inline
  def apply(name: String): GetParameterArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterArgs]
  }
  
  @scala.inline
  implicit class GetParameterArgsOps[Self <: GetParameterArgs] (val x: Self) extends AnyVal {
    
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
    def setWithDecryption(value: Boolean): Self = this.set("withDecryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDecryption: Self = this.set("withDecryption", js.undefined)
  }
}
