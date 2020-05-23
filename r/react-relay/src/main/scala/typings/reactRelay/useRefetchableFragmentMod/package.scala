package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentMod {
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type KeyReturnType[T /* <: typings.reactRelay.useRefetchableFragmentMod.KeyType */] = js.Function1[
    /* arg */ T, 
    typings.std.NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type ReturnType[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey, TFragmentData] = js.Tuple2[
    TFragmentData, 
    typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic[TQuery, TKey, typings.reactRelay.useRefetchableFragmentNodeMod.Options]
  ]
}
