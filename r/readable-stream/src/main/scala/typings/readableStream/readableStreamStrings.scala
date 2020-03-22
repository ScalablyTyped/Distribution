package typings.readableStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object readableStreamStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait readable extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
}

