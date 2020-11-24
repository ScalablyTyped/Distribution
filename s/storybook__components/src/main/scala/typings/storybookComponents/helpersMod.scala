package typings.storybookComponents

import typings.storybookComponents.controlsTypesMod.OptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/options/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def selectedKey(value: js.Any, options: OptionsObject): String = js.native
  
  def selectedKeys(value: js.Array[_], options: OptionsObject): js.Array[String] = js.native
  
  def selectedValues(keys: js.Array[String], options: OptionsObject): js.Array[_] = js.native
}
