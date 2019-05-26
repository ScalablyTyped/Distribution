package typings
package rcDashMentionsLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es", JSImport.Default)
@js.native
class default protected ()
  extends rcDashMentionsLib.esMentionsMod.default {
  def this(props: rcDashMentionsLib.esMentionsMod.MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/es", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: reactLib.reactMod.FunctionComponent[rcDashMentionsLib.esOptionMod.OptionProps] = js.native
  var defaultProps: rcDashMentionsLib.Anon_FilterOption = js.native
  def getDerivedStateFromProps(
    props: rcDashMentionsLib.esMentionsMod.MentionsProps,
    prevState: rcDashMentionsLib.esMentionsMod.MentionsState
  ): stdLib.Partial[rcDashMentionsLib.esMentionsMod.MentionsState] = js.native
}

