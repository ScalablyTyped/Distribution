package typings.storybookComponents.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Control extends StObject
object _Control {
  
  inline def ColorConfig(): typings.storybookComponents.mod.ColorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.storybookComponents.mod.ColorConfig]
  }
  
  inline def NumberConfig(): typings.storybookComponents.mod.NumberConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.storybookComponents.mod.NumberConfig]
  }
  
  inline def OptionsConfig(labels: Record[Any, String], options: Options, `type`: OptionsControlType): typings.storybookComponents.mod.OptionsConfig = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookComponents.mod.OptionsConfig]
  }
}
