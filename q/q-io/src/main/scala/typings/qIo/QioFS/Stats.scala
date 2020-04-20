package typings.qIo.QioFS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//listed but not implemented by Q-io
//export function glob(pattern):Q.Promise<string[]>;
//export function match(pattern, path:string):Q.Promise<string[]>;
//TODO link this to node.js FS module (no lazy clones)
trait Stats extends js.Object {
  var node: NodeStats
  var size: Double
}

object Stats {
  @scala.inline
  def apply(node: NodeStats, size: Double): Stats = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

