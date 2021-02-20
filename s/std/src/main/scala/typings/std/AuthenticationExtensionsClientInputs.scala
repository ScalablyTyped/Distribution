package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationExtensionsClientInputs extends StObject {
  
  var appid: js.UndefOr[java.lang.String] = js.native
  
  var appidExclude: js.UndefOr[java.lang.String] = js.native
  
  var credProps: js.UndefOr[scala.Boolean] = js.native
  
  var uvm: js.UndefOr[scala.Boolean] = js.native
}
object AuthenticationExtensionsClientInputs {
  
  @scala.inline
  def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  @scala.inline
  implicit class AuthenticationExtensionsClientInputsMutableBuilder[Self <: AuthenticationExtensionsClientInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppid(value: java.lang.String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppidExclude(value: java.lang.String): Self = StObject.set(x, "appidExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppidExcludeUndefined: Self = StObject.set(x, "appidExclude", js.undefined)
    
    @scala.inline
    def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    @scala.inline
    def setCredProps(value: scala.Boolean): Self = StObject.set(x, "credProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredPropsUndefined: Self = StObject.set(x, "credProps", js.undefined)
    
    @scala.inline
    def setUvm(value: scala.Boolean): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
  }
}
