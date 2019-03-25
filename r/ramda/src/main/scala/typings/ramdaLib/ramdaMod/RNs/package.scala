package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RNs {
  type Arity0Fn = js.Function0[js.Any]
  type Arity1Fn = js.Function1[/* a */ js.Any, js.Any]
  type Arity2Fn = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
  type CommonKeys[T1, T2] = java.lang.String
  type CommonPropsThatAreObjects[T1, T2] = (PropsThatAreObjects[T1, java.lang.String]) with (PropsThatAreObjects[T2, java.lang.String])
  type ComposeWithFns[V0, T] = (js.Array[js.Function1[/* x0 */ V0, T]]) | (js.Tuple2[js.Function1[/* x */ js.Any, T], js.Function1[/* x */ V0, js.Any]]) | (js.Tuple3[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple4[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple5[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple6[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple7[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple8[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple9[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ]) | (js.Tuple10[
    js.Function1[/* x */ js.Any, T], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ V0, js.Any]
  ])
  // Represents all objects evolvable with Evolver E
  type Evolvable[E /* <: Evolver */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]:? ramda.ramda.R.Evolved<E[P]>}
    */ ramdaLib.ramdaLibStrings.Evolvable with E
  type Evolve[O /* <: Evolvable[E] */, E /* <: Evolver */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof O ]: O[P] | ramda.ramda.R.EvolveValue<O[P], E[P]>}
    */ ramdaLib.ramdaLibStrings.Evolve with js.Any
  type EvolveNestedValue[V, E /* <: Evolver */] = Evolve[V, E]
  type EvolveValue[V, E] = (EvolveNestedValue[V, E]) | stdLib.ReturnType[E]
  type Evolved[T] = Evolvable[T]
  type Merge[Primary, Secondary] = ramdaLib.ramdaLibStrings.Merge with Primary with Secondary
  type MergeDeep[Primary, Secondary] = ramdaLib.ramdaLibStrings.MergeDeep with js.Any with Primary with Secondary
  type ObjPred = js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Boolean]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Ord = scala.Double | java.lang.String | scala.Boolean | stdLib.Date
  type Path = js.Array[scala.Double | java.lang.String]
  type PipeWithFns[V0, T] = (js.Array[js.Function1[/* x0 */ V0, T]]) | (js.Tuple2[js.Function1[/* x0 */ V0, js.Any], js.Function1[/* x */ js.Any, T]]) | (js.Tuple3[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple4[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple5[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple6[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple7[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple8[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple9[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ]) | (js.Tuple10[
    js.Function1[/* x0 */ V0, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, js.Any], 
    js.Function1[/* x */ js.Any, T]
  ])
  type Pred = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type PropsThatAreObjects[T, K /* <: java.lang.String */] = K
  type SafePred[T] = js.Function1[/* repeated */ T, scala.Boolean]
}
