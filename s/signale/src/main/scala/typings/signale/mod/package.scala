package typings.signale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  
  type Signale[TTypes /* <: java.lang.String */] = typings.signale.mod.SignaleBase[TTypes] with (typings.std.Record[TTypes, typings.signale.mod.LoggerFunc]) with typings.signale.anon.RecordDefaultMethodsLogge
}
