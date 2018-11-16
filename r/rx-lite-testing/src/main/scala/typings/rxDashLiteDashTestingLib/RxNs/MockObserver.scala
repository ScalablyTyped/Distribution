package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MockObserver[T]
  extends rxDashCoreLib.RxNs.Observer[T] {
  var messages: js.Array[Recorded]
}

