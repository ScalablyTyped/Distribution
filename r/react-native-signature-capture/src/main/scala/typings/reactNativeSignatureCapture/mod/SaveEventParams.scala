package typings.reactNativeSignatureCapture.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveEventParams extends js.Object {
  
  /**
    * The base64 encoded png
    */
  var encoded: String = js.native
  
  /**
    * The file path name
    */
  var pathName: String = js.native
}
object SaveEventParams {
  
  @scala.inline
  def apply(encoded: String, pathName: String): SaveEventParams = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveEventParams]
  }
  
  @scala.inline
  implicit class SaveEventParamsOps[Self <: SaveEventParams] (val x: Self) extends AnyVal {
    
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
    def setEncoded(value: String): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathName(value: String): Self = this.set("pathName", value.asInstanceOf[js.Any])
  }
}
