package typings
package rellaxLib.rellaxMod.RellaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RellaxInstance extends js.Object {
  /**
           * Rellax elements
           */
  var elms: stdLib.NodeListOf[stdLib.Element] | js.Array[stdLib.Element]
  /**
           * Options
           */
  var options: RellaxOptions
  /**
           * End Rellax and reset parallax elements to their original positions
           */
  def destroy(): scala.Unit
  /**
           * Destroy and create again parallax with previous settings
           */
  def refresh(): scala.Unit
}

