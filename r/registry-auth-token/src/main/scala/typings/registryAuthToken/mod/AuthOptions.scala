package typings.registryAuthToken.mod

import typings.registryAuthToken.anon.DictregistryUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for passing into `registry-auth-token`
  */
@js.native
trait AuthOptions extends js.Object {
  
  /**
    * An npmrc configuration object used when searching for tokens. If no object is provided,
    * the `.npmrc` file at the base of the project is used.
    */
  var npmrc: js.UndefOr[DictregistryUrls] = js.native
  
  /**
    * Wether or not url's path parts are recursively trimmed from the registry
    * url when searching for tokens
    */
  var recursive: js.UndefOr[Boolean] = js.native
}
object AuthOptions {
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
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
    def setNpmrc(value: DictregistryUrls): Self = this.set("npmrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpmrc: Self = this.set("npmrc", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
}
