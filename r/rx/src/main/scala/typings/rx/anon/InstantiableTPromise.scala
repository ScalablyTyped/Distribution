package typings.rx.anon

import org.scalablytyped.runtime.Instantiable1
import typings.rx.Rx.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantiableTPromise[T, TPromise /* <: IPromise[T] */]
  extends Instantiable1[
      /* resolver */ js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
        Unit
      ], 
      TPromise
    ]

