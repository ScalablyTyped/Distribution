package typings
package reactDashNativeDashSvgDashUriLib.reactDashNativeDashSvgDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SvgUriProps extends js.Object {
  /**
     * Fill color for the svg object
     */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The height of the rendered svg
     */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
     * Source path for the .svg file
     * Expects a require('path') to the file or object with uri.
     * e.g. source={require('my-path')}
     * e.g. source={{ur: 'my-path'}}
     */
  var source: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
     * Direct svg code to render. Similar to inline svg
     */
  var svgXmlData: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The width of the rendered svg
     */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

