package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsWithStyles extends js.Object {
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
}

object PropsWithStyles {
  @scala.inline
  def apply(getStyles: (String, js.Any) => js.Object): PropsWithStyles = {
    val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction2(getStyles))
    __obj.asInstanceOf[PropsWithStyles]
  }
  @scala.inline
  implicit class PropsWithStylesOps[Self <: PropsWithStyles] (val x: Self) extends AnyVal {
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
    def setGetStyles(value: (String, js.Any) => js.Object): Self = this.set("getStyles", js.Any.fromFunction2(value))
  }
  
}

