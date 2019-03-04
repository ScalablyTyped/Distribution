package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optional[A] extends js.Object {
  var isEmpty: scala.Boolean
  var nonEmpty: scala.Boolean
  def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C]
  def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D]
  def chain[B](ob: Optional[B]): OptionalBuilder1[A, B]
  def contains[B /* <: A */](b: B): scala.Boolean
  def exists(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Optional[A]
  def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B]
  def flatten(): Optional[A]
  def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B
  def forall(f: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean
  def foreach(f: js.Function1[/* a */ A, scala.Unit]): scala.Unit
  def get(): A
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Optional[B]
  def orElse[B /* <: A */](ob: Optional[B]): Optional[A]
}

object Optional {
  @scala.inline
  def apply[A](
    apply1: js.Function2[Optional[js.Any], js.Function2[/* a */ A, js.Any, js.Any], Optional[js.Any]],
    apply2: js.Function3[
      Optional[js.Any], 
      Optional[js.Any], 
      js.Function3[/* a */ A, js.Any, js.Any, js.Any], 
      Optional[js.Any]
    ],
    chain: js.Function1[Optional[js.Any], OptionalBuilder1[A, js.Any]],
    contains: js.Function1[js.Any, scala.Boolean],
    exists: js.Function1[js.Function1[/* a */ A, scala.Boolean], scala.Boolean],
    filter: js.Function1[js.Function1[/* a */ A, scala.Boolean], Optional[A]],
    flatMap: js.Function1[js.Function1[/* a */ A, Optional[js.Any]], Optional[js.Any]],
    flatten: js.Function0[Optional[A]],
    fold: js.Function2[js.Any, js.Function1[/* a */ A, js.Any], js.Any],
    forall: js.Function1[js.Function1[/* a */ A, scala.Boolean], scala.Boolean],
    foreach: js.Function1[js.Function1[/* a */ A, scala.Unit], scala.Unit],
    get: js.Function0[A],
    getOrElse: js.Function1[js.Any, A],
    isEmpty: scala.Boolean,
    map: js.Function1[js.Function1[/* a */ A, js.Any], Optional[js.Any]],
    nonEmpty: scala.Boolean,
    orElse: js.Function1[Optional[js.Any], Optional[A]]
  ): Optional[A] = {
    val __obj = js.Dynamic.literal(apply1 = apply1, apply2 = apply2, chain = chain, contains = contains, exists = exists, filter = filter, flatMap = flatMap, flatten = flatten, fold = fold, forall = forall, foreach = foreach, get = get, getOrElse = getOrElse, isEmpty = isEmpty, map = map, nonEmpty = nonEmpty, orElse = orElse)
  
    __obj.asInstanceOf[Optional[A]]
  }
}

