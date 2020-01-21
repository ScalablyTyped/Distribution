package typings.requiresPort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requiresPort.requiresPortStrings.http
  - typings.requiresPort.requiresPortStrings.https
  - typings.requiresPort.requiresPortStrings.ws
  - typings.requiresPort.requiresPortStrings.wss
  - typings.requiresPort.requiresPortStrings.ftp
  - typings.requiresPort.requiresPortStrings.gopher
  - typings.requiresPort.requiresPortStrings.file
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typings.requiresPort.requiresPortStrings.file = this.cast("file")
  @scala.inline
  def ftp: typings.requiresPort.requiresPortStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typings.requiresPort.requiresPortStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typings.requiresPort.requiresPortStrings.http = this.cast("http")
  @scala.inline
  def https: typings.requiresPort.requiresPortStrings.https = this.cast("https")
  @scala.inline
  def ws: typings.requiresPort.requiresPortStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typings.requiresPort.requiresPortStrings.wss = this.cast("wss")
}

