package typings.reduxLocalstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdapterCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]
  type StorageAdapterCreator[A] = js.Function1[/* storage */ A, typings.reduxLocalstorage.mod.StorageAdapter[A]]
}
