package typings.radium.mod.Radium

import typings.std.MediaQueryList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiumConfig extends js.Object {
  /**
    * Allow to replace matchMedia function that Radium uses. The default one is window.matchMedia
    * @param mediaQuery
    */
  var matchMedia: js.UndefOr[js.Function1[/* mediaQuery */ String, MediaQueryList]] = js.native
  /**
    * List of plugins
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * Set the user agent passed to inline-style-prefixer to perform prefixing on style objects.
    * Mainly used during server rendering
    */
  var userAgent: js.UndefOr[String] = js.native
}

object RadiumConfig {
  @scala.inline
  def apply(): RadiumConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiumConfig]
  }
  @scala.inline
  implicit class RadiumConfigOps[Self <: RadiumConfig] (val x: Self) extends AnyVal {
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
    def setMatchMedia(value: /* mediaQuery */ String => MediaQueryList): Self = this.set("matchMedia", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatchMedia: Self = this.set("matchMedia", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

