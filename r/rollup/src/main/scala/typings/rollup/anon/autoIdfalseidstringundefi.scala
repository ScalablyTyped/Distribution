package typings.rollup.anon

import typings.rollup.mod.NormalizedAmdOptions
import typings.rollup.rollupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autoId :false,   id :string | undefined} & {  define :string,   forceJsExtensionForImports :boolean} */
trait autoIdfalseidstringundefi
  extends StObject
     with NormalizedAmdOptions {
  
  var autoId: `false`
  
  var define: String
  
  var forceJsExtensionForImports: Boolean
  
  var id: js.UndefOr[String] = js.undefined
}
object autoIdfalseidstringundefi {
  
  inline def apply(define: String, forceJsExtensionForImports: Boolean): autoIdfalseidstringundefi = {
    val __obj = js.Dynamic.literal(autoId = false, define = define.asInstanceOf[js.Any], forceJsExtensionForImports = forceJsExtensionForImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoIdfalseidstringundefi]
  }
  
  extension [Self <: autoIdfalseidstringundefi](x: Self) {
    
    inline def setAutoId(value: `false`): Self = StObject.set(x, "autoId", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setForceJsExtensionForImports(value: Boolean): Self = StObject.set(x, "forceJsExtensionForImports", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
