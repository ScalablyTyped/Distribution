package typings.reduxActionUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionCreator_[T] = js.Function1[/* repeated */ js.Any, typings.reduxActionUtils.mod.Action with T]
  type OptionsActionCreator_[T] = js.Function1[/* data */ T, typings.reduxActionUtils.mod.Action with T]
}
