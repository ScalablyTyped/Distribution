package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx.special")
@js.native
object special extends js.Object {
  
  type FlatMapResultSelector[T1, T2, TResult] = js.Function4[
    /* value */ T1, 
    /* selectorValue */ T2, 
    /* index */ Double, 
    /* selectorOther */ Double, 
    TResult
  ]
}
