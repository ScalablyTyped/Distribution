package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactGridLayoutProps extends CoreProps {
  /**
           * Number of columns in this layout.
           */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /**
           * Layout is an array of object with the format:
           *
           * `{x: number, y: number, w: number, h: number}`
           *
           * The index into the layout must match the key used on each item component.
           * If you choose to use custom keys, you can specify that key in the layout
           * array objects like so:
           *
           * `{i: string, x: number, y: number, w: number, h: number}`
           *
           * If not provided, use data-grid props on children.
           */
  var layout: js.UndefOr[js.Array[Layout]] = js.undefined
  /**
           * Callback so you can save the layout.
           * Calls back with (currentLayout) after every drag or resize stop.
           */
  var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], scala.Unit]] = js.undefined
}

