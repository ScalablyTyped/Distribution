package typings.prettier.mod

import typings.prettier.anon.Value
import typings.prettier.anon.ValueArray
import typings.prettier.anon.`0`
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.boolean
import typings.prettier.prettierStrings.int
import typings.prettier.prettierStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SupportOption extends StObject
object _SupportOption {
  
  @scala.inline
  def BooleanArraySupportOption(array: `true`, category: String, default: js.Array[ValueArray], since: String, `type`: boolean): typings.prettier.mod.BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.BooleanArraySupportOption]
  }
  
  @scala.inline
  def BooleanSupportOption(category: String, default: Boolean, description: String, since: String, `type`: boolean): typings.prettier.mod.BooleanSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.BooleanSupportOption]
  }
  
  @scala.inline
  def IntArraySupportOption(array: `true`, category: String, default: js.Array[Value], since: String, `type`: int): typings.prettier.mod.IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.IntArraySupportOption]
  }
  
  @scala.inline
  def IntSupportOption(category: String, default: Double, since: String, `type`: int): typings.prettier.mod.IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.IntSupportOption]
  }
  
  @scala.inline
  def PathArraySupportOption(array: `true`, category: String, default: js.Array[`0`], since: String, `type`: path): typings.prettier.mod.PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.PathArraySupportOption]
  }
  
  @scala.inline
  def PathSupportOption(category: String, default: String, since: String, `type`: path): typings.prettier.mod.PathSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.prettier.mod.PathSupportOption]
  }
}
