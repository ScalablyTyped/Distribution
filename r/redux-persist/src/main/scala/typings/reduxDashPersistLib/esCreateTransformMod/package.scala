package typings
package reduxDashPersistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCreateTransformMod {
  type TransformIn[S, R] = js.Function2[/* state */ S, /* key */ java.lang.String, R]
  type TransformOut[R, S] = js.Function2[/* raw */ R, /* key */ java.lang.String, S]
}
