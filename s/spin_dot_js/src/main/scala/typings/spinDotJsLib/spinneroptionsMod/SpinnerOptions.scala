package typings
package spinDotJsLib.spinneroptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpinnerOptions extends js.Object {
  /**
       * The animation name used for the spinner lines. Defaults to 'spinner-line-fade-default'.
       */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The CSS class to assign to the spinner
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A CSS color string, or array of strings to set the line color
       */
  var color: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
       * Corner roundness (0..1)
       */
  var corners: js.UndefOr[scala.Double] = js.undefined
  /**
       * 1: clockwise, -1: counterclockwise
       */
  var direction: js.UndefOr[scala.Double] = js.undefined
  /**
       * A CSS color string, or array of strings to set the color that lines will fade to.
       * Defaults to transparent.
       */
  var fadeColor: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
       * Left position relative to parent (defaults to 50%)
       */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The length of each line
       */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
       * The number of lines to draw
       */
  var lines: js.UndefOr[scala.Double] = js.undefined
  /**
       * Element positioning
       */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The radius of the inner circle
       */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
       * The rotation offset
       */
  var rotate: js.UndefOr[scala.Double] = js.undefined
  /**
       * Scales overall size of the spinner
       */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to render the default shadow (boolean).
       * A string can be used to set a custom box-shadow value.
       */
  var shadow: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
       * Rounds per second
       */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
       * Top position relative to parent (defaults to 50%)
       */
  var top: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The line thickness
       */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
       * The z-index (defaults to 2000000000)
       */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

