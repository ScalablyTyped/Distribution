package typings
package reactDashSpinkitLib.reactDashSpinkitMod.spinnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  /**
    * Component className.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Programmatically set the color of the spinners (does not work
    * for circle or folding-cube); this can either be a hex value or a color word
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the time before the spinner fades in
    */
  var fadeIn: js.UndefOr[
    reactDashSpinkitLib.reactDashSpinkitLibStrings.full | reactDashSpinkitLib.reactDashSpinkitLibStrings.half | reactDashSpinkitLib.reactDashSpinkitLibStrings.quarter | reactDashSpinkitLib.reactDashSpinkitLibStrings.none
  ] = js.undefined
  /**
    * Specify spinner to use.
    */
  var name: js.UndefOr[
    reactDashSpinkitLib.reactDashSpinkitLibStrings.`three-bounce` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`double-bounce` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`rotating-plane` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`folding-cube` | reactDashSpinkitLib.reactDashSpinkitLibStrings.wave | reactDashSpinkitLib.reactDashSpinkitLibStrings.`wandering-cubes` | reactDashSpinkitLib.reactDashSpinkitLibStrings.pulse | reactDashSpinkitLib.reactDashSpinkitLibStrings.`chasing-dots` | reactDashSpinkitLib.reactDashSpinkitLibStrings.circle | reactDashSpinkitLib.reactDashSpinkitLibStrings.`cube-grid` | reactDashSpinkitLib.reactDashSpinkitLibStrings.wordpress | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-grid-beat` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-grid-pulse` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-spin-fade-loader` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-spin-fade-loader` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-pulse-rise` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-pulse-out` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-pulse-out-rapid` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-party` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-triangle-path` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-ripple-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-pulse-sync` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-beat` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-zig-zag` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-zig-zag-deflect` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate-pulse` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-ripple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`triangle-skew-spin` | reactDashSpinkitLib.reactDashSpinkitLibStrings.pacman
  ] = js.undefined
  /**
    * Change the default "spinner" className.
    */
  var overrideSpinnerClassName: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    fadeIn: reactDashSpinkitLib.reactDashSpinkitLibStrings.full | reactDashSpinkitLib.reactDashSpinkitLibStrings.half | reactDashSpinkitLib.reactDashSpinkitLibStrings.quarter | reactDashSpinkitLib.reactDashSpinkitLibStrings.none = null,
    name: reactDashSpinkitLib.reactDashSpinkitLibStrings.`three-bounce` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`double-bounce` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`rotating-plane` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`folding-cube` | reactDashSpinkitLib.reactDashSpinkitLibStrings.wave | reactDashSpinkitLib.reactDashSpinkitLibStrings.`wandering-cubes` | reactDashSpinkitLib.reactDashSpinkitLibStrings.pulse | reactDashSpinkitLib.reactDashSpinkitLibStrings.`chasing-dots` | reactDashSpinkitLib.reactDashSpinkitLibStrings.circle | reactDashSpinkitLib.reactDashSpinkitLibStrings.`cube-grid` | reactDashSpinkitLib.reactDashSpinkitLibStrings.wordpress | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-grid-beat` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-grid-pulse` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-spin-fade-loader` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-spin-fade-loader` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-pulse-rise` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-pulse-out` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-pulse-out-rapid` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`line-scale-party` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-triangle-path` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-ripple-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-pulse-sync` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-beat` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-zig-zag` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-zig-zag-deflect` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate-pulse` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-clip-rotate-multiple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`ball-scale-ripple` | reactDashSpinkitLib.reactDashSpinkitLibStrings.`triangle-skew-spin` | reactDashSpinkitLib.reactDashSpinkitLibStrings.pacman = null,
    overrideSpinnerClassName: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideSpinnerClassName != null) __obj.updateDynamic("overrideSpinnerClassName")(overrideSpinnerClassName)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SpinnerProps]
  }
}

