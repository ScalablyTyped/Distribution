package typings.qIo.QioFS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//listed but not implemented by Q-io
//export function glob(pattern):Q.Promise<string[]>;
//export function match(pattern, path:string):Q.Promise<string[]>;
//TODO link this to node.js FS module (no lazy clones)
@js.native
trait Stats extends js.Object {
  var node: NodeStats = js.native
  var size: Double = js.native
}

object Stats {
  @scala.inline
  def apply(node: NodeStats, size: Double): Stats = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setNode(value: NodeStats): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

