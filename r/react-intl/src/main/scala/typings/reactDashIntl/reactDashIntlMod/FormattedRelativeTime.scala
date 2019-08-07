package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.reactDashIntl.Anon_CurrentValueInSeconds
import typings.reactDashIntl.distComponentsRelativeMod.Props
import typings.reactDashIntl.distComponentsRelativeMod.State
import typings.reactDashIntl.distComponentsRelativeMod.default
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlStrings.unit
import typings.reactDashIntl.reactDashIntlStrings.value
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "FormattedRelativeTime")
@js.native
class FormattedRelativeTime protected () extends default {
  def this(props: Props, context: ContextType[Context[IntlShape]]) = this()
}

/* static members */
@JSImport("react-intl", "FormattedRelativeTime")
@js.native
object FormattedRelativeTime extends js.Object {
  var contextType: Context[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/types.IntlShape */ _
  ] = js.native
  var defaultProps: Pick[Props, unit | value] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State): Anon_CurrentValueInSeconds | Null = js.native
}

