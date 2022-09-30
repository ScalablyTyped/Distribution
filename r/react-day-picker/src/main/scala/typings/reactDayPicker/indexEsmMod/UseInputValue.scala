package typings.reactDayPicker.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the value returned by {@link useInput}. */
@js.native
trait UseInputValue extends StObject {
  
  /** The props to pass to a DayPicker component. */
  var dayPickerProps: InputDayPickerProps = js.native
  
  /** The props to pass to an input field. */
  var inputProps: InputHTMLAttributes = js.native
  
  /** A function to reset to the initial state. */
  def reset(): Unit = js.native
  
  /** A function to set the selected day. */
  def setSelected(): Unit = js.native
  def setSelected(day: js.Date): Unit = js.native
}
