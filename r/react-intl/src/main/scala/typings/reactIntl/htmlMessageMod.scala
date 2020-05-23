package typings.reactIntl

import typings.intlMessageformat.mod.PrimitiveType
import typings.reactIntl.anon.TagName
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/html-message", JSImport.Namespace)
@js.native
object htmlMessageMod extends js.Object {
  @js.native
  trait FormattedHTMLMessage
    extends typings.reactIntl.messageMod.default[Record[String, PrimitiveType]]
  
  @js.native
  class default () extends FormattedHTMLMessage
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: TagName = js.native
    var displayName: String = js.native
  }
  
}

