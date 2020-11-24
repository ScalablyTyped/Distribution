package typings.reactAlbus.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardContext extends js.Object {
  
  def go(n: Double): Unit = js.native
  
  var history: History[LocationState] = js.native
  
  def next(): Unit = js.native
  
  def previous(): Unit = js.native
  
  def push(): Unit = js.native
  def push(id: String): Unit = js.native
  
  def replace(): Unit = js.native
  def replace(id: String): Unit = js.native
  
  var step: StepObject = js.native
  
  var steps: js.Array[StepObject] = js.native
}
