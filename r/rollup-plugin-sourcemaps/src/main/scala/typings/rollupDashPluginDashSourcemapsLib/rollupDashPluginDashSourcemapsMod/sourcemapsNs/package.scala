package typings
package rollupDashPluginDashSourcemapsLib.rollupDashPluginDashSourcemapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourcemapsNs {
  type ReadFileCallback = js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  type ReadFileFunction = js.Function3[
    /* file */ java.lang.String | nodeLib.Buffer | scala.Double, 
    /* encoding */ java.lang.String, 
    /* callback */ ReadFileCallback, 
    scala.Unit
  ]
}
