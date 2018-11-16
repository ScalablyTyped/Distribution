package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pattern1[T1] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T1, T2]
  def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR]
}

