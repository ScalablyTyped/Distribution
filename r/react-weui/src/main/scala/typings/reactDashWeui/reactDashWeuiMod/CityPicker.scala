package typings.reactDashWeui.reactDashWeuiMod

import typings.reactDashWeui.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-weui", "CityPicker")
@js.native
class CityPicker protected () extends js.Object {
  def this(props: js.Any) = this()
  def handleChange(): Unit = js.native
  def parseData(data: js.Any, subKey: js.Any, args: js.Any*): js.Any = js.native
  def render(): js.Any = js.native
  def updateGroup(item: js.Any, i: js.Any, groupIndex: js.Any, selected: js.Any, picker: js.Any): Unit = js.native
}

/* static members */
@JSImport("react-weui", "CityPicker")
@js.native
object CityPicker extends js.Object {
  var defaultProps: Anon_Data = js.native
  @js.native
  object propTypes extends js.Object {
    def data(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    @js.native
    object dataMap extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object selected extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object show extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
  }
  
}

