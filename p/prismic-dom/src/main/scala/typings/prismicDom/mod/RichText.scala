package typings.prismicDom.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichText extends js.Object {
  
  var Elements: typings.prismicDom.mod.Elements = js.native
  
  def asHtml(richText: js.Any): String = js.native
  def asHtml(richText: js.Any, linkResolver: js.UndefOr[scala.Nothing], serializer: HTMLSerializer[String]): String = js.native
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
