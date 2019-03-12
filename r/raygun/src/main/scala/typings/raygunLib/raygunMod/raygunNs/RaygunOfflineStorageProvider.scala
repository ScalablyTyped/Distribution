package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOfflineStorageProvider[TTransportItem, TStorageItem] extends js.Object {
  def init(options: js.Any): RaygunOfflineStorageProvider[RaygunPayload, java.lang.String]
  def retrieve(
    callback: js.Function2[/* error */ stdLib.Error, /* storageItems */ js.Array[TStorageItem], scala.Unit]
  ): scala.Unit
  def save(item: TTransportItem, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit
  def send(
    callback: js.Function2[/* error */ stdLib.Error, /* sendItems */ js.Array[TStorageItem], scala.Unit]
  ): scala.Unit
}

object RaygunOfflineStorageProvider {
  @scala.inline
  def apply[TTransportItem, TStorageItem](
    init: js.Any => RaygunOfflineStorageProvider[RaygunPayload, java.lang.String],
    retrieve: js.Function2[/* error */ stdLib.Error, /* storageItems */ js.Array[TStorageItem], scala.Unit] => scala.Unit,
    save: (TTransportItem, js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]) => scala.Unit,
    send: js.Function2[/* error */ stdLib.Error, /* sendItems */ js.Array[TStorageItem], scala.Unit] => scala.Unit
  ): RaygunOfflineStorageProvider[TTransportItem, TStorageItem] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), retrieve = js.Any.fromFunction1(retrieve), save = js.Any.fromFunction2(save), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[RaygunOfflineStorageProvider[TTransportItem, TStorageItem]]
  }
}

