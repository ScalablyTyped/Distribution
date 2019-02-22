package typings
package raygunLib.raygunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun", "Client")
@js.native
class Client () extends js.Object {
  def expressHandler(
    error: stdLib.Error,
    request: raygunLib.raygunMod.raygunNs.RaygunRequest,
    res: js.Any,
    next: js.Any
  ): scala.Unit = js.native
  def groupingKey(groupingKey: java.lang.String): Client = js.native
  def init(options: raygunLib.raygunMod.raygunNs.RaygunOptions): Client = js.native
  def offline(): Client = js.native
  def onBeforeSend(callback: raygunLib.raygunMod.raygunNs.OnBeforeSend): Client = js.native
  def online(): Client = js.native
  def send(exception: java.lang.String): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(exception: java.lang.String, customData: raygunLib.raygunMod.raygunNs.KeyValueObject): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: java.lang.String,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: java.lang.String,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: java.lang.String,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest,
    tags: js.Array[java.lang.String]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(exception: js.Object): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(exception: js.Object, customData: raygunLib.raygunMod.raygunNs.KeyValueObject): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: js.Object,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest,
    tags: js.Array[java.lang.String]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(exception: stdLib.Error): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(exception: stdLib.Error, customData: raygunLib.raygunMod.raygunNs.KeyValueObject): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: stdLib.Error,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: stdLib.Error,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def send(
    exception: stdLib.Error,
    customData: raygunLib.raygunMod.raygunNs.KeyValueObject,
    offlineStorageCallback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    request: raygunLib.raygunMod.raygunNs.RaygunRequest,
    tags: js.Array[java.lang.String]
  ): raygunLib.raygunMod.raygunNs.RaygunPayload = js.native
  def setUser(user: raygunLib.raygunMod.raygunNs.RaygunUser): Client = js.native
  def setVersion(version: java.lang.String): Client = js.native
}

