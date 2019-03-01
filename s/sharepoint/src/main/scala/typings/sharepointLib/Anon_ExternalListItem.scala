package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalListItem extends js.Object {
  var ExternalListItem: scala.Boolean
  var FsObjType: scala.Double
  var Id: scala.Double
  var Url: java.lang.String
}

object Anon_ExternalListItem {
  @scala.inline
  def apply(ExternalListItem: scala.Boolean, FsObjType: scala.Double, Id: scala.Double, Url: java.lang.String): Anon_ExternalListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ExternalListItem")(ExternalListItem)
    __obj.updateDynamic("FsObjType")(FsObjType)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Anon_ExternalListItem]
  }
}

