package typings.raygun.mod

import typings.raygun.mod.raygun.GroupingKey
import typings.raygun.mod.raygun.KeyValueObject
import typings.raygun.mod.raygun.OnBeforeSend
import typings.raygun.mod.raygun.RaygunOptions
import typings.raygun.mod.raygun.RaygunPayload
import typings.raygun.mod.raygun.RaygunRequest
import typings.raygun.mod.raygun.RaygunUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun", "Client")
@js.native
class Client () extends js.Object {
  def expressHandler(error: Error, request: RaygunRequest, res: js.Any, next: js.Any): Unit = js.native
  def groupingKey(groupingKey: String): Client = js.native
  def groupingKey(groupingKey: GroupingKey): Client = js.native
  def init(options: RaygunOptions): Client = js.native
  def offline(): Client = js.native
  def onBeforeSend(callback: OnBeforeSend): Client = js.native
  def online(): Client = js.native
  def send(exception: String): RaygunPayload = js.native
  def send(exception: String, customData: KeyValueObject): RaygunPayload = js.native
  def send(
    exception: String,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): RaygunPayload = js.native
  def send(
    exception: String,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest
  ): RaygunPayload = js.native
  def send(
    exception: String,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest,
    tags: js.Array[String]
  ): RaygunPayload = js.native
  def send(exception: js.Object): RaygunPayload = js.native
  def send(exception: js.Object, customData: KeyValueObject): RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest
  ): RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest,
    tags: js.Array[String]
  ): RaygunPayload = js.native
  def send(exception: Error): RaygunPayload = js.native
  def send(exception: Error, customData: KeyValueObject): RaygunPayload = js.native
  def send(
    exception: Error,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): RaygunPayload = js.native
  def send(
    exception: Error,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest
  ): RaygunPayload = js.native
  def send(
    exception: Error,
    customData: KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[Error], Unit],
    request: RaygunRequest,
    tags: js.Array[String]
  ): RaygunPayload = js.native
  def setUser(user: RaygunUser): Client = js.native
  def setVersion(version: String): Client = js.native
  def user(req: RaygunRequest): RaygunUser | String = js.native
}

