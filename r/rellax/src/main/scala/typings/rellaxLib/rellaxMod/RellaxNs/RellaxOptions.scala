package typings
package rellaxLib.rellaxMod.RellaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RellaxOptions extends js.Object {
  /**
           * Will run on every animation event
           * @param positions Object with x and y positions of the rellax element
           */
  var callback: js.UndefOr[js.Function1[/* positions */ rellaxLib.Anon_Y, scala.Unit]] = js.undefined
  /**
           * Enable the ability to center parallax elements in your viewport
           */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
           */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Allow decimal pixel values
           */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
           */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
           * Enable vertical parallax
           */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
           */
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

