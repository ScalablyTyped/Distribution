package typings.reduxDashPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCreateTransformMod {
  type TransformIn[S, R] = js.Function2[/* state */ S, /* key */ String, R]
  type TransformOut[R, S] = js.Function2[/* raw */ R, /* key */ String, S]
}
