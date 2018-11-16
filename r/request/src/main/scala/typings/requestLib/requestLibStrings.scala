package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object requestLibStrings {
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
  
  def body: body = "body".asInstanceOf[body]
  def complete: complete = "complete".asInstanceOf[complete]
  def data: data = "data".asInstanceOf[data]
  def error: error = "error".asInstanceOf[error]
  def header: header = "header".asInstanceOf[header]
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  def query: query = "query".asInstanceOf[query]
  def request: request = "request".asInstanceOf[request]
  def response: response = "response".asInstanceOf[response]
  def socket: socket = "socket".asInstanceOf[socket]
}

