package typings
package reactDashOnclickoutsideLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashOnclickoutsideMod {
  type ComponentConstructor[P] = reactLib.reactMod.ComponentType[P]
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] with AdditionalProps
  type WithoutInjectedClickOutProps[P] = stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]
}
