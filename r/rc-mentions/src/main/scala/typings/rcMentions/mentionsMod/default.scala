package typings.rcMentions.mentionsMod

import typings.rcMentions.AnonFilterOption
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib/Mentions", JSImport.Default)
@js.native
class default protected () extends Mentions {
  def this(props: MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/lib/Mentions", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  var defaultProps: AnonFilterOption = js.native
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
}

