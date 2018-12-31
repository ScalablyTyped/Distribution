package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaBaseProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The fill color for the component.
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The opacity of the fill (between 0 and 1). Gets multiplied with the fill colors alpha value.
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke (line) color for the component.
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeLinecap: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.flat | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel
  ] = js.undefined
  var strokeLinejoin: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.miter | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel
  ] = js.undefined
  /**
    * How far to extend the stroke at a sharp corner when using `strokeLinejoin='miter'`
    * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-miterlimit
    * for a more detailed explanation.
    */
  var strokeMiterlimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The opacity of the stroke (between 0 and 1). Gets multiplied with the stroke colors alpha value.
    */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of transformations to apply to the component (are quite similar to SVG transformations). Example for multiple transformations: `transform="translate(100, 100) rotate(90)"`.
    *
    * All x and y coordinates specified in a transformation are relative _to the component itself_, meaning that `translate(-50%, 0)` will translate the component by 50% of it's own width to left.
    */
  var transform: js.UndefOr[java.lang.String] = js.undefined
}

