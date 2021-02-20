package typings.reactWeui.mod

import typings.reactWeui.anon.Transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Mask")
@js.native
class Mask protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
}
/* static members */
object Mask {
  
  @JSImport("react-weui", "Mask")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Mask.defaultProps")
  @js.native
  def defaultProps: Transparent = js.native
  @scala.inline
  def defaultProps_=(x: Transparent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object transparent {
      
      @JSImport("react-weui", "Mask.propTypes.transparent")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Mask.propTypes.transparent.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
