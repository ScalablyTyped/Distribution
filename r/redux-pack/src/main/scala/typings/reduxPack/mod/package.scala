package typings.reduxPack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetState[S] = js.Function0[S]
  type MetaPayload[M] = M with typings.reduxPack.AnonReduxpackLIFECYCLE
  type TFullState = org.scalablytyped.runtime.StringDictionary[js.Any]
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
