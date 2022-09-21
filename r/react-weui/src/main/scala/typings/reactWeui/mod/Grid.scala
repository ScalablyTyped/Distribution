package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Grid")
@js.native
open class Grid protected () extends StObject {
  def this(args: Any*) = this()
  
  def render(): Any = js.native
}
/* static members */
object Grid {
  
  @JSImport("react-weui", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Grid.defaultProps")
  @js.native
  def defaultProps: typings.reactWeui.anon.Icon = js.native
  inline def defaultProps_=(x: typings.reactWeui.anon.Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object icon {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Grid.propTypes.icon")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object label {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Grid.propTypes.label")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
