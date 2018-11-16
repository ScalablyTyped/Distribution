package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#multiplexing

trait MultiplexConfig extends js.Object {
  // Obtained from the socket.io server
  var id: java.lang.String
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var secret: js.UndefOr[java.lang.String] = js.undefined
  // Location of socket.io server
  var url: java.lang.String
}

