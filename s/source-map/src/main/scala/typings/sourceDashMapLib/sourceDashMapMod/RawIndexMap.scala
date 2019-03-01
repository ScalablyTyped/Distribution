package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawIndexMap extends StartOfSourceMap {
  var sections: js.Array[RawSection]
  var version: scala.Double
}

object RawIndexMap {
  @scala.inline
  def apply(
    sections: js.Array[RawSection],
    version: scala.Double,
    file: java.lang.String = null,
    skipValidation: js.UndefOr[scala.Boolean] = js.undefined,
    sourceRoot: java.lang.String = null
  ): RawIndexMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sections")(sections)
    __obj.updateDynamic("version")(version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[RawIndexMap]
  }
}

