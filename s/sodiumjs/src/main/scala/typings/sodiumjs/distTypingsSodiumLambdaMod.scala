package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumCellMod.Cell
import typings.sodiumjs.distTypingsSodiumStreamMod.Stream
import typings.sodiumjs.distTypingsSodiumVertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", JSImport.Namespace)
@js.native
object distTypingsSodiumLambdaMod extends js.Object {
  @js.native
  class Lambda1[A, B] protected () extends js.Object {
    def this(f: js.Function1[/* a */ A, B], deps: js.Array[Stream[_] | Cell[_]]) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A): B = js.native
  }
  
  @js.native
  class Lambda2[A, B, C] protected () extends js.Object {
    def this(f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[_] | Cell[_]]) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A, b: B): C = js.native
  }
  
  @js.native
  class Lambda3[A, B, C, D] protected () extends js.Object {
    def this(f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[_] | Cell[_]]) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A, b: B, c: C): D = js.native
  }
  
  @js.native
  class Lambda4[A, B, C, D, E] protected () extends js.Object {
    def this(
      f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
      deps: js.Array[Stream[_] | Cell[_]]
    ) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A, b: B, c: C, d: D): E = js.native
  }
  
  @js.native
  class Lambda5[A, B, C, D, E, F] protected () extends js.Object {
    def this(
      f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
      deps: js.Array[Stream[_] | Cell[_]]
    ) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A, b: B, c: C, d: D, e: E): F = js.native
  }
  
  @js.native
  class Lambda6[A, B, C, D, E, F, G] protected () extends js.Object {
    def this(
      f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
      deps: js.Array[Stream[_] | Cell[_]]
    ) = this()
    var deps: js.Array[Stream[_] | Cell[_]] = js.native
    def f(a: A, b: B, c: C, d: D, e: E, f: F): G = js.native
  }
  
  def Lambda1_deps[A, B](f: js.Function1[/* a */ A, B]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda1_deps[A, B](f: Lambda1[A, B]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda1_toFunction[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = js.native
  def Lambda1_toFunction[A, B](f: Lambda1[A, B]): js.Function1[/* a */ A, B] = js.native
  def Lambda2_deps[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda2_deps[A, B, C](f: Lambda2[A, B, C]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda2_toFunction[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* a */ A, /* b */ B, C] = js.native
  def Lambda2_toFunction[A, B, C](f: Lambda2[A, B, C]): js.Function2[/* a */ A, /* b */ B, C] = js.native
  def Lambda3_deps[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda3_deps[A, B, C, D](f: Lambda3[A, B, C, D]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda3_toFunction[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): js.Function3[/* a */ A, /* b */ B, /* c */ C, D] = js.native
  def Lambda3_toFunction[A, B, C, D](f: Lambda3[A, B, C, D]): js.Function3[/* a */ A, /* b */ B, /* c */ C, D] = js.native
  def Lambda4_deps[A, B, C, D, E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda4_deps[A, B, C, D, E](f: Lambda4[A, B, C, D, E]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda4_toFunction[A, B, C, D, E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E] = js.native
  def Lambda4_toFunction[A, B, C, D, E](f: Lambda4[A, B, C, D, E]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E] = js.native
  def Lambda5_deps[A, B, C, D, E, F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda5_deps[A, B, C, D, E, F](f: Lambda5[A, B, C, D, E, F]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda5_toFunction[A, B, C, D, E, F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F] = js.native
  def Lambda5_toFunction[A, B, C, D, E, F](f: Lambda5[A, B, C, D, E, F]): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F] = js.native
  def Lambda6_deps[A, B, C, D, E, F, G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda6_deps[A, B, C, D, E, F, G](f: Lambda6[A, B, C, D, E, F, G]): js.Array[Stream[_] | Cell[_]] = js.native
  def Lambda6_toFunction[A, B, C, D, E, F, G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G] = js.native
  def Lambda6_toFunction[A, B, C, D, E, F, G](f: Lambda6[A, B, C, D, E, F, G]): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G] = js.native
  def lambda1[A, B](f: js.Function1[/* a */ A, B], deps: js.Array[Stream[_] | Cell[_]]): Lambda1[A, B] = js.native
  def lambda2[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[_] | Cell[_]]): Lambda2[A, B, C] = js.native
  def lambda3[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[_] | Cell[_]]): Lambda3[A, B, C, D] = js.native
  def lambda4[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[Stream[_] | Cell[_]]
  ): Lambda4[A, B, C, D, E] = js.native
  def lambda5[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[Stream[_] | Cell[_]]
  ): Lambda5[A, B, C, D, E, F] = js.native
  def lambda6[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[Stream[_] | Cell[_]]
  ): Lambda6[A, B, C, D, E, F, G] = js.native
  def toSources(deps: js.Array[Stream[_] | Cell[_]]): js.Array[Source] = js.native
}

