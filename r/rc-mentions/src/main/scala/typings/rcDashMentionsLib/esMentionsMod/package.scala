package typings
package rcDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMentionsMod {
  type BaseTextareaAttrs = rcDashMentionsLib.esUtilMod.Omit[
    reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement], 
    rcDashMentionsLib.rcDashMentionsLibStrings.prefix | rcDashMentionsLib.rcDashMentionsLibStrings.onChange | rcDashMentionsLib.rcDashMentionsLibStrings.onSelect
  ]
}
