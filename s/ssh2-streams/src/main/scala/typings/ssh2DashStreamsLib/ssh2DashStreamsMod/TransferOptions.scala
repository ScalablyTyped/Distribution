package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOptions extends js.Object {
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  /**
    * Integer or string representing the file mode to set for the uploaded file.
    */
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[
      /* total_transferred */ scala.Double, 
      /* chunk */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

object TransferOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    concurrency: scala.Int | scala.Double = null,
    mode: scala.Double | java.lang.String = null,
    step: js.Function3[
      /* total_transferred */ scala.Double, 
      /* chunk */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ] = null
  ): TransferOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[TransferOptions]
  }
}

