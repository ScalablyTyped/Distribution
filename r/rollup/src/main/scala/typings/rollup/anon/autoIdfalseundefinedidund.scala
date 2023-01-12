package typings.rollup.anon

import typings.rollup.mod.AmdOptions
import typings.rollup.rollupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autoId :false | undefined,   id :undefined} & {  define :string | undefined,   forceJsExtensionForImports :boolean | undefined} */
trait autoIdfalseundefinedidund
  extends StObject
     with AmdOptions {
  
  var autoId: js.UndefOr[`false`] = js.undefined
  
  var define: js.UndefOr[String] = js.undefined
  
  var forceJsExtensionForImports: js.UndefOr[Boolean] = js.undefined
  
  var id: Unit
}
object autoIdfalseundefinedidund {
  
  inline def apply(id: Unit): autoIdfalseundefinedidund = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoIdfalseundefinedidund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: autoIdfalseundefinedidund] (val x: Self) extends AnyVal {
    
    inline def setAutoId(value: `false`): Self = StObject.set(x, "autoId", value.asInstanceOf[js.Any])
    
    inline def setAutoIdUndefined: Self = StObject.set(x, "autoId", js.undefined)
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setForceJsExtensionForImports(value: Boolean): Self = StObject.set(x, "forceJsExtensionForImports", value.asInstanceOf[js.Any])
    
    inline def setForceJsExtensionForImportsUndefined: Self = StObject.set(x, "forceJsExtensionForImports", js.undefined)
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
