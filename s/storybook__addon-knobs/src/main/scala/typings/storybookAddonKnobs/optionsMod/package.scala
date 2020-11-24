package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object optionsMod {
  
  type OptionsTypeKnobSingleValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Null | (js.Array[scala.Double | java.lang.String])
  ]
  
  type OptionsTypeKnobValue[T /* <: typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue */] = T | js.Array[typings.std.NonNullable[T]]
  
  type OptionsTypeOptionsProp[T] = org.scalablytyped.runtime.StringDictionary[T]
}
