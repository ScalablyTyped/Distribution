package typings.primus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def decoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit
  def encoder(data: js.Any, fn: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit
}

object Parser {
  @scala.inline
  def apply(
    decoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit,
    encoder: (js.Any, js.Function2[/* error */ Error, /* response */ js.Any, Unit]) => Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(decoder = js.Any.fromFunction2(decoder), encoder = js.Any.fromFunction2(encoder))
    __obj.asInstanceOf[Parser]
  }
}

