package typings.searchParams.mod

import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("search-params", "omit")
@js.native
object omit extends js.Object {
  
  def apply(path: String, paramsToOmit: js.Array[String]): IOmitResponse = js.native
  def apply(path: String, paramsToOmit: js.Array[String], opts: IOptions): IOmitResponse = js.native
}
