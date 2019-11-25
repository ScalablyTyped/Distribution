package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#dependencies
trait RevealDependency extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var src: String
}

object RevealDependency {
  @scala.inline
  def apply(
    src: String,
    async: js.UndefOr[Boolean] = js.undefined,
    callback: () => Unit = null,
    condition: () => Boolean = null
  ): RevealDependency = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction0(condition))
    __obj.asInstanceOf[RevealDependency]
  }
}

