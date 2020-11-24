package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pass an object implementing this interface to the app constructor.
  */
@js.native
trait AppConfiguration extends js.Object {
  
  /**
    * This describes the local app, sent to the server when a user authenticates.
    * Specifying this will enable the server to respond differently to specific versions of specific apps.
    */
  var app: js.UndefOr[LocalAppConfiguration] = js.native
  
  /**
    * An optional URL to use as a prefix when requesting the MongoDB Realm services.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * The Realm App ID
    */
  var id: String = js.native
}
object AppConfiguration {
  
  @scala.inline
  def apply(id: String): AppConfiguration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfiguration]
  }
  
  @scala.inline
  implicit class AppConfigurationOps[Self <: AppConfiguration] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: LocalAppConfiguration): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
  }
}
