package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleManager extends js.Object {
  var styleNode: stdLib.HTMLStyleElement = js.native
  /**
       * Save a tag style to be later injected into DOM
       * @param css - css string
       * @param name - if it's passed the css will be mapped to a tagname
       */
  def add(css: java.lang.String): scala.Unit = js.native
  /**
       * Save a tag style to be later injected into DOM
       * @param css - css string
       * @param name - if it's passed the css will be mapped to a tagname
       */
  def add(css: java.lang.String, name: java.lang.String): scala.Unit = js.native
  /**
       * Inject all previously saved tag styles into DOM
       */
  def inject(): scala.Unit = js.native
}

