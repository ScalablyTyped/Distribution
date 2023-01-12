package typings.rechoir

import typings.interpret.mod.Extensions_
import typings.rechoir.rechoirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rechoir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepare(config: Extensions_, filepath: String): `true` | js.Array[Attempt] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(config.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[Attempt]]
  inline def prepare(config: Extensions_, filepath: String, requireFrom: String): `true` | js.Array[Attempt] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(config.asInstanceOf[js.Any], filepath.asInstanceOf[js.Any], requireFrom.asInstanceOf[js.Any])).asInstanceOf[`true` | js.Array[Attempt]]
  
  trait Attempt extends StObject {
    
    var error: js.Error | Null
    
    var module: Any
    
    var moduleName: String
  }
  object Attempt {
    
    inline def apply(module: Any, moduleName: String): Attempt = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[Attempt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attempt] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setModule(value: Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    }
  }
}
