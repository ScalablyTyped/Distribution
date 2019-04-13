package typings
package reduxDashPackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashPackMod {
  type GetState[S] = js.Function0[S]
  type MetaPayload[M] = M with reduxDashPackLib.Anon_ReduxpackLIFECYCLE
  type PackActionPayload[Payload, M] = reduxLib.reduxMod.Action[_] with (reduxDashPackLib.Anon_Meta[Payload, M])
  type TFullState = org.scalablytyped.runtime.StringDictionary[js.Any]
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
