package typings.sqsDashProducer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsDashProducerMod {
  type ProducerCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[T], js.Any]
}
