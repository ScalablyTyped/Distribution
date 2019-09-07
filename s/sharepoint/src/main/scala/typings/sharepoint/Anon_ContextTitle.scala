package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextTitle extends js.Object {
  var contextTitle: String
  var openDocumentsInClient: Boolean
}

object Anon_ContextTitle {
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): Anon_ContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle, openDocumentsInClient = openDocumentsInClient)
  
    __obj.asInstanceOf[Anon_ContextTitle]
  }
}

