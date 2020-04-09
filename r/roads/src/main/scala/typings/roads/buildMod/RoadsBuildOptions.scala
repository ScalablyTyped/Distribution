package typings.roads.buildMod

import typings.babelify.mod.BabelifyOptions
import typings.browserify.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @param  {boolean} [options.use_sourcemaps] Whether or not the build process should include source maps.
  * @param  {Object} [options.envify] An object to pass to envify. This allows you to change values between your server and client scripts.
  * @param  {Array} [options.exclude] An array of files that should not be included in the build process.
  * @param  {Object} [options.babelify] An object containing parameters to pass to the babelify transform
  */
trait RoadsBuildOptions extends js.Object {
  var babelifyOptions: js.UndefOr[BabelifyOptions] = js.undefined
  var browserifyOptions: js.UndefOr[Options] = js.undefined
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RoadsBuildOptions {
  @scala.inline
  def apply(
    babelifyOptions: BabelifyOptions = null,
    browserifyOptions: Options = null,
    exclude: String | js.Array[String] = null,
    ignore: String | js.Array[String] = null
  ): RoadsBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (babelifyOptions != null) __obj.updateDynamic("babelifyOptions")(babelifyOptions.asInstanceOf[js.Any])
    if (browserifyOptions != null) __obj.updateDynamic("browserifyOptions")(browserifyOptions.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsBuildOptions]
  }
}

