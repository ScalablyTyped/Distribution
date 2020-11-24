package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StaticContentUrl...
  *
  * Note: In addition, this structure can return dynamic properties.
  */
@js.native
trait IStaticContentUrl extends js.Object {
  
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: String = js.native
}
object IStaticContentUrl {
  
  @scala.inline
  def apply(qUrl: String): IStaticContentUrl = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentUrl]
  }
  
  @scala.inline
  implicit class IStaticContentUrlOps[Self <: IStaticContentUrl] (val x: Self) extends AnyVal {
    
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
    def setQUrl(value: String): Self = this.set("qUrl", value.asInstanceOf[js.Any])
  }
}
