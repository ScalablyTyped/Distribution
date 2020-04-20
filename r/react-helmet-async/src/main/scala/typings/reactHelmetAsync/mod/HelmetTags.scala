package typings.reactHelmetAsync.mod

import typings.std.HTMLLinkElement
import typings.std.HTMLMetaElement
import typings.std.HTMLScriptElement
import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetTags extends js.Object {
  var baseTag: js.Array[_]
  var linkTags: js.Array[HTMLLinkElement]
  var metaTags: js.Array[HTMLMetaElement]
  var noscriptTags: js.Array[_]
  var scriptTags: js.Array[HTMLScriptElement]
  var styleTags: js.Array[HTMLStyleElement]
}

object HelmetTags {
  @scala.inline
  def apply(
    baseTag: js.Array[_],
    linkTags: js.Array[HTMLLinkElement],
    metaTags: js.Array[HTMLMetaElement],
    noscriptTags: js.Array[_],
    scriptTags: js.Array[HTMLScriptElement],
    styleTags: js.Array[HTMLStyleElement]
  ): HelmetTags = {
    val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetTags]
  }
}

