package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AppEntry...
  */
@js.native
trait IAppEntry extends js.Object {
  
  /**
    * Identifier of the app.
    */
  var qID: String = js.native
  
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  
  /**
    * Meta data.
    */
  var qMeta: INxMeta = js.native
  
  /**
    * Path of the app.
    */
  var qPath: String = js.native
  
  /**
    * Is set to true if the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl = js.native
  
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}
object IAppEntry {
  
  @scala.inline
  def apply(
    qID: String,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qPath: String,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IAppEntry = {
    val __obj = js.Dynamic.literal(qID = qID.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppEntry]
  }
  
  @scala.inline
  implicit class IAppEntryOps[Self <: IAppEntry] (val x: Self) extends AnyVal {
    
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
    def setQID(value: String): Self = this.set("qID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastReloadTime(value: String): Self = this.set("qLastReloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = this.set("qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = this.set("qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReadOnly(value: Boolean): Self = this.set("qReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQThumbnail(value: IStaticContentUrl): Self = this.set("qThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTitle(value: String): Self = this.set("qTitle", value.asInstanceOf[js.Any])
  }
}
