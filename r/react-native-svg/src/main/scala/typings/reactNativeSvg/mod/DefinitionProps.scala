package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionProps extends StObject {
  
  var id: js.UndefOr[String] = js.native
}
object DefinitionProps {
  
  @scala.inline
  def apply(): DefinitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionProps]
  }
  
  @scala.inline
  implicit class DefinitionPropsMutableBuilder[Self <: DefinitionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
