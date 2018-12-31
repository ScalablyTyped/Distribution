package typings
package sassLib.sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The compiled CSS.
    *
    * Write this to a file, or serve it out as needed.
    */
  var css: nodeLib.Buffer
  /**
    * The source map.
    */
  var map: js.UndefOr[nodeLib.Buffer] = js.undefined
  var stats: sassLib.Anon_Duration
}

