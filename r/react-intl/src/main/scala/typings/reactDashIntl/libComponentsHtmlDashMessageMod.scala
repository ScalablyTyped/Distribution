package typings.reactDashIntl

import typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/html-message", JSImport.Namespace)
@js.native
object libComponentsHtmlDashMessageMod extends js.Object {
  @js.native
  trait FormattedHTMLMessage
    extends typings.reactDashIntl.libComponentsMessageMod.default[Record[String, PrimitiveType]]
  
  @js.native
  class default () extends FormattedHTMLMessage
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_Span = js.native
    var displayName: String = js.native
  }
  
}

