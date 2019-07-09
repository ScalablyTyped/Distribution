package typings
package stripDashBomDashBufLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strip-bom-buf", JSImport.Namespace)
@js.native
object stripDashBomDashBufMod extends js.Object {
  /**
  Strip UTF-8 [byte order mark](http://en.wikipedia.org/wiki/Byte_order_mark#UTF-8) (BOM) from a buffer.
  @example
  ```
  import * as fs from 'fs';
  import stripBomBuffer = require('strip-bom-buf');
  stripBomBuffer(fs.readFileSync('unicorn.txt'));
  //=> 'unicorn'
  ```
  */
  def apply(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
}

