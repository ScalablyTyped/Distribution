package typings.reactWeui.mod

import typings.reactWeui.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "ButtonArea")
@js.native
class ButtonArea protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object ButtonArea {
  
  @JSImport("react-weui", "ButtonArea")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "ButtonArea.defaultProps")
  @js.native
  def defaultProps: Direction = js.native
  @scala.inline
  def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object direction {
      
      @JSImport("react-weui", "ButtonArea.propTypes.direction")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "ButtonArea.propTypes.direction.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
