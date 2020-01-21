package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOpts extends js.Object {
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var instance: js.UndefOr[Ractive[Ractive[_]]] = js.undefined
  /**
  	 * The keypath to use for the link when handling a shuffle. For instance foo.1.bar will not shuffle with foo, but .bar will.
  	 */
  var keypath: js.UndefOr[String] = js.undefined
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var ractive: js.UndefOr[Ractive[Ractive[_]]] = js.undefined
}

object LinkOpts {
  @scala.inline
  def apply(instance: Ractive[Ractive[_]] = null, keypath: String = null, ractive: Ractive[Ractive[_]] = null): LinkOpts = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (keypath != null) __obj.updateDynamic("keypath")(keypath.asInstanceOf[js.Any])
    if (ractive != null) __obj.updateDynamic("ractive")(ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOpts]
  }
}

