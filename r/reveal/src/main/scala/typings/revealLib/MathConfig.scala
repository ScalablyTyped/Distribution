package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#mathjax
trait MathConfig extends js.Object {
  // Obtained from the socket.io server
  var config: java.lang.String
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var mathjax: java.lang.String
}

