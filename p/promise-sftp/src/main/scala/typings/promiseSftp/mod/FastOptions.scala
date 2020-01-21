package typings.promiseSftp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for `PromiseSftp#fast{Get,Put}` */
trait FastOptions extends js.Object {
  /**
    * Size of each read in bytes
    * @default 32768
    */
  var chunkSize: Double
  /**
    * Number of concurrent reads
    * @default 25
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /** Called every time a part of a file is transferred */
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}

object FastOptions {
  @scala.inline
  def apply(
    chunkSize: Double,
    concurrency: Int | Double = null,
    step: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit = null
  ): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction3(step))
    __obj.asInstanceOf[FastOptions]
  }
}

