package typings.rollup.anon

import typings.rollup.mod.AmdOptions
import typings.rollup.rollupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autoId :true,   basePath :string | undefined,   id :undefined} & {  define :string | undefined,   forceJsExtensionForImports :boolean | undefined} */
trait autoIdtruebasePathstringu
  extends StObject
     with AmdOptions {
  
  var autoId: `true`
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var define: js.UndefOr[String] = js.undefined
  
  var forceJsExtensionForImports: js.UndefOr[Boolean] = js.undefined
  
  var id: Unit
}
object autoIdtruebasePathstringu {
  
  inline def apply(id: Unit): autoIdtruebasePathstringu = {
    val __obj = js.Dynamic.literal(autoId = true, id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoIdtruebasePathstringu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: autoIdtruebasePathstringu] (val x: Self) extends AnyVal {
    
    inline def setAutoId(value: `true`): Self = StObject.set(x, "autoId", value.asInstanceOf[js.Any])
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setForceJsExtensionForImports(value: Boolean): Self = StObject.set(x, "forceJsExtensionForImports", value.asInstanceOf[js.Any])
    
    inline def setForceJsExtensionForImportsUndefined: Self = StObject.set(x, "forceJsExtensionForImports", js.undefined)
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
