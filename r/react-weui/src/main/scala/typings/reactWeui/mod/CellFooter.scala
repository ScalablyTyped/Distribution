package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellFooter {
  
  @JSImport("react-weui", "CellFooter")
  @js.native
  def apply(props: js.Any): js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "CellFooter.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "CellFooter.defaultProps.primary")
    @js.native
    def primary: Boolean = js.native
    @scala.inline
    def primary_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object primary {
      
      @JSImport("react-weui", "CellFooter.propTypes.primary")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "CellFooter.propTypes.primary.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
