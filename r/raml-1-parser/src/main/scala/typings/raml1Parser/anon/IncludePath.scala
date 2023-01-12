package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludePath extends StObject {
  
  def includePath(): java.lang.String
}
object IncludePath {
  
  inline def apply(includePath: () => java.lang.String): IncludePath = {
    val __obj = js.Dynamic.literal(includePath = js.Any.fromFunction0(includePath))
    __obj.asInstanceOf[IncludePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludePath] (val x: Self) extends AnyVal {
    
    inline def setIncludePath(value: () => java.lang.String): Self = StObject.set(x, "includePath", js.Any.fromFunction0(value))
  }
}
