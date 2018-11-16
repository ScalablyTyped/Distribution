package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AreaProps extends AreaBaseProps {
  /**
       * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
       */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, scala.Boolean]] = js.undefined
  /**
       * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
       */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, scala.Boolean]] = js.undefined
  /**
       * Whether the area can be seen.
       */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, scala.Unit]] = js.undefined
  /**
       * Called when the mouse enters the area.
       */
  var onMouseEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Called when the mouse leaves the area.
       */
  var onMouseLeave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Called when the mouse is moved over the area
       */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ protonDashNativeLib.Anon_X, scala.Unit]] = js.undefined
  /**
       * **Not working at the moment.**
       *
       * Called when releasing a mouse button over the area.
       */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, scala.Unit]] = js.undefined
  /**
       * Whether the area can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

