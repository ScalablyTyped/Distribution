package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupInfo extends js.Object {
  var localString: java.lang.String
  var value: scala.Double
}

object ILookupInfo {
  @scala.inline
  def apply(localString: java.lang.String, value: scala.Double): ILookupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localString")(localString)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ILookupInfo]
  }
}

