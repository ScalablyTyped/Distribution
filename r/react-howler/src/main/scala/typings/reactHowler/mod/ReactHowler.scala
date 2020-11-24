package typings.reactHowler.mod

import typings.howler.mod.Howl
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactHowler
  extends Component[Props, js.Object, js.Any] {
  
  def duration(): Double = js.native
  def duration(id: Double): Double = js.native
  
  var howler: Howl = js.native
  
  def howlerState(): HOWLER_STATE = js.native
  
  def seek(): Double = js.native
  def seek(time: Double): Double = js.native
  
  def stop(): Unit = js.native
  def stop(id: Double): Unit = js.native
}
