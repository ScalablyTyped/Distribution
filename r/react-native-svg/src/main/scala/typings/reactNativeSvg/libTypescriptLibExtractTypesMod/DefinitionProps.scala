package typings.reactNativeSvg.libTypescriptLibExtractTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionProps extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object DefinitionProps {
  
  inline def apply(): DefinitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionProps] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
