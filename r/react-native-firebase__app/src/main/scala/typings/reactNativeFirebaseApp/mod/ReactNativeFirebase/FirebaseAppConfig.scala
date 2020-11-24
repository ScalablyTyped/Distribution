package typings.reactNativeFirebaseApp.mod.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseAppConfig extends js.Object {
  
  /**
    *
    */
  var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true it indicates that Firebase should close database connections
    * automatically when the app is in the background. Disabled by default.
    */
  var automaticResourceManagement: js.UndefOr[Boolean] = js.native
  
  /**
    * The Firebase App name, defaults to [DEFAULT] if none provided.
    */
  var name: js.UndefOr[String] = js.native
}
object FirebaseAppConfig {
  
  @scala.inline
  def apply(): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseAppConfig]
  }
  
  @scala.inline
  implicit class FirebaseAppConfigOps[Self <: FirebaseAppConfig] (val x: Self) extends AnyVal {
    
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
    def setAutomaticDataCollectionEnabled(value: Boolean): Self = this.set("automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticDataCollectionEnabled: Self = this.set("automaticDataCollectionEnabled", js.undefined)
    
    @scala.inline
    def setAutomaticResourceManagement(value: Boolean): Self = this.set("automaticResourceManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticResourceManagement: Self = this.set("automaticResourceManagement", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
