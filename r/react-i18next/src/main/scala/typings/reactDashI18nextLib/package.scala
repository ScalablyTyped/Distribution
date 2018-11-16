package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashI18nextLib {
  type Namespace = java.lang.String | js.Array[java.lang.String]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Subtract[T, K] = Omit[T, java.lang.String]
}
