package typings.quadstore.typesMod

import typings.quadstore.scopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOpts
  extends StObject
     with BatchOpts {
  
  var scope: js.UndefOr[Scope] = js.undefined
}
object PutOpts {
  
  inline def apply(): PutOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOpts]
  }
  
  extension [Self <: PutOpts](x: Self) {
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
