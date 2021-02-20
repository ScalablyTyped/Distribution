package typings.reactWeui.mod

import typings.reactWeui.anon.Access
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Panel")
@js.native
class Panel protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object Panel {
  
  @JSImport("react-weui", "Panel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Panel.defaultProps")
  @js.native
  def defaultProps: Access = js.native
  @scala.inline
  def defaultProps_=(x: Access): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object access {
      
      @JSImport("react-weui", "Panel.propTypes.access")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Panel.propTypes.access.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
