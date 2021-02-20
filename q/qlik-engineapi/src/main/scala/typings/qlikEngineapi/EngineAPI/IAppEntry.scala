package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AppEntry...
  */
@js.native
trait IAppEntry extends StObject {
  
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
  implicit class IAppEntryMutableBuilder[Self <: IAppEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQID(value: String): Self = StObject.set(x, "qID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReadOnly(value: Boolean): Self = StObject.set(x, "qReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQThumbnail(value: IStaticContentUrl): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
