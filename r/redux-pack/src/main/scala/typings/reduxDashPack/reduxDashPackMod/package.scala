package typings.reduxDashPack

import org.scalablytyped.runtime.StringDictionary
import typings.reduxDashPack.Anon_Meta
import typings.reduxDashPack.Anon_ReduxpackLIFECYCLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashPackMod {
  type GetState[S] = js.Function0[S]
  type MetaPayload[M] = M with Anon_ReduxpackLIFECYCLE
  type PackActionPayload[Payload, M] = typings.redux.reduxMod.Action[_] with (Anon_Meta[Payload, M])
  type TFullState = StringDictionary[js.Any]
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
