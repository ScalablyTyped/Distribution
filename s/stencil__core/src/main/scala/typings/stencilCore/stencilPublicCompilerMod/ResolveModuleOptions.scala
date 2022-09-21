package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveModuleOptions extends StObject {
  
  var manuallyResolve: js.UndefOr[Boolean] = js.undefined
  
  var packageJson: js.UndefOr[Boolean] = js.undefined
}
object ResolveModuleOptions {
  
  inline def apply(): ResolveModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveModuleOptions]
  }
  
  extension [Self <: ResolveModuleOptions](x: Self) {
    
    inline def setManuallyResolve(value: Boolean): Self = StObject.set(x, "manuallyResolve", value.asInstanceOf[js.Any])
    
    inline def setManuallyResolveUndefined: Self = StObject.set(x, "manuallyResolve", js.undefined)
    
    inline def setPackageJson(value: Boolean): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
    
    inline def setPackageJsonUndefined: Self = StObject.set(x, "packageJson", js.undefined)
  }
}
