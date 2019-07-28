package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#mathjax
trait MathConfig extends js.Object {
  // Obtained from the socket.io server
  var config: String
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var mathjax: String
}

object MathConfig {
  @scala.inline
  def apply(config: String, mathjax: String): MathConfig = {
    val __obj = js.Dynamic.literal(config = config, mathjax = mathjax)
  
    __obj.asInstanceOf[MathConfig]
  }
}

