package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOptions extends StObject {
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  
  var log: js.UndefOr[typings.bunyan.mod.^] = js.native
  
  var onceNext: js.UndefOr[Boolean] = js.native
  
  var registry: js.UndefOr[RouterRegistryRadix] = js.native
  
  var strictNext: js.UndefOr[Boolean] = js.native
}
object RouterOptions {
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    @scala.inline
    def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    @scala.inline
    def setRegistry(value: RouterRegistryRadix): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    @scala.inline
    def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
  }
}
