package typings.prismicDashDom.prismicDashDomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichText extends js.Object {
  var Elements: typings.prismicDashDom.prismicDashDomMod.Elements = js.native
  def asHtml(richText: js.Any): String = js.native
  def asHtml(richText: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
  def asHtml(
    richText: js.Any,
    linkResolver: js.Function1[/* doc */ js.Any, String],
    serializer: HTMLSerializer[String]
  ): String = js.native
  def asText(richText: js.Any): String = js.native
  def asText(richText: js.Any, joinString: String): String = js.native
}

@JSImport("prismic-dom", "RichText")
@js.native
object RichText extends TopLevel[RichText]

