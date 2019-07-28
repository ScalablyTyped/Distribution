package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * `riot.renderAsync` timeout in ms
    * @default 1000
    */
  var asyncRenderTimeout: Double
  /**
    * If set to false, DOM event handlers will not trigger update events
    * @default true
    */
  var autoUpdate: Boolean
  /**
    * Setting used to customize the start and end tokens of the expression
    * @default { }
    */
  var brackets: String
  /**
    * If set to false, riot will not create lighter tag instances for anonymous tags
    * @default true
    */
  var skipAnonymousTags: Boolean
}

object Settings {
  @scala.inline
  def apply(asyncRenderTimeout: Double, autoUpdate: Boolean, brackets: String, skipAnonymousTags: Boolean): Settings = {
    val __obj = js.Dynamic.literal(asyncRenderTimeout = asyncRenderTimeout, autoUpdate = autoUpdate, brackets = brackets, skipAnonymousTags = skipAnonymousTags)
  
    __obj.asInstanceOf[Settings]
  }
}

