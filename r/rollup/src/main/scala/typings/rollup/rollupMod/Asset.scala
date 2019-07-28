package typings.rollup.rollupMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asset extends js.Object {
  var fileName: String
  var name: String
  var source: String | Buffer
}

object Asset {
  @scala.inline
  def apply(fileName: String, name: String, source: String | Buffer): Asset = {
    val __obj = js.Dynamic.literal(fileName = fileName, name = name, source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Asset]
  }
}

