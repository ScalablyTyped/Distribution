package typings.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mentionsMod {
  type BaseTextareaAttrs = typings.rcMentions.utilMod.Omit_[
    typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
    typings.rcMentions.rcMentionsStrings.prefix | typings.rcMentions.rcMentionsStrings.onChange | typings.rcMentions.rcMentionsStrings.onSelect
  ]
}
