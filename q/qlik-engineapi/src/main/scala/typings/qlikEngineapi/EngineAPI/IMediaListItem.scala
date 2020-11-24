package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MediaListItem...
  */
@js.native
trait IMediaListItem extends js.Object {
  
  /**
    * Relative path to the media file.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrl: String = js.native
  
  /**
    * Relative path to the media file.
    * The URL is static.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: String = js.native
}
object IMediaListItem {
  
  @scala.inline
  def apply(qUrl: String, qUrlDef: String): IMediaListItem = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any], qUrlDef = qUrlDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaListItem]
  }
  
  @scala.inline
  implicit class IMediaListItemOps[Self <: IMediaListItem] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setQUrlDef(value: String): Self = this.set("qUrlDef", value.asInstanceOf[js.Any])
  }
}
