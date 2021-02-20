package typings.reactOverlays.anon

import typings.reactOverlays.esmDropdownMod.DropdownInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsDropdownInjectedProps extends StObject {
  
  var props: DropdownInjectedProps = js.native
}
object PropsDropdownInjectedProps {
  
  @scala.inline
  def apply(props: DropdownInjectedProps): PropsDropdownInjectedProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsDropdownInjectedProps]
  }
  
  @scala.inline
  implicit class PropsDropdownInjectedPropsMutableBuilder[Self <: PropsDropdownInjectedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: DropdownInjectedProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
