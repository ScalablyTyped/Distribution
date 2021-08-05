package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellFooter {
  
  inline def apply(props: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("react-weui", "CellFooter")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "CellFooter.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "CellFooter.defaultProps.primary")
    @js.native
    def primary: Boolean = js.native
    inline def primary_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object primary {
      
      inline def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "CellFooter.propTypes.primary")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
  }
}
