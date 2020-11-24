package typings.reactNativeVersionCheck.anon

import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentVersion extends js.Object {
  
  /**
    * app's current version from getCurrentVersion()
    */
  var currentVersion: js.UndefOr[String] = js.native
  
  /**
    * @default Infinity
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * isomorphic-fetch options (https://github.github.io/fetch/)
    */
  var fetchOptions: js.UndefOr[RequestInit] = js.native
  
  /**
    * @default false
    */
  var forceUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * app's latest version from getLatestVersion()
    */
  var latestVersion: js.UndefOr[String] = js.native
  
  /**
    * app's Package Name
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.native
}
object CurrentVersion {
  
  @scala.inline
  def apply(): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentVersion]
  }
  
  @scala.inline
  implicit class CurrentVersionOps[Self <: CurrentVersion] (val x: Self) extends AnyVal {
    
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
    def setCurrentVersion(value: String): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFetchOptions(value: RequestInit): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    
    @scala.inline
    def setForceUpdate(value: Boolean): Self = this.set("forceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUpdate: Self = this.set("forceUpdate", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: String): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("latestVersion", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setProviderFunction0(value: () => String): Self = this.set("provider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvider(value: js.Function0[String] | String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
}
