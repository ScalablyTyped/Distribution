package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectHTMLAttributes[T] extends HTMLAttributes[T] {
  var classID: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
}

object ObjectHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    classID: String = null,
    data: String = null,
    form: String = null,
    height: Double | String = null,
    name: String = null,
    `type`: String = null,
    useMap: String = null,
    width: Double | String = null,
    wmode: String = null
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

