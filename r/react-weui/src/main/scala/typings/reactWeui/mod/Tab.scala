package typings.reactWeui.mod

import typings.reactWeui.anon.DefaultIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "Tab")
@js.native
class Tab protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def handleHeaderClick(idx: js.Any): Unit = js.native
  
  def parseChild(children: js.Any): js.Any = js.native
  
  def render(): js.Any = js.native
  
  def renderBar(`type`: js.Any, children: js.Any, cls: js.Any): js.Any = js.native
}
/* static members */
object Tab {
  
  @JSImport("react-weui", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "Tab.defaultProps")
  @js.native
  def defaultProps: DefaultIndex = js.native
  @scala.inline
  def defaultProps_=(x: DefaultIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object defaultIndex {
      
      @JSImport("react-weui", "Tab.propTypes.defaultIndex")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Tab.propTypes.defaultIndex.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object onChange {
      
      @JSImport("react-weui", "Tab.propTypes.onChange")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Tab.propTypes.onChange.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object `type` {
      
      @JSImport("react-weui", "Tab.propTypes.type")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "Tab.propTypes.type.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
