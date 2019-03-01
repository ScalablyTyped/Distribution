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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("bodyAttributes")(bodyAttributes)
    __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("noscript")(noscript)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleAttributes")(titleAttributes)
    __obj.asInstanceOf[HelmetData]
  }
}

