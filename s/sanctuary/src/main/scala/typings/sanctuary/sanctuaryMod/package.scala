package typings.sanctuary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sanctuaryMod {
  import org.scalablytyped.runtime.StringDictionary

  type Alt[A] = Functor[A]
  type Applicative[A] = Apply[A]
  type Apply[A] = Functor[A]
  type Bifunctor[A, C] = Functor[C]
  type Category[A] = Semigroupoid[A, A]
  type Chain[A] = Apply[A]
  type ChainRec[A] = Chain[A]
  type Comonad[A] = Extend[A]
  type Extend[A] = Functor[A]
  type Fn[A, B] = js.Function1[/* a */ A, B]
  type Fn2[A, B, C] = js.Function1[/* a */ A, js.Function1[/* b */ B, C]]
  type Fn2_[A, B, C] = js.Function2[/* a */ A, /* b */ B, C]
  type Fn3[A, B, C, D] = js.Function1[/* a */ A, js.Function1[/* b */ B, js.Function1[/* c */ C, D]]]
  type Fn3_[A, B, C, D] = js.Function3[/* a */ A, /* b */ B, /* c */ C, D]
  type Fn4[A, B, C, D, E] = js.Function1[
    /* a */ A, 
    js.Function1[/* b */ B, js.Function1[/* c */ C, js.Function1[/* d */ D, E]]]
  ]
  type Fn4_[A, B, C, D, E] = js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
  type Fn5[A, B, C, D, E, F] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[/* c */ C, js.Function1[/* d */ D, js.Function1[/* e */ E, F]]]
    ]
  ]
  type Fn5_[A, B, C, D, E, F] = js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
  type Monoid[A] = Semigroup[A]
  type Nullable[A] = A | Null
  type Ord[A] = Setoid[A]
  type Pair[A, B] = js.Tuple2[A, B]
  type Plus[A] = Alt[A]
  type Predicate[A] = js.Function1[/* a */ A, Boolean]
  type Profunctor[B, C] = Functor[C]
  type StrMap[A] = StringDictionary[A]
  type Thunk[A] = js.Function0[A]
}
