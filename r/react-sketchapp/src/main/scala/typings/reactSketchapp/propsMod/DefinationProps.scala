package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinationProps extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object DefinationProps {
  
  @scala.inline
  def apply(): DefinationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinationProps]
  }
  
  @scala.inline
  implicit class DefinationPropsMutableBuilder[Self <: DefinationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
