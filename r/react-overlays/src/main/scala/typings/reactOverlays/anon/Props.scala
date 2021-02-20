package typings.reactOverlays.anon

import typings.reactOverlays.dropdownMod.DropdownInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends StObject {
  
  var props: DropdownInjectedProps = js.native
}
object Props {
  
  @scala.inline
  def apply(props: DropdownInjectedProps): Props = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: DropdownInjectedProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
