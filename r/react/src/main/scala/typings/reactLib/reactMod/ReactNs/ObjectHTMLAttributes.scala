package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectHTMLAttributes[T] extends HTMLAttributes[T] {
  var classID: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var useMap: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var wmode: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    classID: java.lang.String = null,
    data: java.lang.String = null,
    form: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null,
    useMap: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    wmode: java.lang.String = null
  ): ObjectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (classID != null) __obj.updateDynamic("classID")(classID)
    if (data != null) __obj.updateDynamic("data")(data)
    if (form != null) __obj.updateDynamic("form")(form)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (useMap != null) __obj.updateDynamic("useMap")(useMap)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    __obj.asInstanceOf[ObjectHTMLAttributes[T]]
  }
}

