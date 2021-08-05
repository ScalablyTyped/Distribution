package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAppProperties
  */
trait INxAppProperties extends StObject {
  
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String
  
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: String
  
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: String
  
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef
  
  /**
    * App title.
    */
  var qTitle: String
}
object INxAppProperties {
  
  inline def apply(
    qLastReloadTime: String,
    qMigrationHash: String,
    qSavedInProductVersion: String,
    qThumbnail: IStaticContentUrlDef,
    qTitle: String
  ): INxAppProperties = {
    val __obj = js.Dynamic.literal(qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMigrationHash = qMigrationHash.asInstanceOf[js.Any], qSavedInProductVersion = qSavedInProductVersion.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppProperties]
  }
  
  extension [Self <: INxAppProperties](x: Self) {
    
    inline def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    inline def setQMigrationHash(value: String): Self = StObject.set(x, "qMigrationHash", value.asInstanceOf[js.Any])
    
    inline def setQSavedInProductVersion(value: String): Self = StObject.set(x, "qSavedInProductVersion", value.asInstanceOf[js.Any])
    
    inline def setQThumbnail(value: IStaticContentUrlDef): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    inline def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
