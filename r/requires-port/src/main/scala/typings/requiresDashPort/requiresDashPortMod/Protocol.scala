package typings.requiresDashPort.requiresDashPortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requiresDashPort.requiresDashPortStrings.http
  - typings.requiresDashPort.requiresDashPortStrings.https
  - typings.requiresDashPort.requiresDashPortStrings.ws
  - typings.requiresDashPort.requiresDashPortStrings.wss
  - typings.requiresDashPort.requiresDashPortStrings.ftp
  - typings.requiresDashPort.requiresDashPortStrings.gopher
  - typings.requiresDashPort.requiresDashPortStrings.file
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typings.requiresDashPort.requiresDashPortStrings.file = this.cast("file")
  @scala.inline
  def ftp: typings.requiresDashPort.requiresDashPortStrings.ftp = this.cast("ftp")
  @scala.inline
  def gopher: typings.requiresDashPort.requiresDashPortStrings.gopher = this.cast("gopher")
  @scala.inline
  def http: typings.requiresDashPort.requiresDashPortStrings.http = this.cast("http")
  @scala.inline
  def https: typings.requiresDashPort.requiresDashPortStrings.https = this.cast("https")
  @scala.inline
  def ws: typings.requiresDashPort.requiresDashPortStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typings.requiresDashPort.requiresDashPortStrings.wss = this.cast("wss")
}

