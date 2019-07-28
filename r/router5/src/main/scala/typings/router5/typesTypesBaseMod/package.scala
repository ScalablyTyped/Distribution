package typings.router5

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesTypesBaseMod {
  type CancelFn = js.Function0[Unit]
  type DoneFn = js.Function2[/* err */ js.UndefOr[js.Any], /* state */ js.UndefOr[State], Unit]
  type Params = Record[String, js.Any]
  type Unsubscribe = js.Function0[Unit]
}
