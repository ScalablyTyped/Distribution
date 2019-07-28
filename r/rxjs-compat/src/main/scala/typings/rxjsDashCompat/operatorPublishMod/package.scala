package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operatorPublishMod {
  type selector[T] = js.Function1[/* source */ Observable[T], Observable[T]]
}
