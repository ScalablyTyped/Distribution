package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includePrerelease: js.UndefOr[Boolean] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(includePrerelease: js.UndefOr[Boolean] = js.undefined, loose: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includePrerelease)) __obj.updateDynamic("includePrerelease")(includePrerelease.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

