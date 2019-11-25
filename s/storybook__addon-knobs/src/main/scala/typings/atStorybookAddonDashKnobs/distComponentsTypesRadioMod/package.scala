package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsTypesRadioMod {
  import typings.std.Record

  type RadiosTypeKnobValue = js.UndefOr[String | Double | Null]
  type RadiosTypeOptionsProp[T /* <: RadiosTypeKnobValue */] = Record[String | Double, T]
}
