package typings.steed

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object steedMod {
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback[T] = js.Function1[/* err */ js.UndefOr[T], Unit]
  type SteedFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E], /* result */ js.UndefOr[T], Unit], 
    Unit
  ]
  type SteedIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], Unit]
  type SteedResultArrayCallback[T, E] = js.Function2[/* err */ E, /* results */ js.Array[T], Unit]
  type SteedResultCallback[T, E] = js.Function2[/* err */ E, /* result */ T, Unit]
  type SteedResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ SteedResultCallback[R, E], Unit]
  type SteedResultObjectCallback[T, E] = js.Function2[/* err */ E, /* results */ Dictionary[T], Unit]
  type SteedWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], Unit]
}
