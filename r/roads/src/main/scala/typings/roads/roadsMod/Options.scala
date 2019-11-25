package typings.roads.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var babelify: js.UndefOr[Option] = js.undefined
  var envify: js.UndefOr[Option] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var external: js.UndefOr[js.Any] = js.undefined
  var use_sourcemaps: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    babelify: Option = null,
    envify: Option = null,
    exclude: js.Array[String] = null,
    external: js.Any = null,
    use_sourcemaps: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (babelify != null) __obj.updateDynamic("babelify")(babelify.asInstanceOf[js.Any])
    if (envify != null) __obj.updateDynamic("envify")(envify.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (!js.isUndefined(use_sourcemaps)) __obj.updateDynamic("use_sourcemaps")(use_sourcemaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

