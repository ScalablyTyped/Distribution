package typings.rollupDashPluginDashSourcemaps

import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupDashPluginDashSourcemapsMod {
  type ReadFileCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  type ReadFileFunction = js.Function3[
    /* file */ String | Buffer | Double, 
    /* encoding */ String, 
    /* callback */ ReadFileCallback, 
    Unit
  ]
}
