package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawIndexMap extends StartOfSourceMap {
  var sections: js.Array[RawSection]
  var version: Double
}

object RawIndexMap {
  @scala.inline
  def apply(
    sections: js.Array[RawSection],
    version: Double,
    file: String = null,
    skipValidation: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null
  ): RawIndexMap = {
    val __obj = js.Dynamic.literal(sections = sections, version = version)
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[RawIndexMap]
  }
}

