package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("react-weui", "Progress")
  @js.native
  def apply(props: js.Any): js.Any = js.native
  
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
      
      @JSImport("react-weui", "Progress.propTypes.showCancel")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Progress.propTypes.showCancel.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object value {
      
      @JSImport("react-weui", "Progress.propTypes.value")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Progress.propTypes.value.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
