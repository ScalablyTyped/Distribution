package typings.searchDashParams.searchDashParamsMod

import typings.searchDashParams.typingsEncodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(params: js.Object): String = js.native
  def build(params: js.Object, opts: IOptions): String = js.native
  def keep(path: String, paramsToKeep: js.Array[String]): IKeepResponse = js.native
  def keep(path: String, paramsToKeep: js.Array[String], opts: IOptions): IKeepResponse = js.native
  def omit(path: String, paramsToOmit: js.Array[String]): IOmitResponse = js.native
  def omit(path: String, paramsToOmit: js.Array[String], opts: IOptions): IOmitResponse = js.native
  def parse(path: String): js.Object = js.native
  def parse(path: String, opts: IOptions): js.Object = js.native
}

