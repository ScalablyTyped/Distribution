package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSelectionState
  extends EventEmitter
     with org.scalablytyped.runtime.Instantiable2[/* anchor */ scala.Double, /* focus */ scala.Double, DocumentSelectionState] {
  def blur(): scala.Unit = js.native
  /**
    * Given a max text length, constrain our selection offsets to ensure
    * that the selection remains strictly within the text range.
    *
    */
  def constrainLength(maxLength: scala.Double): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getAnchorOffset(): scala.Double = js.native
  def getEndOffset(): scala.Double = js.native
  def getFocusOffset(): scala.Double = js.native
  def getStartOffset(): scala.Double = js.native
  def hasFocus(): scala.Boolean = js.native
  def isBackward(): scala.Boolean = js.native
  def isCollapsed(): scala.Boolean = js.native
  def overlaps(start: scala.Double, end: scala.Double): scala.Boolean = js.native
  /**
    * Apply an update to the state. If either offset value has changed,
    * set the values and emit the `change` event. Otherwise no-op.
    *
    */
  def update(anchor: scala.Double, focus: scala.Double): scala.Unit = js.native
}

