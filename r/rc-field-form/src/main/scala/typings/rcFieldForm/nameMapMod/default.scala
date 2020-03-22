package typings.rcFieldForm.nameMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NameMap like a `Map` but accepts `string[]` as key.
  */
@JSImport("rc-field-form/lib/utils/NameMap", JSImport.Default)
@js.native
class default[T] () extends NameMap[T] {
  /* CompleteClass */
  override var list: js.Any = js.native
  /* CompleteClass */
  override def delete(key: InternalNamePath): Unit = js.native
  /* CompleteClass */
  override def get(key: InternalNamePath): T = js.native
  /* CompleteClass */
  override def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U] = js.native
  /* CompleteClass */
  override def set(key: InternalNamePath, value: T): Unit = js.native
  /* CompleteClass */
  override def toJSON(): StringDictionary[T] = js.native
  /* CompleteClass */
  override def update(key: InternalNamePath, updater: js.Function1[T, T | Null]): Unit = js.native
}

