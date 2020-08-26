package typings.rcMentions

import typings.rcMentions.anon.FilterOption
import typings.rcMentions.anon.PartialMentionsState
import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.mentionsMod.MentionsState
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rcMentions.mentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: SFC[OptionProps] = js.native
    var defaultProps: FilterOption = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
  }
  
}

