package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var options: ConnectOptions
  def connect(options: ConnectOptions): Connection
}

object Static {
  @scala.inline
  def apply(connect: ConnectOptions => Connection, options: ConnectOptions): Static = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Static]
  }
}

