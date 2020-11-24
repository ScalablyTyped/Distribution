package typings.rxjs

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/mergeMapTo", JSImport.Namespace)
@js.native
object mergeMapToMod extends js.Object {
  
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O): OperatorFunction[_, ObservedValueOf[O]] = js.native
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O, concurrent: Double): OperatorFunction[_, ObservedValueOf[O]] = js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
}
