package typings.storybookComponents

import typings.storybookComponents.controlsTypesMod.OptionsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@storybook/components/dist/controls/options/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def selectedKey(value: js.Any, options: OptionsObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectedKey")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def selectedKeys(value: js.Array[js.Any], options: OptionsObject): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectedKeys")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def selectedValues(keys: js.Array[String], options: OptionsObject): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectedValues")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
