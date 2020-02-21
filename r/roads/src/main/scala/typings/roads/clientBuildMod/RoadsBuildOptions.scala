package typings.roads.clientBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadsBuildOptions extends js.Object {
  var babelify: js.UndefOr[js.Any] = js.undefined
  var envify: js.UndefOr[js.Any] = js.undefined
  var exclude: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Any] = js.undefined
  var ignore_missing: js.UndefOr[js.Any] = js.undefined
  var use_sourcemaps: js.UndefOr[js.Any] = js.undefined
}

object RoadsBuildOptions {
  @scala.inline
  def apply(
    babelify: js.Any = null,
    envify: js.Any = null,
    exclude: js.Any = null,
    ignore: js.Any = null,
    ignore_missing: js.Any = null,
    use_sourcemaps: js.Any = null
  ): RoadsBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (babelify != null) __obj.updateDynamic("babelify")(babelify.asInstanceOf[js.Any])
    if (envify != null) __obj.updateDynamic("envify")(envify.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (ignore_missing != null) __obj.updateDynamic("ignore_missing")(ignore_missing.asInstanceOf[js.Any])
    if (use_sourcemaps != null) __obj.updateDynamic("use_sourcemaps")(use_sourcemaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsBuildOptions]
  }
}

