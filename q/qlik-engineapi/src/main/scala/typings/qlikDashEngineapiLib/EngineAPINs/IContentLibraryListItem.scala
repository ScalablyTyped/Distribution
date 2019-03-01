package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContentLibraryListItem...
  */
trait IContentLibraryListItem extends js.Object {
  /**
    * Is set to true if the library is specific to the app (not a global content library).
    */
  var qAppSpecific: scala.Boolean
  /**
    * Information about publishing and permissions.
    */
  var qMeta: INxMeta
  /**
    * Name of the library.
    */
  var qName: java.lang.String
}

object IContentLibraryListItem {
  @scala.inline
  def apply(qAppSpecific: scala.Boolean, qMeta: INxMeta, qName: java.lang.String): IContentLibraryListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAppSpecific")(qAppSpecific)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[IContentLibraryListItem]
  }
}

