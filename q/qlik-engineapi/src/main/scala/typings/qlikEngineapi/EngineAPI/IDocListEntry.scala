package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DocListEntry...
  */
trait IDocListEntry extends StObject {
  
  /**
    * Not used.
    */
  var qConnectedUsers: Double
  
  /**
    * Identifier of the app.
    *
    * - In Qlik Sense Desktop, the identifier is the path and name of the app
    * - In Qlik Sense Enterprise, the identifier is the app's GUID.
    */
  var qDocId: String
  
  /**
    * Name of the app.
    */
  var qDocName: String
  
  /**
    * Size of remote app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileSize: Double
  
  /**
    * Last modified time stamp of the app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileTime: Double
  
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String
  
  /**
    * Meta data related to the app.
    */
  var qMeta: INxMeta
  
  /**
    * If set to true, the app is read-only.
    */
  var qReadOnly: Boolean
  
  /**
    * Thumbnail of the app.
    */
  var qThumbnail: IStaticContentUrl
  
  /**
    * Title of the app.
    */
  var qTitle: String
}
object IDocListEntry {
  
  inline def apply(
    qConnectedUsers: Double,
    qDocId: String,
    qDocName: String,
    qFileSize: Double,
    qFileTime: Double,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IDocListEntry = {
    val __obj = js.Dynamic.literal(qConnectedUsers = qConnectedUsers.asInstanceOf[js.Any], qDocId = qDocId.asInstanceOf[js.Any], qDocName = qDocName.asInstanceOf[js.Any], qFileSize = qFileSize.asInstanceOf[js.Any], qFileTime = qFileTime.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocListEntry]
  }
  
  extension [Self <: IDocListEntry](x: Self) {
    
    inline def setQConnectedUsers(value: Double): Self = StObject.set(x, "qConnectedUsers", value.asInstanceOf[js.Any])
    
    inline def setQDocId(value: String): Self = StObject.set(x, "qDocId", value.asInstanceOf[js.Any])
    
    inline def setQDocName(value: String): Self = StObject.set(x, "qDocName", value.asInstanceOf[js.Any])
    
    inline def setQFileSize(value: Double): Self = StObject.set(x, "qFileSize", value.asInstanceOf[js.Any])
    
    inline def setQFileTime(value: Double): Self = StObject.set(x, "qFileTime", value.asInstanceOf[js.Any])
    
    inline def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    inline def setQReadOnly(value: Boolean): Self = StObject.set(x, "qReadOnly", value.asInstanceOf[js.Any])
    
    inline def setQThumbnail(value: IStaticContentUrl): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    inline def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
