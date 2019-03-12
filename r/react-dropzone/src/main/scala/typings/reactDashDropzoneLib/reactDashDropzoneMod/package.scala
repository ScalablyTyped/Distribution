package typings
package reactDashDropzoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDropzoneMod {
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[ImageFile], 
    /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLDivElement], 
    scala.Unit
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[ImageFile], 
    /* rejected */ js.Array[ImageFile], 
    /* event */ reactLib.reactMod.ReactNs.DragEvent[stdLib.HTMLDivElement], 
    scala.Unit
  ]
}
