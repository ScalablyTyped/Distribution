package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RNs {
  type Arity0Fn = js.Function0[js.Any]
  type Arity1Fn = js.Function1[/* a */ js.Any, js.Any]
  type Arity2Fn = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
  // Represents all objects evolvable with Evolver E
  type Evolvable[E /* <: Evolver */] = ramdaLib.ramdaLibStrings.Evolvable with js.Any
  type Evolve[O /* <: Evolvable[E] */, E /* <: Evolver */] = ramdaLib.ramdaLibStrings.Evolve with O
  type EvolveNestedValue[V, E /* <: Evolver */] = Evolve[V, E]
  type EvolveValue[V, E] = (EvolveNestedValue[V, E]) | stdLib.ReturnType[E]
  type ObjPred = js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Boolean]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type Ord = scala.Double | java.lang.String | scala.Boolean | stdLib.Date
  type Path = js.Array[scala.Double | java.lang.String]
  type Pred = js.Function1[/* repeated */js.Any, scala.Boolean]
  type SafePred[T] = js.Function1[/* repeated */T, scala.Boolean]
}
