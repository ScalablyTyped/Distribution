package typings.reactWeui.mod

import typings.reactWeui.anon.ActiveIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "TabBarItem")
@js.native
class TabBarItem protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object TabBarItem {
  
  @JSImport("react-weui", "TabBarItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "TabBarItem.defaultProps")
  @js.native
  def defaultProps: ActiveIcon = js.native
  @scala.inline
  def defaultProps_=(x: ActiveIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object active {
      
      @JSImport("react-weui", "TabBarItem.propTypes.active")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "TabBarItem.propTypes.active.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object icon {
      
      @JSImport("react-weui", "TabBarItem.propTypes.icon")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "TabBarItem.propTypes.icon.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object label {
      
      @JSImport("react-weui", "TabBarItem.propTypes.label")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "TabBarItem.propTypes.label.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
