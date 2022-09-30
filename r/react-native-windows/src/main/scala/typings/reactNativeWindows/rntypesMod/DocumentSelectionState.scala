package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSelectionState
  extends StObject
     with EventEmitter
     with Instantiable2[/* anchor */ Double, /* focus */ Double, DocumentSelectionState] {
  
  def blur(): Unit = js.native
  
  /**
    * Given a max text length, constrain our selection offsets to ensure
    * that the selection remains strictly within the text range.
    *
    */
  def constrainLength(maxLength: Double): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getAnchorOffset(): Double = js.native
  
  def getEndOffset(): Double = js.native
  
  def getFocusOffset(): Double = js.native
  
  def getStartOffset(): Double = js.native
  
  def hasFocus(): Boolean = js.native
  
  def isBackward(): Boolean = js.native
  
  def isCollapsed(): Boolean = js.native
  
  def overlaps(start: Double, end: Double): Boolean = js.native
  
  /**
    * Apply an update to the state. If either offset value has changed,
    * set the values and emit the `change` event. Otherwise no-op.
    *
    */
  def update(anchor: Double, focus: Double): Unit = js.native
}
