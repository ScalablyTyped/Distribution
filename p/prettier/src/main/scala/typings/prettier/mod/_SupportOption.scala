package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SupportOption extends StObject
object _SupportOption {
  
  inline def BooleanArraySupportOption(category: String, since: String): typings.prettier.mod.BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.prettier.mod.BooleanArraySupportOption]
  }
  
  inline def BooleanSupportOption(category: String, description: String, since: String): typings.prettier.mod.BooleanSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.prettier.mod.BooleanSupportOption]
  }
  
  inline def IntArraySupportOption(category: String, since: String): typings.prettier.mod.IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[typings.prettier.mod.IntArraySupportOption]
  }
  
  inline def IntSupportOption(category: String, since: String): typings.prettier.mod.IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[typings.prettier.mod.IntSupportOption]
  }
  
  inline def PathArraySupportOption(category: String, since: String): typings.prettier.mod.PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[typings.prettier.mod.PathArraySupportOption]
  }
  
  inline def PathSupportOption(category: String, since: String): typings.prettier.mod.PathSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[typings.prettier.mod.PathSupportOption]
  }
}
