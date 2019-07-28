package typings.rcDashMentions

import typings.rcDashMentions.esUtilMod.Omit
import typings.rcDashMentions.rcDashMentionsStrings.onChange
import typings.rcDashMentions.rcDashMentionsStrings.onSelect
import typings.rcDashMentions.rcDashMentionsStrings.prefix
import typings.react.reactMod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMentionsMod {
  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
