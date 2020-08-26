package typings.reactToolbox.radioBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * If true, the input element will be selected by default. Transferred from the parent.
    * @default false
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Callback invoked on mouse down.
    */
  var onMouseDown: js.UndefOr[js.Function] = js.native
}

object RadioProps {
  @scala.inline
  def apply(): RadioProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioProps]
  }
  @scala.inline
  implicit class RadioPropsOps[Self <: RadioProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnMouseDown(value: js.Function): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
  }
  
}

