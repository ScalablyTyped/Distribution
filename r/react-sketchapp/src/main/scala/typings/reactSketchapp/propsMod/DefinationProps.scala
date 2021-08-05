package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinationProps extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object DefinationProps {
  
  inline def apply(): DefinationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinationProps]
  }
  
  extension [Self <: DefinationProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
