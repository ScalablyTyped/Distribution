package typings.sodiumjs

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import typings.sodiumjs.vertexMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Lambda1Deps[A, B](f: js.Function1[/* a */ A, B]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda1_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda1Deps[A, B](f: Lambda1_[A, B]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda1_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda1ToFunction[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda1_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  @scala.inline
  def Lambda1ToFunction[A, B](f: Lambda1_[A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda1_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda1")
  @js.native
  class Lambda1_[A, B] protected () extends StObject {
    def this(f: js.Function1[/* a */ A, B], deps: js.Array[Stream[js.Any] | Cell[js.Any]]) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A): B = js.native
  }
  
  @scala.inline
  def Lambda2Deps[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda2_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda2Deps[A, B, C](f: Lambda2_[A, B, C]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda2_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda2ToFunction[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* a */ A, /* b */ B, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda2_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* b */ B, C]]
  @scala.inline
  def Lambda2ToFunction[A, B, C](f: Lambda2_[A, B, C]): js.Function2[/* a */ A, /* b */ B, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda2_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* b */ B, C]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda2")
  @js.native
  class Lambda2_[A, B, C] protected () extends StObject {
    def this(f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[js.Any] | Cell[js.Any]]) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A, b: B): C = js.native
  }
  
  @scala.inline
  def Lambda3Deps[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda3_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda3Deps[A, B, C, D](f: Lambda3_[A, B, C, D]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda3_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda3ToFunction[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): js.Function3[/* a */ A, /* b */ B, /* c */ C, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda3_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ A, /* b */ B, /* c */ C, D]]
  @scala.inline
  def Lambda3ToFunction[A, B, C, D](f: Lambda3_[A, B, C, D]): js.Function3[/* a */ A, /* b */ B, /* c */ C, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda3_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ A, /* b */ B, /* c */ C, D]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda3")
  @js.native
  class Lambda3_[A, B, C, D] protected () extends StObject {
    def this(f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[js.Any] | Cell[js.Any]]) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A, b: B, c: C): D = js.native
  }
  
  @scala.inline
  def Lambda4Deps[A, B, C, D, E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda4_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda4Deps[A, B, C, D, E](f: Lambda4_[A, B, C, D, E]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda4_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda4ToFunction[A, B, C, D, E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda4_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]]
  @scala.inline
  def Lambda4ToFunction[A, B, C, D, E](f: Lambda4_[A, B, C, D, E]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda4_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda4")
  @js.native
  class Lambda4_[A, B, C, D, E] protected () extends StObject {
    def this(
      f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
      deps: js.Array[Stream[js.Any] | Cell[js.Any]]
    ) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A, b: B, c: C, d: D): E = js.native
  }
  
  @scala.inline
  def Lambda5Deps[A, B, C, D, E, F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda5_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda5Deps[A, B, C, D, E, F](f: Lambda5_[A, B, C, D, E, F]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda5_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda5ToFunction[A, B, C, D, E, F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda5_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]]
  @scala.inline
  def Lambda5ToFunction[A, B, C, D, E, F](f: Lambda5_[A, B, C, D, E, F]): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda5_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda5")
  @js.native
  class Lambda5_[A, B, C, D, E, F] protected () extends StObject {
    def this(
      f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
      deps: js.Array[Stream[js.Any] | Cell[js.Any]]
    ) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A, b: B, c: C, d: D, e: E): F = js.native
  }
  
  @scala.inline
  def Lambda6Deps[A, B, C, D, E, F, G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda6_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  @scala.inline
  def Lambda6Deps[A, B, C, D, E, F, G](f: Lambda6_[A, B, C, D, E, F, G]): js.Array[Stream[js.Any] | Cell[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda6_deps")(f.asInstanceOf[js.Any]).asInstanceOf[js.Array[Stream[js.Any] | Cell[js.Any]]]
  
  @scala.inline
  def Lambda6ToFunction[A, B, C, D, E, F, G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda6_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]]
  @scala.inline
  def Lambda6ToFunction[A, B, C, D, E, F, G](f: Lambda6_[A, B, C, D, E, F, G]): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda6_toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]]
  
  @JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda6")
  @js.native
  class Lambda6_[A, B, C, D, E, F, G] protected () extends StObject {
    def this(
      f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
      deps: js.Array[Stream[js.Any] | Cell[js.Any]]
    ) = this()
    
    var deps: js.Array[Stream[js.Any] | Cell[js.Any]] = js.native
    
    def f(a: A, b: B, c: C, d: D, e: E, f: F): G = js.native
  }
  
  @scala.inline
  def lambda1[A, B](f: js.Function1[/* a */ A, B], deps: js.Array[Stream[js.Any] | Cell[js.Any]]): Lambda1_[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda1")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda1_[A, B]]
  
  @scala.inline
  def lambda2[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[js.Any] | Cell[js.Any]]): Lambda2_[A, B, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda2")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda2_[A, B, C]]
  
  @scala.inline
  def lambda3[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[js.Any] | Cell[js.Any]]): Lambda3_[A, B, C, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda3")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda3_[A, B, C, D]]
  
  @scala.inline
  def lambda4[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[Stream[js.Any] | Cell[js.Any]]
  ): Lambda4_[A, B, C, D, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda4")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda4_[A, B, C, D, E]]
  
  @scala.inline
  def lambda5[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[Stream[js.Any] | Cell[js.Any]]
  ): Lambda5_[A, B, C, D, E, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda5")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda5_[A, B, C, D, E, F]]
  
  @scala.inline
  def lambda6[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[Stream[js.Any] | Cell[js.Any]]
  ): Lambda6_[A, B, C, D, E, F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda6")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda6_[A, B, C, D, E, F, G]]
  
  @scala.inline
  def toSources(deps: js.Array[Stream[js.Any] | Cell[js.Any]]): js.Array[Source] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSources")(deps.asInstanceOf[js.Any]).asInstanceOf[js.Array[Source]]
}
