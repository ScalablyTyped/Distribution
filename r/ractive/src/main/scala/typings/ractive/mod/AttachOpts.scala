package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachOpts extends js.Object {
  /** If the target anchor is already occupied, this instance will be moved to the end of the queue to occupy it, meaning that all of the other attached instances will need to be detached before this one can occupy the anchor. */
  var append: js.UndefOr[Boolean] = js.undefined
  /** The index of the position in the queue for the target anchor at which to insert this instance. 0 is equivalent to prepend: true. */
  var insertAt: js.UndefOr[Double] = js.undefined
  /** If the target anchor is already occupied, this instance will be moved to the beginning of the queue to occupy it, meaning it will replace the instance currently occupying the anchor. */
  var prepend: js.UndefOr[Boolean] = js.undefined
  /** The name of an anchor to attach a child to e.g. 'foo' for <#foo />. */
  var target: js.UndefOr[String] = js.undefined
}

object AttachOpts {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    insertAt: js.UndefOr[Double] = js.undefined,
    prepend: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): AttachOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertAt)) __obj.updateDynamic("insertAt")(insertAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachOpts]
  }
}

