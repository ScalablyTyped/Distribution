package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsTypesOptionsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.NonNullable

  type OptionsTypeKnobSingleValue = js.UndefOr[String | Double | Null | (js.Array[Double | String])]
  type OptionsTypeKnobValue[T /* <: OptionsTypeKnobSingleValue */] = T | js.Array[NonNullable[T]]
  type OptionsTypeOptionsProp[T] = StringDictionary[T]
}
