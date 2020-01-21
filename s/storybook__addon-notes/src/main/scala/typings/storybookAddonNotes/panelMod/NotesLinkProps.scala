package typings.storybookAddonNotes.panelMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotesLinkProps extends js.Object {
  var children: ReactElement
  var href: String
}

object NotesLinkProps {
  @scala.inline
  def apply(children: ReactElement, href: String): NotesLinkProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotesLinkProps]
  }
}

