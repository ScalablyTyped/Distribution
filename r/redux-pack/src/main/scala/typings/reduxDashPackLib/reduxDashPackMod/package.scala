package typings
package reduxDashPackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashPackMod {
  type GetState[S] = js.Function0[S]
  type LIFECYCLEValues = reduxDashPackLib.reduxDashPackLibStrings.start | reduxDashPackLib.reduxDashPackLibStrings.succes | reduxDashPackLib.reduxDashPackLibStrings.failure
  type MetaPayload[M] = M with (/* import warning: ImportType.apply Failed type conversion: {[redux-pack/LIFECYCLE]? : redux-pack.redux-pack.LIFECYCLEValues, [redux-pack/TRANSACTION]? : string} */ js.Any)
  type PackActionPayload[Payload, M] = reduxLib.reduxMod.Action[_] with (reduxDashPackLib.Anon_Meta[Payload, M])
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
