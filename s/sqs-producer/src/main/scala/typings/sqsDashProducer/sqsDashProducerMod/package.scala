package typings.sqsDashProducer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsDashProducerMod {
  import typings.std.Error

  type ProducerCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[T], js.Any]
}
