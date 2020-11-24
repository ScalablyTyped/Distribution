package typings.radius.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/retailnext/node-radius#radiusencodeargs} for more info.
  **/
@js.native
trait EncodeArgs extends js.Object {
  
  var add_message_authenticator: js.UndefOr[Boolean] = js.native
  
  /**
    * This can be an object: { attribute_name: attribute_value, ... }, 
    * an array within an array: [ [ attribute_name, attribute_value ], ... ],
    * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
    * 
    * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
    **/
  var attributes: js.UndefOr[js.Any] = js.native
  
  var code: String = js.native
  
  var identifier: js.UndefOr[Double] = js.native
  
  var secret: String = js.native
}
object EncodeArgs {
  
  @scala.inline
  def apply(code: String, secret: String): EncodeArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeArgs]
  }
  
  @scala.inline
  implicit class EncodeArgsOps[Self <: EncodeArgs] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd_message_authenticator(value: Boolean): Self = this.set("add_message_authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd_message_authenticator: Self = this.set("add_message_authenticator", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
}
