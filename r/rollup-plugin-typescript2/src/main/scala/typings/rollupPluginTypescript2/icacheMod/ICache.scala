package typings.rollupPluginTypescript2.icacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICache[DataType] extends js.Object {
  def exists(name: String): Boolean
  def `match`(names: js.Array[String]): Boolean
  def path(name: String): String
  def read(name: String): js.UndefOr[DataType | Null]
  def roll(): Unit
  def touch(name: String): Unit
  def write(name: String, data: DataType): Unit
}

object ICache {
  @scala.inline
  def apply[DataType](
    exists: String => Boolean,
    `match`: js.Array[String] => Boolean,
    path: String => String,
    read: String => js.UndefOr[DataType | Null],
    roll: () => Unit,
    touch: String => Unit,
    write: (String, DataType) => Unit
  ): ICache[DataType] = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction1(exists), path = js.Any.fromFunction1(path), read = js.Any.fromFunction1(read), roll = js.Any.fromFunction0(roll), touch = js.Any.fromFunction1(touch), write = js.Any.fromFunction2(write))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[ICache[DataType]]
  }
}

