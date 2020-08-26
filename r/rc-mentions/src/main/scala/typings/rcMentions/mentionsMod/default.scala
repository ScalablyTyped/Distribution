package typings.rcMentions.mentionsMod

import typings.rcMentions.anon.FilterOption
import typings.rcMentions.anon.PartialMentionsState
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es/Mentions", JSImport.Default)
@js.native
class default protected () extends Mentions {
  def this(props: MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/es/Mentions", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: SFC[OptionProps] = js.native
  var defaultProps: FilterOption = js.native
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
}

