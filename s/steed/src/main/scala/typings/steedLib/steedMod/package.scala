package typings
package steedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object steedMod {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback[T] = js.Function1[/* err */ js.UndefOr[T], scala.Unit]
  type SteedFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E], /* result */ js.UndefOr[T], scala.Unit], 
    scala.Unit
  ]
  type SteedIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], scala.Unit]
  type SteedResultArrayCallback[T, E] = js.Function2[/* err */ E, /* results */ js.Array[T], scala.Unit]
  type SteedResultCallback[T, E] = js.Function2[/* err */ E, /* result */ T, scala.Unit]
  type SteedResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ SteedResultCallback[R, E], scala.Unit]
  type SteedResultObjectCallback[T, E] = js.Function2[/* err */ E, /* results */ Dictionary[T], scala.Unit]
  type SteedWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], scala.Unit]
}
