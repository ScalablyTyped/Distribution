package typings.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cell {
  
  @JSImport("react-weui", "Cell")
  @js.native
  def apply(props: js.Any): js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "Cell.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "Cell.defaultProps.access")
    @js.native
    def access: Boolean = js.native
    @scala.inline
    def access_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("access")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "Cell.defaultProps.link")
    @js.native
    def link: Boolean = js.native
    @scala.inline
    def link_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object access {
      
      @JSImport("react-weui", "Cell.propTypes.access")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Cell.propTypes.access.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object component {
      
      @JSImport("react-weui", "Cell.propTypes.component")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Cell.propTypes.component.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object link {
      
      @JSImport("react-weui", "Cell.propTypes.link")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Cell.propTypes.link.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
