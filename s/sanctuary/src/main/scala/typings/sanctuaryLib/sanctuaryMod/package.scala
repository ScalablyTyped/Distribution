package typings
package sanctuaryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sanctuaryMod {
  type Alt[A] = Functor[A]
  type Applicative[A] = Apply[A]
  type Apply[A] = Functor[A]
  type Bifunctor[A, C] = Functor[C]
  type Category[A] = Semigroupoid[A, A]
  type Chain[A] = Apply[A]
  type ChainRec[A] = Chain[A]
  type Comonad[A] = Extend[A]
  type Extend[A] = Functor[A]
  type Monoid[A] = Semigroup[A]
  type Ord[A] = Setoid[A]
  type Plus[A] = Alt[A]
  type Profunctor[B, C] = Functor[C]
}
