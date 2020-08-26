package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* widgetId */ StringDictionary[js.Any] {
  var aroundLatLng: Boolean = js.native
}

object Dictkey {
  @scala.inline
  def apply(aroundLatLng: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAroundLatLng(value: Boolean): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
  }
  
}

