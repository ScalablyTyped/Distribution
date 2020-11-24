package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the media files. Is the layout for MediaListDef.
  *
  * Note: This struct is deprecated.
  */
@js.native
trait IMediaList extends js.Object {
  
  /**
    * Information about the list of media files.
    * In Qlik Sense Desktop, the media files are retrieved from:
    *
    * %userprofile%\Documents\Qlik\Sense\Content\Default
    * In Qlik Sense Enterprise, the media files are retrieved from:
    *
    * <installation_directory>\Qlik\Sense\Repository\Content\Default
    * The default installation directory is ProgramData.
    */
  var qItems: js.Array[IMediaListItem] = js.native
}
object IMediaList {
  
  @scala.inline
  def apply(qItems: js.Array[IMediaListItem]): IMediaList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaList]
  }
  
  @scala.inline
  implicit class IMediaListOps[Self <: IMediaList] (val x: Self) extends AnyVal {
    
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
    def setQItemsVarargs(value: IMediaListItem*): Self = this.set("qItems", js.Array(value :_*))
    
    @scala.inline
    def setQItems(value: js.Array[IMediaListItem]): Self = this.set("qItems", value.asInstanceOf[js.Any])
  }
}
