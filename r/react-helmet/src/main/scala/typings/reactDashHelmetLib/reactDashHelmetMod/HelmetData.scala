package typings
package reactDashHelmetLib.reactDashHelmetMod

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
    val __obj = js.Dynamic.literal(base = base, bodyAttributes = bodyAttributes, htmlAttributes = htmlAttributes, link = link, meta = meta, noscript = noscript, script = script, style = style, title = title, titleAttributes = titleAttributes)
  
    __obj.asInstanceOf[HelmetData]
  }
}

