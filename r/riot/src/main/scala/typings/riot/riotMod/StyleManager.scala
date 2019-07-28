package typings.riot.riotMod

import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleManager extends js.Object {
  var styleNode: HTMLStyleElement = js.native
  /**
    * Save a tag style to be later injected into DOM
    * @param css - css string
    * @param name - if it's passed the css will be mapped to a tagname
    */
  def add(css: String): Unit = js.native
  def add(css: String, name: String): Unit = js.native
  /**
    * Inject all previously saved tag styles into DOM
    */
  def inject(): Unit = js.native
}

