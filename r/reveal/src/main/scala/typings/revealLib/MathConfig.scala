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

object MathConfig {
  @scala.inline
  def apply(config: java.lang.String, mathjax: java.lang.String): MathConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("mathjax")(mathjax)
    __obj.asInstanceOf[MathConfig]
  }
}

