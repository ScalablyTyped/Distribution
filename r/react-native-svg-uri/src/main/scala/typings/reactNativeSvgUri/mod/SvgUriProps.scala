package typings.reactNativeSvgUri.mod

import typings.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgUriProps extends js.Object {
  /**
    * Fill color for the svg object
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * The height of the rendered svg
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Source path for the .svg file
    * Expects a require('path') to the file or object with uri.
    * e.g. source={require('my-path')}
    * e.g. source={{ur: 'my-path'}}
    */
  var source: js.UndefOr[ImageURISource] = js.native
  /**
    * Direct svg code to render. Similar to inline svg
    */
  var svgXmlData: js.UndefOr[String] = js.native
  /**
    * The width of the rendered svg
    */
  var width: js.UndefOr[Double | String] = js.native
}

object SvgUriProps {
  @scala.inline
  def apply(): SvgUriProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgUriProps]
  }
  @scala.inline
  implicit class SvgUriPropsOps[Self <: SvgUriProps] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSource(value: ImageURISource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSvgXmlData(value: String): Self = this.set("svgXmlData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgXmlData: Self = this.set("svgXmlData", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

