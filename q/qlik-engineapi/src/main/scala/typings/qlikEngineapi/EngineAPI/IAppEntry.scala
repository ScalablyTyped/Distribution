package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AppEntry...
  */
trait IAppEntry extends StObject {
  
  /**
    * Identifier of the app.
    */
  var qID: String
  
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String
  
  /**
    * Meta data.
    */
  var qMeta: INxMeta
  
  /**
    * Path of the app.
    */
  var qPath: String
  
  /**
    * Is set to true if the app is read-only.
    */
  var qReadOnly: Boolean
  
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl
  
  /**
    * Title of the app.
    */
  var qTitle: String
}
object IAppEntry {
  
  inline def apply(
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
  
  extension [Self <: IAppEntry](x: Self) {
    
    inline def setQID(value: String): Self = StObject.set(x, "qID", value.asInstanceOf[js.Any])
    
    inline def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    inline def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    inline def setQReadOnly(value: Boolean): Self = StObject.set(x, "qReadOnly", value.asInstanceOf[js.Any])
    
    inline def setQThumbnail(value: IStaticContentUrl): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    inline def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
