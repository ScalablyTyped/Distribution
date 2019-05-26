package typings
package rcDashMentionsLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib", JSImport.Default)
@js.native
class default protected ()
  extends rcDashMentionsLib.libMentionsMod.default {
  def this(props: rcDashMentionsLib.libMentionsMod.MentionsProps) = this()
}

/* static members */
@JSImport("rc-mentions/lib", JSImport.Default)
@js.native
object default extends js.Object {
  var Option: reactLib.reactMod.FunctionComponent[rcDashMentionsLib.libOptionMod.OptionProps] = js.native
  var defaultProps: rcDashMentionsLib.Anon_FilterOptionHasValue = js.native
  def getDerivedStateFromProps(
    props: rcDashMentionsLib.libMentionsMod.MentionsProps,
    prevState: rcDashMentionsLib.libMentionsMod.MentionsState
  ): stdLib.Partial[rcDashMentionsLib.libMentionsMod.MentionsState] = js.native
}

