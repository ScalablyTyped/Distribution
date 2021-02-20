package typings.reactWeui.mod

import typings.reactWeui.anon.EnableMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Popup")
@js.native
class Popup protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object Popup {
  
  @JSImport("react-weui", "Popup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Popup.defaultProps")
  @js.native
  def defaultProps: EnableMask = js.native
  @scala.inline
  def defaultProps_=(x: EnableMask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object enableMask {
      
      @JSImport("react-weui", "Popup.propTypes.enableMask")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Popup.propTypes.enableMask.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object show {
      
      @JSImport("react-weui", "Popup.propTypes.show")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Popup.propTypes.show.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
