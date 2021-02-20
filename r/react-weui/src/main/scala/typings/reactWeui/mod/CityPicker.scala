package typings.reactWeui.mod

import typings.reactWeui.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-weui", "CityPicker")
@js.native
class CityPicker protected () extends StObject {
  def this(props: js.Any) = this()
  
  def handleChange(): Unit = js.native
  
  def parseData(data: js.Any, subKey: js.Any, args: js.Any*): js.Any = js.native
  
  def render(): js.Any = js.native
  
  def updateGroup(item: js.Any, i: js.Any, groupIndex: js.Any, selected: js.Any, picker: js.Any): Unit = js.native
}
/* static members */
object CityPicker {
  
  @JSImport("react-weui", "CityPicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-weui", "CityPicker.defaultProps")
  @js.native
  def defaultProps: Data = js.native
  @scala.inline
  def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    @JSImport("react-weui", "CityPicker.propTypes.data")
    @js.native
    def data(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    
    object dataMap {
      
      @JSImport("react-weui", "CityPicker.propTypes.dataMap")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "CityPicker.propTypes.dataMap.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object selected {
      
      @JSImport("react-weui", "CityPicker.propTypes.selected")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "CityPicker.propTypes.selected.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    object show {
      
      @JSImport("react-weui", "CityPicker.propTypes.show")
      @js.native
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      
      @JSImport("react-weui", "CityPicker.propTypes.show.isRequired")
      @js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
  }
}
