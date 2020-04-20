package typings.reactHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetData extends js.Object {
  var base: HelmetDatum
  var bodyAttributes: HelmetHTMLBodyDatum
  var htmlAttributes: HelmetHTMLElementDatum
  var link: HelmetDatum
  var meta: HelmetDatum
  var noscript: HelmetDatum
  var script: HelmetDatum
  var style: HelmetDatum
  var title: HelmetDatum
  var titleAttributes: HelmetDatum
}

object HelmetData {
  @scala.inline
  def apply(
    base: HelmetDatum,
    bodyAttributes: HelmetHTMLBodyDatum,
    htmlAttributes: HelmetHTMLElementDatum,
    link: HelmetDatum,
    meta: HelmetDatum,
    noscript: HelmetDatum,
    script: HelmetDatum,
    style: HelmetDatum,
    title: HelmetDatum,
    titleAttributes: HelmetDatum
  ): HelmetData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetData]
  }
}

