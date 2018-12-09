package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageStorage extends js.Object {
  def clear(): js.Promise[scala.Unit] = js.native
  def clear(callback: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  def getItem[T](key: java.lang.String): js.Promise[T] = js.native
  def getItem[T](key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* value */ T, scala.Unit]): js.Promise[T] = js.native
  def iterate[T, U](
    iteratee: js.Function3[/* value */ T, /* key */ java.lang.String, /* iterationNumber */ scala.Double, U]
  ): js.Promise[U] = js.native
  def iterate[T, U](
    iteratee: js.Function3[/* value */ T, /* key */ java.lang.String, /* iterationNumber */ scala.Double, U],
    callback: js.Function2[/* err */ js.Any, /* result */ U, scala.Unit]
  ): js.Promise[U] = js.native
  def key(keyIndex: scala.Double): js.Promise[java.lang.String] = js.native
  def key(
    keyIndex: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* key */ java.lang.String, scala.Unit]
  ): js.Promise[java.lang.String] = js.native
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  def keys(callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[java.lang.String], scala.Unit]): js.Promise[js.Array[java.lang.String]] = js.native
  def length(): js.Promise[scala.Double] = js.native
  def length(callback: js.Function2[/* err */ js.Any, /* numberOfKeys */ scala.Double, scala.Unit]): js.Promise[scala.Double] = js.native
  def removeItem(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeItem(key: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  def setItem[T](key: java.lang.String, value: T): js.Promise[T] = js.native
  def setItem[T](
    key: java.lang.String,
    value: T,
    callback: js.Function2[/* err */ js.Any, /* value */ T, scala.Unit]
  ): js.Promise[T] = js.native
}

