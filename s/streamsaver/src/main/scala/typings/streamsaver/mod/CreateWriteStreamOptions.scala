package typings.streamsaver.mod

import typings.std.QueuingStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWriteStreamOptions[I, O] extends js.Object {
  /**
    * URL to serve the stream from. This is the URL that the browser is going to request from the service worker.
    * You might need to provide this if you're using a custom service worker.
    */
  var pathname: js.UndefOr[String] = js.undefined
  var readableStrategy: js.UndefOr[QueuingStrategy[O]] = js.undefined
  /**
    * Indicates the size of the streamed data and allows the browser to show progress while downloading.
    */
  var size: js.UndefOr[Double] = js.undefined
  var writableStrategy: js.UndefOr[QueuingStrategy[I]] = js.undefined
}

object CreateWriteStreamOptions {
  @scala.inline
  def apply[I, O](
    pathname: String = null,
    readableStrategy: QueuingStrategy[O] = null,
    size: js.UndefOr[Double] = js.undefined,
    writableStrategy: QueuingStrategy[I] = null
  ): CreateWriteStreamOptions[I, O] = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (readableStrategy != null) __obj.updateDynamic("readableStrategy")(readableStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (writableStrategy != null) __obj.updateDynamic("writableStrategy")(writableStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWriteStreamOptions[I, O]]
  }
}

