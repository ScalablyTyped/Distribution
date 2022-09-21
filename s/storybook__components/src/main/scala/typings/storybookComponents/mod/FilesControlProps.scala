package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesControlProps
  extends StObject
     with ControlProps[js.Array[String]] {
  
  var accept: js.UndefOr[String] = js.undefined
}
object FilesControlProps {
  
  inline def apply(name: String, onChange: js.Array[String] => js.Array[String] | Unit): FilesControlProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[FilesControlProps]
  }
  
  extension [Self <: FilesControlProps](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
  }
}
