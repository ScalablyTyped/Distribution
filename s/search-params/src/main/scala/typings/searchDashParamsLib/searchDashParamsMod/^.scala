package typings
package searchDashParamsLib.searchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(params: js.Object): java.lang.String = js.native
  def build(params: js.Object, opts: searchDashParamsLib.typingsEncodeMod.IOptions): java.lang.String = js.native
  def keep(path: java.lang.String, paramsToKeep: js.Array[java.lang.String]): searchDashParamsLib.searchDashParamsMod.IKeepResponse = js.native
  def keep(
    path: java.lang.String,
    paramsToKeep: js.Array[java.lang.String],
    opts: searchDashParamsLib.typingsEncodeMod.IOptions
  ): searchDashParamsLib.searchDashParamsMod.IKeepResponse = js.native
  def omit(path: java.lang.String, paramsToOmit: js.Array[java.lang.String]): searchDashParamsLib.searchDashParamsMod.IOmitResponse = js.native
  def omit(
    path: java.lang.String,
    paramsToOmit: js.Array[java.lang.String],
    opts: searchDashParamsLib.typingsEncodeMod.IOptions
  ): searchDashParamsLib.searchDashParamsMod.IOmitResponse = js.native
  def parse(path: java.lang.String): js.Object = js.native
  def parse(path: java.lang.String, opts: searchDashParamsLib.typingsEncodeMod.IOptions): js.Object = js.native
}

