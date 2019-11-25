package typings.spdy.spdyMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spdy.spdyStrings.h2
  - typings.spdy.spdyStrings.`spdy/3DOT1`
  - typings.spdy.spdyStrings.`spdy/3`
  - typings.spdy.spdyStrings.`spdy/2`
  - typings.spdy.spdyStrings.`http/1DOT1`
  - typings.spdy.spdyStrings.`http/1DOT0`
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def h2: typings.spdy.spdyStrings.h2 = this.cast("h2")
  @scala.inline
  def `http/1DOT0`: typings.spdy.spdyStrings.`http/1DOT0` = this.cast("http/1.0")
  @scala.inline
  def `http/1DOT1`: typings.spdy.spdyStrings.`http/1DOT1` = this.cast("http/1.1")
  @scala.inline
  def `spdy/2`: typings.spdy.spdyStrings.`spdy/2` = this.cast("spdy/2")
  @scala.inline
  def `spdy/3`: typings.spdy.spdyStrings.`spdy/3` = this.cast("spdy/3")
  @scala.inline
  def `spdy/3DOT1`: typings.spdy.spdyStrings.`spdy/3DOT1` = this.cast("spdy/3.1")
}

