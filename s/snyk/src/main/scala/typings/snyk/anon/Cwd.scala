package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cwd extends StObject {
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var isFromContainer: Boolean
}
object Cwd {
  
  inline def apply(isFromContainer: Boolean): Cwd = {
    val __obj = js.Dynamic.literal(isFromContainer = isFromContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setIsFromContainer(value: Boolean): Self = StObject.set(x, "isFromContainer", value.asInstanceOf[js.Any])
  }
}
