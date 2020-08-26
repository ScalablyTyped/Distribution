package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContentLibraryListItem...
  */
@js.native
trait IContentLibraryListItem extends js.Object {
  /**
    * Is set to true if the library is specific to the app (not a global content library).
    */
  var qAppSpecific: Boolean = js.native
  /**
    * Information about publishing and permissions.
    */
  var qMeta: INxMeta = js.native
  /**
    * Name of the library.
    */
  var qName: String = js.native
}

object IContentLibraryListItem {
  @scala.inline
  def apply(qAppSpecific: Boolean, qMeta: INxMeta, qName: String): IContentLibraryListItem = {
    val __obj = js.Dynamic.literal(qAppSpecific = qAppSpecific.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLibraryListItem]
  }
  @scala.inline
  implicit class IContentLibraryListItemOps[Self <: IContentLibraryListItem] (val x: Self) extends AnyVal {
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
    def setQAppSpecific(value: Boolean): Self = this.set("qAppSpecific", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeta(value: INxMeta): Self = this.set("qMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
  
}

