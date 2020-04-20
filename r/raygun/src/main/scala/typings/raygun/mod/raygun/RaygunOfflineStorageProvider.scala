package typings.raygun.mod.raygun

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOfflineStorageProvider[TTransportItem, TStorageItem] extends js.Object {
  def init(options: js.Any): RaygunOfflineStorageProvider[RaygunPayload, String]
  def retrieve(callback: js.Function2[/* error */ Error, /* storageItems */ js.Array[TStorageItem], Unit]): Unit
  def save(item: TTransportItem, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit
  def send(callback: js.Function2[/* error */ Error, /* sendItems */ js.Array[TStorageItem], Unit]): Unit
}

object RaygunOfflineStorageProvider {
  @scala.inline
  def apply[TTransportItem, TStorageItem](
    init: js.Any => RaygunOfflineStorageProvider[RaygunPayload, String],
    retrieve: js.Function2[/* error */ Error, /* storageItems */ js.Array[TStorageItem], Unit] => Unit,
    save: (TTransportItem, js.Function1[/* error */ js.UndefOr[Error], Unit]) => Unit,
    send: js.Function2[/* error */ Error, /* sendItems */ js.Array[TStorageItem], Unit] => Unit
  ): RaygunOfflineStorageProvider[TTransportItem, TStorageItem] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), retrieve = js.Any.fromFunction1(retrieve), save = js.Any.fromFunction2(save), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[RaygunOfflineStorageProvider[TTransportItem, TStorageItem]]
  }
}

