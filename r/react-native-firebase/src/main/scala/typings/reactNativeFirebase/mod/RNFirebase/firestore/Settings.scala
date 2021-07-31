package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var persistence: js.UndefOr[Boolean] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  var timestampsInSnapshots: js.UndefOr[Boolean] = js.undefined
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setTimestampsInSnapshots(value: Boolean): Self = StObject.set(x, "timestampsInSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsInSnapshotsUndefined: Self = StObject.set(x, "timestampsInSnapshots", js.undefined)
  }
}
