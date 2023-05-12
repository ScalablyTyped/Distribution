package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelOpts
  extends StObject
     with BatchOpts {
  
  var scope: js.UndefOr[Scope] = js.undefined
}
object DelOpts {
  
  inline def apply(): DelOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelOpts] (val x: Self) extends AnyVal {
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
