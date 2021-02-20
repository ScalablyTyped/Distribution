package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toptips {
  
  @JSImport("react-weui", "Toptips")
  @js.native
  def apply(props: js.Any): js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "Toptips.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "Toptips.defaultProps.show")
    @js.native
    def show: Boolean = js.native
    @scala.inline
    def show_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "Toptips.defaultProps.type")
    @js.native
    val `type`: String = js.native
  }
  
  object propTypes {
    
    object show {
      
      @JSImport("react-weui", "Toptips.propTypes.show")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Toptips.propTypes.show.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object `type` {
      
      @JSImport("react-weui", "Toptips.propTypes.type")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Toptips.propTypes.type.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
