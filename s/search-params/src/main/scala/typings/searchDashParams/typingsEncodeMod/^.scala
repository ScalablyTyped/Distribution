package typings.searchDashParams.typingsEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("search-params/typings/encode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(value: js.Any, opts: IFinalOptions): String | Boolean = js.native
  def encode(name: String, value: js.Any, opts: IFinalOptions): String = js.native
  def encodeArray(name: String, arr: js.Array[_], opts: IFinalOptions): String = js.native
  def makeOptions(): IFinalOptions = js.native
  def makeOptions(opts: IOptions): IFinalOptions = js.native
}

