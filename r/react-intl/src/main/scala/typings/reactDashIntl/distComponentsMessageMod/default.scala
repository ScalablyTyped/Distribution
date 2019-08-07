package typings.reactDashIntl.distComponentsMessageMod

import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.reactDashIntl.Anon_Values
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/message", JSImport.Default)
@js.native
class default[V /* <: Record[String, _] */] protected () extends FormattedMessage[V] {
  def this(props: Props[V], context: ContextType[Context[IntlShape]]) = this()
}

/* static members */
@JSImport("react-intl/dist/components/message", JSImport.Default)
@js.native
object default extends js.Object {
  var contextType: Context[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/types.IntlShape */ _
  ] = js.native
  var defaultProps: Anon_Values = js.native
  var displayName: String = js.native
}

