package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupInfo extends js.Object {
  var localString: String
  var value: Double
}

object ILookupInfo {
  @scala.inline
  def apply(localString: String, value: Double): ILookupInfo = {
    val __obj = js.Dynamic.literal(localString = localString, value = value)
  
    __obj.asInstanceOf[ILookupInfo]
  }
}

