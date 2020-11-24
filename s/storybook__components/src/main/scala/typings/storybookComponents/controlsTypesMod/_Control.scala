package typings.storybookComponents.controlsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Control extends js.Object
object _Control {
  
  @scala.inline
  def ArrayConfig(): _Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Control]
  }
  
  @scala.inline
  def NumberConfig(): _Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Control]
  }
  
  @scala.inline
  def ColorConfig(): _Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Control]
  }
  
  @scala.inline
  def OptionsConfig(options: Options, `type`: OptionsControlType): _Control = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Control]
  }
}
