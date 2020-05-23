package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOptions extends js.Object {
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /**
    * Integer or string representing the file mode to set for the uploaded file.
    */
  var mode: js.UndefOr[Double | String] = js.undefined
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[/* total_transferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}

object TransferOptions {
  @scala.inline
  def apply(
    chunkSize: js.UndefOr[Double] = js.undefined,
    concurrency: js.UndefOr[Double] = js.undefined,
    mode: Double | String = null,
    step: (/* total_transferred */ Double, /* chunk */ Double, /* total */ Double) => Unit = null
  ): TransferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction3(step))
    __obj.asInstanceOf[TransferOptions]
  }
}

