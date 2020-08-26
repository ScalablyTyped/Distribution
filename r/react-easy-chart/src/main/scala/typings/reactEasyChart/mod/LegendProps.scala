package typings.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactEasyChart.anon.ColorString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendProps extends js.Object {
  /** Override the color of the items */
  var config: js.UndefOr[js.Array[ColorString]] = js.native
  var data: js.Array[_] = js.native
  var dataId: String = js.native
  /** change list items to inline-block (default block) */
  var horizontal: js.UndefOr[Boolean] = js.native
  /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.native
}

object LegendProps {
  @scala.inline
  def apply(data: js.Array[_], dataId: String): LegendProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
  @scala.inline
  implicit class LegendPropsOps[Self <: LegendProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataId(value: String): Self = this.set("dataId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigVarargs(value: ColorString*): Self = this.set("config", js.Array(value :_*))
    @scala.inline
    def setConfig(value: js.Array[ColorString]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setStyles(value: StringDictionary[CSSProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

