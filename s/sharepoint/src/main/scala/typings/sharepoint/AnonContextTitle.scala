package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextTitle extends js.Object {
  var contextTitle: String
  var openDocumentsInClient: Boolean
}

object AnonContextTitle {
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): AnonContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextTitle]
  }
}

