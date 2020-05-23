package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextTitle extends js.Object {
  var contextTitle: String
  var openDocumentsInClient: Boolean
}

object ContextTitle {
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): ContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTitle]
  }
}

