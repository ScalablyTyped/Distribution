package typings.rechoir

import typings.interpret.mod.Extensions_
import typings.rechoir.rechoirBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rechoir", "prepare")
  @js.native
  def prepare(config: Extensions_, filepath: String): `true` | js.Array[Attempt] = js.native
  @JSImport("rechoir", "prepare")
  @js.native
  def prepare(config: Extensions_, filepath: String, requireFrom: String): `true` | js.Array[Attempt] = js.native
  
  @js.native
  trait Attempt extends StObject {
    
    var error: Error | Null = js.native
    
    var module: js.Any = js.native
    
    var moduleName: String = js.native
  }
  object Attempt {
    
    @scala.inline
    def apply(module: js.Any, moduleName: String): Attempt = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attempt]
    }
    
    @scala.inline
    implicit class AttemptMutableBuilder[Self <: Attempt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setModule(value: js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    }
  }
}
