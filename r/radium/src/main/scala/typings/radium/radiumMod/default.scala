package typings.radium.radiumMod

import typings.radium.radiumMod.Radium.RadiumConfig
import typings.radium.radiumMod.Radium.RadiumTestMode
import typings.radium.radiumMod.Radium.StyleProps
import typings.radium.radiumMod.Radium.StyleRootProps
import typings.radium.radiumMod.Radium.StyleRules
import typings.radium.radiumStrings.`:active`
import typings.radium.radiumStrings.`:focus`
import typings.radium.radiumStrings.`:hover`
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radium", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Style ()
    extends Component[StyleProps, js.Object, js.Any]
  
  @js.native
  class StyleRoot ()
    extends Component[StyleRootProps, js.Object, js.Any]
  
  var TestMode: RadiumTestMode = js.native
  def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], _] = js.native
  // @Radium decorator
  def apply[TElement /* <: js.Function */](component: TElement): TElement = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: String, value: `:active`): Boolean = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: Unit, value: `:active`): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: String, value: `:focus`): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: Unit, value: `:focus`): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: String, value: `:hover`): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: Unit, value: `:hover`): Boolean = js.native
  def keyframes(keyframes: StyleRules): js.Object = js.native
  def keyframes(keyframes: StyleRules, name: String): js.Object = js.native
}

