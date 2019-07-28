package typings.sockjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sockjsStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
}

