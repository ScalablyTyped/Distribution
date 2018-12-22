package typings
package router5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesTypesBaseMod {
  type CancelFn = js.Function0[scala.Unit]
  type DoneFn = js.Function2[/* err */ js.UndefOr[js.Any], /* state */ js.UndefOr[State], scala.Unit]
  type Params = stdLib.Record[java.lang.String, js.Any]
  type Unsubscribe = js.Function0[scala.Unit]
}
