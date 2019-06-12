package typings
package radiumLib.radiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radium", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Style ()
    extends radiumLib.radiumMod.RadiumNs.Style
  
  @js.native
  class StyleRoot ()
    extends radiumLib.radiumMod.RadiumNs.StyleRoot
  
  var TestMode: radiumLib.radiumMod.RadiumNs.RadiumTestMode = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: java.lang.String, value: radiumLib.radiumLibStrings.`:active`): scala.Boolean = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: scala.Unit, value: radiumLib.radiumLibStrings.`:active`): scala.Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: java.lang.String, value: radiumLib.radiumLibStrings.`:focus`): scala.Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: scala.Unit, value: radiumLib.radiumLibStrings.`:focus`): scala.Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: java.lang.String, value: radiumLib.radiumLibStrings.`:hover`): scala.Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: scala.Unit, value: radiumLib.radiumLibStrings.`:hover`): scala.Boolean = js.native
  def keyframes(keyframes: radiumLib.radiumMod.RadiumNs.StyleRules): js.Object = js.native
  def keyframes(keyframes: radiumLib.radiumMod.RadiumNs.StyleRules, name: java.lang.String): js.Object = js.native
}

