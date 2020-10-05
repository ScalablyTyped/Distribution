package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#mathjax
@js.native
trait MathConfig extends js.Object {
  // Obtained from the socket.io server
  var config: String = js.native
  // Obtained from the socket.io server. Gives this (the master) control of the presentation
  var mathjax: String = js.native
}

object MathConfig {
  @scala.inline
  def apply(config: String, mathjax: String): MathConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], mathjax = mathjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathConfig]
  }
  @scala.inline
  implicit class MathConfigOps[Self <: MathConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setMathjax(value: String): Self = this.set("mathjax", value.asInstanceOf[js.Any])
  }
  
}

