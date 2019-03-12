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
    apply1: (Optional[js.Any], js.Function2[/* a */ A, js.Any, js.Any]) => Optional[js.Any],
    apply2: (Optional[js.Any], Optional[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any]) => Optional[js.Any],
    chain: Optional[js.Any] => OptionalBuilder1[A, js.Any],
    contains: js.Any => scala.Boolean,
    exists: js.Function1[/* a */ A, scala.Boolean] => scala.Boolean,
    filter: js.Function1[/* a */ A, scala.Boolean] => Optional[A],
    flatMap: js.Function1[/* a */ A, Optional[js.Any]] => Optional[js.Any],
    flatten: () => Optional[A],
    fold: (js.Any, js.Function1[/* a */ A, js.Any]) => js.Any,
    forall: js.Function1[/* a */ A, scala.Boolean] => scala.Boolean,
    foreach: js.Function1[/* a */ A, scala.Unit] => scala.Unit,
    get: () => A,
    getOrElse: js.Any => A,
    isEmpty: scala.Boolean,
    map: js.Function1[/* a */ A, js.Any] => Optional[js.Any],
    nonEmpty: scala.Boolean,
    orElse: Optional[js.Any] => Optional[A]
  ): Optional[A] = {
    val __obj = js.Dynamic.literal(apply1 = js.Any.fromFunction2(apply1), apply2 = js.Any.fromFunction3(apply2), chain = js.Any.fromFunction1(chain), contains = js.Any.fromFunction1(contains), exists = js.Any.fromFunction1(exists), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), flatten = js.Any.fromFunction0(flatten), fold = js.Any.fromFunction2(fold), forall = js.Any.fromFunction1(forall), foreach = js.Any.fromFunction1(foreach), get = js.Any.fromFunction0(get), getOrElse = js.Any.fromFunction1(getOrElse), isEmpty = isEmpty, map = js.Any.fromFunction1(map), nonEmpty = nonEmpty, orElse = js.Any.fromFunction1(orElse))
  
    __obj.asInstanceOf[Optional[A]]
  }
}

