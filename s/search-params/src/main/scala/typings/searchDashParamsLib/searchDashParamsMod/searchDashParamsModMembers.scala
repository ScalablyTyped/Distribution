package typings
package searchDashParamsLib.searchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", JSImport.Namespace)
@js.native
object searchDashParamsModMembers extends js.Object {
  def build(params: js.Object): java.lang.String = js.native
  def build(params: js.Object, opts: searchDashParamsLib.typingsEncodeMod.IOptions): java.lang.String = js.native
  def keep(path: java.lang.String, paramsToKeep: js.Array[java.lang.String]): IKeepResponse = js.native
  def keep(
    path: java.lang.String,
    paramsToKeep: js.Array[java.lang.String],
    opts: searchDashParamsLib.typingsEncodeMod.IOptions
  ): IKeepResponse = js.native
  def omit(path: java.lang.String, paramsToOmit: js.Array[java.lang.String]): IOmitResponse = js.native
  def omit(
    path: java.lang.String,
    paramsToOmit: js.Array[java.lang.String],
    opts: searchDashParamsLib.typingsEncodeMod.IOptions
  ): IOmitResponse = js.native
  def parse(path: java.lang.String): js.Object = js.native
  def parse(path: java.lang.String, opts: searchDashParamsLib.typingsEncodeMod.IOptions): js.Object = js.native
}

