package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Try[A] extends js.Object {
  var isFailure: scala.Boolean
  var isSuccess: scala.Boolean
  def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C]
  def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
  def chain[B](ob: Try[B]): TryBuilder1[A, B]
  def failed(): Try[A]
  def filter(f: js.Function1[/* a */ A, scala.Boolean]): Try[A]
  def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B]
  def fold[B](fe: js.Function1[/* e */ stdLib.Error, B], ff: js.Function1[/* a */ A, B]): B
  def foreach[B](f: js.Function1[/* a */ A, scala.Unit]): scala.Unit
  def get(): A
  def getError(): stdLib.Error
  def getOrElse[B /* <: A */](a: B): A
  def map[B](f: js.Function1[/* a */ A, B]): Try[B]
  def orElse[B /* <: A */](a: Try[B]): Try[A]
  def recover[B /* <: A */](f: js.Function1[/* e */ stdLib.Error, Optional[Try[B]]]): Try[A]
  def toOptional(): Optional[A]
  def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ stdLib.Error, Try[B]]): Try[B]
}

object Try {
  @scala.inline
  def apply[A](
    apply1: js.Function2[Try[js.Any], js.Function2[/* a */ A, js.Any, js.Any], Try[js.Any]],
    apply2: js.Function3[Try[js.Any], Try[js.Any], js.Function3[/* a */ A, js.Any, js.Any, js.Any], Try[js.Any]],
    chain: js.Function1[Try[js.Any], TryBuilder1[A, js.Any]],
    failed: js.Function0[Try[A]],
    filter: js.Function1[js.Function1[/* a */ A, scala.Boolean], Try[A]],
    flatMap: js.Function1[js.Function1[/* a */ A, Try[js.Any]], Try[js.Any]],
    fold: js.Function2[js.Function1[/* e */ stdLib.Error, js.Any], js.Function1[/* a */ A, js.Any], js.Any],
    foreach: js.Function1[js.Function1[/* a */ A, scala.Unit], scala.Unit],
    get: js.Function0[A],
    getError: js.Function0[stdLib.Error],
    getOrElse: js.Function1[js.Any, A],
    isFailure: scala.Boolean,
    isSuccess: scala.Boolean,
    map: js.Function1[js.Function1[/* a */ A, js.Any], Try[js.Any]],
    orElse: js.Function1[Try[js.Any], Try[A]],
    recover: js.Function1[js.Function1[/* e */ stdLib.Error, Optional[Try[js.Any]]], Try[A]],
    toOptional: js.Function0[Optional[A]],
    transform: js.Function2[
      js.Function1[/* a */ A, Try[js.Any]], 
      js.Function1[/* e */ stdLib.Error, Try[js.Any]], 
      Try[js.Any]
    ]
  ): Try[A] = {
    val __obj = js.Dynamic.literal(apply1 = apply1, apply2 = apply2, chain = chain, failed = failed, filter = filter, flatMap = flatMap, fold = fold, foreach = foreach, get = get, getError = getError, getOrElse = getOrElse, isFailure = isFailure, isSuccess = isSuccess, map = map, orElse = orElse, recover = recover, toOptional = toOptional, transform = transform)
  
    __obj.asInstanceOf[Try[A]]
  }
}

