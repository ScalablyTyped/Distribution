package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object controlsTypesMod {
  
  type ArrayValue = js.Array[java.lang.String]
  
  type BooleanValue = scala.Boolean
  
  type ColorValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.controlsTypesMod.ArrayConfig
    - typings.storybookComponents.controlsTypesMod.BooleanConfig
    - typings.storybookComponents.controlsTypesMod.ColorConfig
    - typings.storybookComponents.controlsTypesMod.DateConfig
    - typings.storybookComponents.controlsTypesMod.NumberConfig
    - typings.storybookComponents.controlsTypesMod.ObjectConfig
    - typings.storybookComponents.controlsTypesMod.OptionsConfig
    - typings.storybookComponents.controlsTypesMod.RangeConfig
    - typings.storybookComponents.controlsTypesMod.TextConfig
  */
  type Control = typings.storybookComponents.controlsTypesMod._Control | typings.storybookComponents.controlsTypesMod.RangeConfig
  
  type Controls = typings.std.Record[java.lang.String, typings.storybookComponents.controlsTypesMod.Control]
  
  type DateValue = typings.std.Date | scala.Double
  
  type NumberValue = scala.Double
  
  type ObjectValue = js.Any
  
  type Options = typings.storybookComponents.controlsTypesMod.OptionsArray | typings.storybookComponents.controlsTypesMod.OptionsObject
  
  type OptionsArray = js.Array[js.Any]
  
  type OptionsMultiSelection = js.Array[js.Any]
  
  type OptionsObject = typings.std.Record[java.lang.String, js.Any]
  
  type OptionsSelection = typings.storybookComponents.controlsTypesMod.OptionsSingleSelection | typings.storybookComponents.controlsTypesMod.OptionsMultiSelection
  
  type OptionsSingleSelection = js.Any
  
  type RangeConfig = typings.storybookComponents.controlsTypesMod.NumberConfig
  
  type TextValue = java.lang.String
}
