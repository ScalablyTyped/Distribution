package typings
package sockjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sockjsLibStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  def close: close = "close".asInstanceOf[close]
  def connection: connection = "connection".asInstanceOf[connection]
  def data: data = "data".asInstanceOf[data]
}

