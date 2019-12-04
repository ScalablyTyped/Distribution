package typings.rollupDashPluginDashTypescript2.distTscacheMod

import typings.typescript.typescriptMod.OutputFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICode extends js.Object {
  var code: String
  var dts: js.UndefOr[OutputFile] = js.undefined
  var dtsmap: js.UndefOr[OutputFile] = js.undefined
  var map: js.UndefOr[String] = js.undefined
  var references: js.UndefOr[js.Array[String]] = js.undefined
}

object ICode {
  @scala.inline
  def apply(
    code: String,
    dts: OutputFile = null,
    dtsmap: OutputFile = null,
    map: String = null,
    references: js.Array[String] = null
  ): ICode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (dts != null) __obj.updateDynamic("dts")(dts.asInstanceOf[js.Any])
    if (dtsmap != null) __obj.updateDynamic("dtsmap")(dtsmap.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICode]
  }
}

