package typings
package rcDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMentionsMod {
  type BaseTextareaAttrs = rcDashMentionsLib.libUtilMod.Omit[
    reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement], 
    rcDashMentionsLib.rcDashMentionsLibStrings.prefix | rcDashMentionsLib.rcDashMentionsLibStrings.onChange | rcDashMentionsLib.rcDashMentionsLibStrings.onSelect
  ]
}
