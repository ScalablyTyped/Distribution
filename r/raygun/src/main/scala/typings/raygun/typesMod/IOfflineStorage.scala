package typings.raygun.typesMod

import typings.node.NodeJS.ErrnoException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOfflineStorage extends js.Object {
  def init(): Unit = js.native
  def init(options: OfflineStorageOptions): Unit = js.native
  def retrieve(callback: js.Function2[/* error */ ErrnoException | Null, /* items */ js.Array[String], Unit]): Unit = js.native
  def save(message: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def send(callback: js.Function2[/* error */ Error | Null, /* items */ js.UndefOr[js.Array[String]], Unit]): Unit = js.native
}

