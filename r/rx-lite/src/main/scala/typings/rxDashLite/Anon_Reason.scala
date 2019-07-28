package typings.rxDashLite

import org.scalablytyped.runtime.Instantiable1
import typings.rxDashCore.RxNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Reason[T, TPromise /* <: IPromise[T] */]
  extends Instantiable1[
      /* resolver */ js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ], 
      TPromise
    ]

