package typings.reactDashSpinkit.reactDashSpinkitMod

import typings.react.reactMod.CSSProperties
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-beat`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate-multiple`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate-pulse`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-grid-beat`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-grid-pulse`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-pulse-rise`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-pulse-sync`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-multiple`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-ripple-multiple`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-ripple`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-spin-fade-loader`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-triangle-path`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-zig-zag-deflect`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`ball-zig-zag`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`chasing-dots`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`cube-grid`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`double-bounce`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`folding-cube`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-party`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-pulse-out-rapid`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-pulse-out`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`line-scale`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`line-spin-fade-loader`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`rotating-plane`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`three-bounce`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`triangle-skew-spin`
import typings.reactDashSpinkit.reactDashSpinkitStrings.`wandering-cubes`
import typings.reactDashSpinkit.reactDashSpinkitStrings.circle
import typings.reactDashSpinkit.reactDashSpinkitStrings.full
import typings.reactDashSpinkit.reactDashSpinkitStrings.half
import typings.reactDashSpinkit.reactDashSpinkitStrings.none
import typings.reactDashSpinkit.reactDashSpinkitStrings.pacman
import typings.reactDashSpinkit.reactDashSpinkitStrings.pulse
import typings.reactDashSpinkit.reactDashSpinkitStrings.quarter
import typings.reactDashSpinkit.reactDashSpinkitStrings.wave
import typings.reactDashSpinkit.reactDashSpinkitStrings.wordpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  /**
    * Component className.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Programmatically set the color of the spinners (does not work
    * for circle or folding-cube); this can either be a hex value or a color word
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Set the time before the spinner fades in
    */
  var fadeIn: js.UndefOr[full | half | quarter | none] = js.undefined
  /**
    * Specify spinner to use.
    */
  var name: js.UndefOr[
    `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
  ] = js.undefined
  /**
    * Change the default "spinner" className.
    */
  var overrideSpinnerClassName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    fadeIn: full | half | quarter | none = null,
    name: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman = null,
    overrideSpinnerClassName: String = null,
    style: CSSProperties = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideSpinnerClassName != null) __obj.updateDynamic("overrideSpinnerClassName")(overrideSpinnerClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

