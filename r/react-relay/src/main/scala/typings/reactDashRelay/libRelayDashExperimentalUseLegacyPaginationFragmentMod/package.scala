package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayDashExperimentalUseLegacyPaginationFragmentMod {
  import typings.reactDashRelay.Anon_Data
  import typings.reactDashRelay.Anon_DataUnknown
  import typings.std.NonNullable

  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type NonNullableReturnType[T /* <: Anon_DataUnknown */] = js.Function1[
    /* arg */ T, 
    NonNullable[
      /* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type NullableReturnType[T /* <: Anon_Data */] = js.Function1[
    /* arg */ T, 
    (/* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any) | Null
  ]
}
