package typings.reactWeui.mod

import typings.reactWeui.anon.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "MediaBoxInfoMeta")
@js.native
class MediaBoxInfoMeta protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object MediaBoxInfoMeta {
  
  @JSImport("react-weui", "MediaBoxInfoMeta")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "MediaBoxInfoMeta.defaultProps")
  @js.native
  def defaultProps: Extra = js.native
  inline def defaultProps_=(x: Extra): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object extra {
      
      inline def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("react-weui", "MediaBoxInfoMeta.propTypes.extra")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    }
  }
}
