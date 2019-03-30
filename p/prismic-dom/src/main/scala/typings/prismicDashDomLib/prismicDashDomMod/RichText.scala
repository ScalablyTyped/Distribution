package typings
package prismicDashDomLib.prismicDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichText extends js.Object {
  var Elements: prismicDashDomLib.Elements = js.native
  def asHtml(richText: js.Any): java.lang.String = js.native
  def asHtml(richText: js.Any, linkResolver: js.Function1[/* doc */ js.Any, java.lang.String]): java.lang.String = js.native
  def asHtml(
    richText: js.Any,
    linkResolver: js.Function1[/* doc */ js.Any, java.lang.String],
    serializer: prismicDashDomLib.HTMLSerializer[java.lang.String]
  ): java.lang.String = js.native
  def asText(richText: js.Any): java.lang.String = js.native
  def asText(richText: js.Any, joinString: java.lang.String): java.lang.String = js.native
}

