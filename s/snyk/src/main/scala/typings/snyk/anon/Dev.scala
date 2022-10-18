package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dev extends StObject {
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var strictOutOfSync: js.UndefOr[Boolean] = js.undefined
  
  var yarnWorkspaces: js.UndefOr[Boolean] = js.undefined
}
object Dev {
  
  inline def apply(): Dev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dev]
  }
  
  extension [Self <: Dev](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setStrictOutOfSync(value: Boolean): Self = StObject.set(x, "strictOutOfSync", value.asInstanceOf[js.Any])
    
    inline def setStrictOutOfSyncUndefined: Self = StObject.set(x, "strictOutOfSync", js.undefined)
    
    inline def setYarnWorkspaces(value: Boolean): Self = StObject.set(x, "yarnWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setYarnWorkspacesUndefined: Self = StObject.set(x, "yarnWorkspaces", js.undefined)
  }
}
