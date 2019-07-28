package typings.rcDashMentions.esMod

import typings.rcDashMentions.Anon_FilterOption
import typings.rcDashMentions.esMentionsMod.MentionsProps
import typings.rcDashMentions.esMentionsMod.MentionsState
import typings.rcDashMentions.esOptionMod.OptionProps
import typings.react.reactMod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es", JSImport.Default)
@js.native
class default protected ()
  extends typings.rcDashMentions.esMentionsMod.default {
  def this(props: MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/es", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: FunctionComponent[OptionProps] = js.native
  var defaultProps: Anon_FilterOption = js.native
  def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
}

