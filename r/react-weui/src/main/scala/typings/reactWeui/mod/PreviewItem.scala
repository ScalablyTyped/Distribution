package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreviewItem {
  
  @JSImport("react-weui", "PreviewItem")
  @js.native
  def apply(props: js.Any): js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "PreviewItem.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "PreviewItem.defaultProps.label")
    @js.native
    def label: Boolean = js.native
    @scala.inline
    def label_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "PreviewItem.defaultProps.value")
    @js.native
    def value: Boolean = js.native
    @scala.inline
    def value_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object label {
      
      @JSImport("react-weui", "PreviewItem.propTypes.label")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "PreviewItem.propTypes.label.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object value {
      
      @JSImport("react-weui", "PreviewItem.propTypes.value")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "PreviewItem.propTypes.value.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
