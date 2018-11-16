package typings
package sharepointLib

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
  def this(text: java.lang.String, onClickCallback: js.Function2[
      /* actionMenuEntry */ CalloutActionMenuEntry, 
      /* actionMenuEntryIndex */ scala.Double, 
      scala.Unit
    ], wzISrc: java.lang.String, wzIAlt: java.lang.String, wzISeq: scala.Double, wzDesc: java.lang.String) = this()
}

