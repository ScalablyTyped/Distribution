package typings.reactWeui.mod

import typings.reactWeui.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "NavBarItem")
@js.native
class NavBarItem protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object NavBarItem {
  
  @JSImport("react-weui", "NavBarItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "NavBarItem.defaultProps")
  @js.native
  def defaultProps: Active = js.native
  @scala.inline
  def defaultProps_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object active {
      
      @JSImport("react-weui", "NavBarItem.propTypes.active")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "NavBarItem.propTypes.active.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object label {
      
      @JSImport("react-weui", "NavBarItem.propTypes.label")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "NavBarItem.propTypes.label.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
