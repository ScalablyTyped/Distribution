package typings.std

import typings.std.stdStrings.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingByteSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var `type`: bytes
}

object UnderlyingByteSource {
  @scala.inline
  def apply(
    `type`: bytes,
    autoAllocateChunkSize: js.UndefOr[Double] = js.undefined,
    cancel: /* reason */ js.Any => Unit | js.Thenable[Unit] = null,
    pull: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit] = null,
    start: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit] = null
  ): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAllocateChunkSize)) __obj.updateDynamic("autoAllocateChunkSize")(autoAllocateChunkSize.get.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[UnderlyingByteSource]
  }
}

