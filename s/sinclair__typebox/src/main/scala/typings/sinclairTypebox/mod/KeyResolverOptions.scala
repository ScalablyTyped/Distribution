package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyResolverOptions extends StObject {
  
  var includePatterns: Boolean
}
object KeyResolverOptions {
  
  inline def apply(includePatterns: Boolean): KeyResolverOptions = {
    val __obj = js.Dynamic.literal(includePatterns = includePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyResolverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyResolverOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludePatterns(value: Boolean): Self = StObject.set(x, "includePatterns", value.asInstanceOf[js.Any])
  }
}
