package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.reactDashIntl.Anon_Values
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsMessageMod.default
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "FormattedMessage")
@js.native
class FormattedMessage[V /* <: Record[String, _] */] protected () extends default[V] {
  def this(props: Props[V], context: ContextType[Context[IntlShape]]) = this()
}

/* static members */
@JSImport("react-intl", "FormattedMessage")
@js.native
object FormattedMessage extends js.Object {
  var contextType: Context[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/types.IntlShape */ _
  ] = js.native
  var defaultProps: Anon_Values = js.native
  var displayName: String = js.native
}

