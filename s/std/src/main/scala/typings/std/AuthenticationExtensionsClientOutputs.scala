package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsClientOutputs extends StObject {
  
  var appid: js.UndefOr[scala.Boolean] = js.undefined
  
  var credProps: js.UndefOr[CredentialPropertiesOutput] = js.undefined
  
  var uvm: js.UndefOr[UvmEntries] = js.undefined
}
object AuthenticationExtensionsClientOutputs {
  
  @scala.inline
  def apply(): AuthenticationExtensionsClientOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientOutputs]
  }
  
  @scala.inline
  implicit class AuthenticationExtensionsClientOutputsMutableBuilder[Self <: AuthenticationExtensionsClientOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppid(value: scala.Boolean): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    @scala.inline
    def setCredProps(value: CredentialPropertiesOutput): Self = StObject.set(x, "credProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredPropsUndefined: Self = StObject.set(x, "credProps", js.undefined)
    
    @scala.inline
    def setUvm(value: UvmEntries): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
    
    @scala.inline
    def setUvmVarargs(value: UvmEntry*): Self = StObject.set(x, "uvm", js.Array(value :_*))
  }
}
