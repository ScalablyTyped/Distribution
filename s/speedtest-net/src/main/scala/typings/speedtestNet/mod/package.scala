package typings.speedtestNet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CancelFunction = js.Function2[
    /* setCancelHandler */ js.UndefOr[js.Symbol], 
    /* newHandler */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Boolean | scala.Unit
  ]
  
  type ProgressFunction = js.Function1[/* event */ js.UndefOr[typings.speedtestNet.mod.SpeedTestEvent], scala.Unit]
}
