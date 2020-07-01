package typings.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mentionsMod {
  type BaseTextareaAttrs = typings.rcMentions.utilMod.Omit_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextAreaProps */ js.Any, 
    typings.rcMentions.rcMentionsStrings.prefix | typings.rcMentions.rcMentionsStrings.onChange | typings.rcMentions.rcMentionsStrings.onSelect
  ]
}
