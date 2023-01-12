package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStreamOpts extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[Scope] = js.undefined
}
object PutStreamOpts {
  
  inline def apply(): PutStreamOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutStreamOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutStreamOpts] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
