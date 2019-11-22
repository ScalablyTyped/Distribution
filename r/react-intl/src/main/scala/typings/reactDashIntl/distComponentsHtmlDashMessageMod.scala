package typings.reactDashIntl

import typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
import typings.reactDashIntl.distComponentsHtmlDashMessageMod.FormattedHTMLMessage
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/html-message", JSImport.Namespace)
@js.native
object distComponentsHtmlDashMessageMod extends js.Object {
  @js.native
  trait FormattedHTMLMessage
    extends typings.reactDashIntl.distComponentsMessageMod.default[Record[String, PrimitiveType]]
  
  @js.native
  class default () extends FormattedHTMLMessage
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_Span = js.native
    var displayName: String = js.native
  }
  
}

