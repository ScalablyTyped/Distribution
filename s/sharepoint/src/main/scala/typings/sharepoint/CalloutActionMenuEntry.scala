package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a callout action menu entry */
@JSGlobal("CalloutActionMenuEntry")
@js.native
class CalloutActionMenuEntry protected () extends js.Object {
  /** Creates a callout action menu entry
    @param text Text to be displayed as the menu item text
    @param onClickCallback Callback that will be fired when the item is clicked
    @param wzISrc Url of the icon
    @param wzIAlt Alternative text for the icon image
    @param wzISeq Sequence for the menu item
    @param wzDesc Description of the menu item */
  def this(
    text: String,
    onClickCallback: js.Function2[
        /* actionMenuEntry */ CalloutActionMenuEntry, 
        /* actionMenuEntryIndex */ Double, 
        Unit
      ],
    wzISrc: String,
    wzIAlt: String,
    wzISeq: Double,
    wzDesc: String
  ) = this()
}

