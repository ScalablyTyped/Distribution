package typings.reactMdUtils

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useToggleMod {
  
  @JSImport("@react-md/utils/types/useToggle", "useToggle")
  @js.native
  def useToggle(defaultToggled: js.Function0[Boolean]): ReturnValue = js.native
  @JSImport("@react-md/utils/types/useToggle", "useToggle")
  @js.native
  def useToggle(defaultToggled: Boolean): ReturnValue = js.native
  
  type Disable = js.Function0[Unit]
  
  type Enable = js.Function0[Unit]
  
  type ReturnValue = js.Tuple5[Boolean, Enable, Disable, Toggle, SetToggle]
  
  type SetToggle = Dispatch[SetStateAction[Boolean]]
  
  type Toggle = js.Function0[Unit]
}
