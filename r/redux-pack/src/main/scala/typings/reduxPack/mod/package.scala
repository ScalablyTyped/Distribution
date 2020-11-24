package typings.reduxPack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetState[S] = js.Function0[S]
  
  type MetaPayload[M] = M with typings.reduxPack.anon.ReduxpackLIFECYCLE
  
  type TFullState = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type handlerReducer[S, A] = js.Function2[/* state */ S, /* action */ A, S]
}
