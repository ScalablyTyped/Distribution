package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operatorPublishMod {
  import typings.rxjs.rxjsMod.Observable

  type selector[T] = js.Function1[/* source */ Observable[T], Observable[T]]
}
