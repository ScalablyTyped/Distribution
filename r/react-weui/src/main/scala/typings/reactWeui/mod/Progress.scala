package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @scala.inline
  def apply(props: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("react-weui", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "Progress.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "Progress.defaultProps.showCancel")
    @js.native
    def showCancel: Boolean = js.native
    @scala.inline
    def showCancel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "Progress.defaultProps.value")
    @js.native
    def value: Double = js.native
    @scala.inline
    def value_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object showCancel {
      
      @scala.inline
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "Progress.propTypes.showCancel")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
    
    object value {
      
      @scala.inline
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "Progress.propTypes.value")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
  }
}
