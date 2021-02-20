package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAppProperties
  */
@js.native
trait INxAppProperties extends StObject {
  
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  
  /**
    * Internal property reserved for app migration.
    * Patch version of the app.
    * Do not update.
    */
  var qMigrationHash: String = js.native
  
  /**
    * Internal property reserved for app migration.
    * The app is saved in this version of the product.
    * Do not update.
    */
  var qSavedInProductVersion: String = js.native
  
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrlDef = js.native
  
  /**
    * App title.
    */
  var qTitle: String = js.native
}
object INxAppProperties {
  
  @scala.inline
  def apply(
    qLastReloadTime: String,
    qMigrationHash: String,
    qSavedInProductVersion: String,
    qThumbnail: IStaticContentUrlDef,
    qTitle: String
  ): INxAppProperties = {
    val __obj = js.Dynamic.literal(qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMigrationHash = qMigrationHash.asInstanceOf[js.Any], qSavedInProductVersion = qSavedInProductVersion.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAppProperties]
  }
  
  @scala.inline
  implicit class INxAppPropertiesMutableBuilder[Self <: INxAppProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQLastReloadTime(value: String): Self = StObject.set(x, "qLastReloadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMigrationHash(value: String): Self = StObject.set(x, "qMigrationHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSavedInProductVersion(value: String): Self = StObject.set(x, "qSavedInProductVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQThumbnail(value: IStaticContentUrlDef): Self = StObject.set(x, "qThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
  }
}
