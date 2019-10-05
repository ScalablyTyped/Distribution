package typings.rcDashMentions

import typings.rcDashMentions.libMentionsMod.MentionsProps
import typings.rcDashMentions.libMentionsMod.MentionsState
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.react.reactMod.FunctionComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rcDashMentions.libMentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: FunctionComponent[OptionProps] = js.native
    var defaultProps: Anon_FilterOptionHasValue = js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): Partial[MentionsState] = js.native
  }
  
}

