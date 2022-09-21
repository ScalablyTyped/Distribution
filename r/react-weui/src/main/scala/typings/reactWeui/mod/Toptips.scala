package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toptips {
  
  inline def apply(props: Any): Any = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("react-weui", "Toptips")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "Toptips.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "Toptips.defaultProps.show")
    @js.native
    def show: Boolean = js.native
    inline def show_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "Toptips.defaultProps.type")
    @js.native
    val `type`: String = js.native
  }
  
  object propTypes {
    
    object show {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Toptips.propTypes.show")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object `type` {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Toptips.propTypes.type")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
