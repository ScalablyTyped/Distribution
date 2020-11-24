package typings.radium.mod

import typings.radium.mod.Radium.RadiumConfig
import typings.radium.mod.Radium.RadiumTestMode
import typings.radium.mod.Radium.StyleProps
import typings.radium.mod.Radium.StyleRootProps
import typings.radium.mod.Radium.StyleRules
import typings.radium.radiumStrings.Colonactive
import typings.radium.radiumStrings.Colonfocus
import typings.radium.radiumStrings.Colonhover
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("radium", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], _] = js.native
  // @Radium decorator
  def apply[TElement /* <: js.Function */](component: TElement): TElement = js.native
  
  var TestMode: RadiumTestMode = js.native
  
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: String, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: Unit, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: String, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: Unit, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: String, value: Colonhover): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: Unit, value: Colonhover): Boolean = js.native
  
  def keyframes(keyframes: StyleRules): js.Object = js.native
  def keyframes(keyframes: StyleRules, name: String): js.Object = js.native
  
  @js.native
  class Style ()
    extends Component[StyleProps, js.Object, js.Any]
  
  @js.native
  class StyleRoot ()
    extends Component[StyleRootProps, js.Object, js.Any]
}
