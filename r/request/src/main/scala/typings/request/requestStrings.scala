package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requestStrings {
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait response extends js.Object
  
  @js.native
  sealed trait socket extends js.Object
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
}

