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
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawIndexMap]
  }
}

