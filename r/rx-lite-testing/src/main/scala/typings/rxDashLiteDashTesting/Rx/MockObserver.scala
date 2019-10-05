package typings.rxDashLiteDashTesting.Rx

import org.scalablytyped.runtime.TopLevel
import typings.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded]
}

@JSGlobal("Rx.MockObserver")
@js.native
object MockObserver extends TopLevel[MockObserverStatic]

