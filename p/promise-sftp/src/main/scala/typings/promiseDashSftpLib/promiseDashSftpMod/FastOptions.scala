package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for `PromiseSftp#fast{Get,Put}` */
trait FastOptions extends js.Object {
  /**
    * Size of each read in bytes
    * @default 32768
    */
  var chunkSize: scala.Double
  /**
    * Number of concurrent reads
    * @default 25
    */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  /** Called every time a part of a file is transferred */
  var step: js.UndefOr[
    js.Function3[
      /* totalTransferred */ scala.Double, 
      /* chunk */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

object FastOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Double,
    concurrency: scala.Int | scala.Double = null,
    step: (/* totalTransferred */ scala.Double, /* chunk */ scala.Double, /* total */ scala.Double) => scala.Unit = null
  ): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction3(step))
    __obj.asInstanceOf[FastOptions]
  }
}

