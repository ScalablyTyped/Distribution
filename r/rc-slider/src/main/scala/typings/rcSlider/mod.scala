package typings.rcSlider

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.rcSlider.anon.ContextType
import typings.rcSlider.anon.Dictx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-slider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Handle ()
    extends typings.rcSlider.handleMod.Handle
  
  @js.native
  class Range protected () extends Dictx {
    def this(props: js.Any) = this()
  }
  
  @js.native
  class default protected () extends Dictx {
    def this(props: js.Any) = this()
  }
  
  def createSliderWithTooltip(Component: js.Any): ContextType = js.native
  @js.native
  object Range
    extends /* x */ StringDictionary[js.Any]
       with Instantiable1[/* props */ js.Any, Dictx] {
    var defaultProps: js.Any = js.native
    var displayName: String = js.native
  }
  
  @js.native
  object default
    extends /* x */ StringDictionary[js.Any]
       with Instantiable1[/* props */ js.Any, Dictx] {
    var defaultProps: js.Any = js.native
    var displayName: String = js.native
  }
  
}

