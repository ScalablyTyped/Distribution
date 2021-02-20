package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a callout action menu entry */
@JSGlobal("CalloutActionMenuEntry")
@js.native
class CalloutActionMenuEntry protected ()
  extends typings.sharepoint.CalloutActionMenuEntry {
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
        /* actionMenuEntry */ typings.sharepoint.CalloutActionMenuEntry, 
        /* actionMenuEntryIndex */ Double, 
        Unit
      ],
    wzISrc: String,
    wzIAlt: String,
    wzISeq: Double,
    wzDesc: String
  ) = this()
}
