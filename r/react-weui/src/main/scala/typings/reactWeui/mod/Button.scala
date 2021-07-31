package typings.reactWeui.mod

import typings.reactWeui.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Button")
@js.native
class Button protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object Button {
  
  @JSImport("react-weui", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Button.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object disabled {
      
      @scala.inline
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "Button.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    object size {
      
      @scala.inline
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "Button.propTypes.size")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    object `type` {
      
      @scala.inline
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "Button.propTypes.type")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
  }
}
