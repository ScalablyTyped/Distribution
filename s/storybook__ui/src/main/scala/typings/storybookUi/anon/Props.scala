package typings.storybookUi.anon

import typings.storybookUi.desktopMod.DesktopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends StObject {
  
  var props: DesktopProps = js.native
}
object Props {
  
  @scala.inline
  def apply(props: DesktopProps): Props = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: DesktopProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
