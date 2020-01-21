package typings.rxLiteTesting.Rx

import org.scalablytyped.runtime.TopLevel
import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded]
}

@JSGlobal("Rx.MockObserver")
@js.native
object MockObserver extends TopLevel[MockObserverStatic]

