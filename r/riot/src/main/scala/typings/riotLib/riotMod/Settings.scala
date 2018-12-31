package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * `riot.renderAsync` timeout in ms
    * @default 1000
    */
  var asyncRenderTimeout: scala.Double
  /**
    * If set to false, DOM event handlers will not trigger update events
    * @default true
    */
  var autoUpdate: scala.Boolean
  /**
    * Setting used to customize the start and end tokens of the expression
    * @default { }
    */
  var brackets: java.lang.String
  /**
    * If set to false, riot will not create lighter tag instances for anonymous tags
    * @default true
    */
  var skipAnonymousTags: scala.Boolean
}

