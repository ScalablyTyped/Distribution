package typings
package reactDashCsvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsCommonPropTypesMod {
  type AsyncClickHandler = js.Function2[
    /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement], 
    /* done */ js.Function1[/* proceed */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
  type Data = js.Array[js.Object]
  type Headers = js.Array[LabelKeyObject] | js.Array[java.lang.String]
  type SyncClickHandler = js.Function1[
    /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement], 
    scala.Boolean | scala.Unit
  ]
}
