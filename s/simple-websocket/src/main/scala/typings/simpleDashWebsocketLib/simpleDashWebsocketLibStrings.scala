package typings
package simpleDashWebsocketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object simpleDashWebsocketLibStrings {
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait listening extends js.Object
  
  def connection: connection = "connection".asInstanceOf[connection]
  def error: error = "error".asInstanceOf[error]
  def headers: headers = "headers".asInstanceOf[headers]
  def listening: listening = "listening".asInstanceOf[listening]
}

