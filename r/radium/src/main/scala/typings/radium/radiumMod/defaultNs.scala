package typings.radium.radiumMod

import typings.radium.radiumMod.RadiumNs.RadiumTestMode
import typings.radium.radiumMod.RadiumNs.StyleRules
import typings.radium.radiumStrings.`:active`
import typings.radium.radiumStrings.`:focus`
import typings.radium.radiumStrings.`:hover`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radium", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Style ()
    extends typings.radium.radiumMod.RadiumNs.Style
  
  @js.native
  class StyleRoot ()
    extends typings.radium.radiumMod.RadiumNs.StyleRoot
  
  var TestMode: RadiumTestMode = js.native
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

