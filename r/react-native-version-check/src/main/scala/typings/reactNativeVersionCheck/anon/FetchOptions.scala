package typings.reactNativeVersionCheck.anon

import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchOptions extends js.Object {
  
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
    * Package name or function that returns promise or value of package name
    */
  var packageName: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * provider name or function that returns promise or value of the latest version
    */
  var provider: js.UndefOr[js.Function0[String] | String] = js.native
}
object FetchOptions {
  
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
    
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
    def setPackageNameFunction0(value: () => String): Self = this.set("packageName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPackageName(value: String | js.Function0[String]): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
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
