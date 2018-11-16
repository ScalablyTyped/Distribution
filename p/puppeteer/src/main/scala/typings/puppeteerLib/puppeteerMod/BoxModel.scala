package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BoxModel extends js.Object {
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box]
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box]
  var height: scala.Double
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box]
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box]
  var width: scala.Double
}

