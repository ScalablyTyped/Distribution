package typings.qlikDashEngineapi.EngineAPI

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
  var qAppSpecific: Boolean
  /**
    * Information about publishing and permissions.
    */
  var qMeta: INxMeta
  /**
    * Name of the library.
    */
  var qName: String
}

object IContentLibraryListItem {
  @scala.inline
  def apply(qAppSpecific: Boolean, qMeta: INxMeta, qName: String): IContentLibraryListItem = {
    val __obj = js.Dynamic.literal(qAppSpecific = qAppSpecific.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IContentLibraryListItem]
  }
}

