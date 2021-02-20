package typings.reactWeui.mod

import typings.reactWeui.anon.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Select")
@js.native
class Select protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def render(): js.Any = js.native
  
  def renderData(data: js.Any): js.Any = js.native
}
/* static members */
object Select {
  
  @JSImport("react-weui", "Select")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Select.defaultProps")
  @js.native
  def defaultProps: DataArray = js.native
  @scala.inline
  def defaultProps_=(x: DataArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object data {
      
      @JSImport("react-weui", "Select.propTypes.data")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Select.propTypes.data.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
