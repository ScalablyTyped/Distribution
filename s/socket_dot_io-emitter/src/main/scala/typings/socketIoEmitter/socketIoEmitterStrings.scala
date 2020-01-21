package typings.socketIoEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object socketIoEmitterStrings {
  @js.native
  sealed trait broadcast extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait volatile extends js.Object
  
  @scala.inline
  def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def volatile: volatile = "volatile".asInstanceOf[volatile]
}

