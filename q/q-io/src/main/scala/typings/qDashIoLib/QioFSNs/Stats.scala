package typings
package qDashIoLib.QioFSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//listed but not implemented by Q-io
//export function glob(pattern):Q.Promise<string[]>;
//export function match(pattern, path:string):Q.Promise<string[]>;
//TODO link this to node.js FS module (no lazy clones)
trait Stats extends js.Object {
  var node: NodeStats
  var size: scala.Double
}

object Stats {
  @scala.inline
  def apply(node: NodeStats, size: scala.Double): Stats = {
    val __obj = js.Dynamic.literal(node = node, size = size)
  
    __obj.asInstanceOf[Stats]
  }
}

