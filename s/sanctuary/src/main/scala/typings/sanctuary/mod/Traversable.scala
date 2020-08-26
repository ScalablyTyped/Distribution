package typings.sanctuary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traversable[A]
  extends Functor[A]
     with Foldable[A]

