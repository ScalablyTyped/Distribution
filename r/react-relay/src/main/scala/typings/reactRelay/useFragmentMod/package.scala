package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useFragmentMod {
  type ArrayKeyReturnType[T /* <: typings.reactRelay.useFragmentMod.ArrayKeyType */] = js.Function1[
    /* arg */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.NonNullable<T[0]>[' $data']>[0] */ js.Any
  ]
  type ArrayKeyType = js.Array[typings.reactRelay.AnonDataReadonlyArray | scala.Null]
  // NOTE: These declares ensure that the type of the returned data is:
  //   - non-nullable if the provided ref type is non-nullable
  //   - nullable if the provided ref type is nullable
  //   - array of non-nullable if the privoided ref type is an array of
  //     non-nullable refs
  //   - array of nullable if the privoided ref type is an array of nullable refs
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type KeyReturnType[T /* <: typings.reactRelay.useFragmentMod.KeyType */] = js.Function1[
    /* arg */ T, 
    typings.std.NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
}
