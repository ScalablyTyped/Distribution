package typings.raygun

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.raygun.raygunBatchMod.RaygunBatchTransport
import typings.raygun.typesMod.CustomData
import typings.raygun.typesMod.Hook
import typings.raygun.typesMod.IOfflineStorage
import typings.raygun.typesMod.Message
import typings.raygun.typesMod.OfflineStorageOptions
import typings.raygun.typesMod.RawUserData
import typings.raygun.typesMod.RaygunOptions
import typings.raygun.typesMod.Tag
import typings.raygun.typesMod.Transport
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Raygun extends js.Object {
    var _apiKey: js.UndefOr[String] = js.native
    var _batch: Boolean = js.native
    var _batchTransport: js.UndefOr[RaygunBatchTransport] = js.native
    var _filters: js.Array[String] = js.native
    var _groupingKey: js.UndefOr[Hook[String]] = js.native
    var _host: js.UndefOr[String] = js.native
    var _innerErrorFieldName: js.UndefOr[String] = js.native
    var _isOffline: js.UndefOr[Boolean] = js.native
    var _offlineStorage: js.UndefOr[IOfflineStorage] = js.native
    var _offlineStorageOptions: js.UndefOr[OfflineStorageOptions] = js.native
    var _onBeforeSend: js.UndefOr[Hook[Message]] = js.native
    var _port: js.UndefOr[Double] = js.native
    var _reportColumnNumbers: js.UndefOr[Boolean] = js.native
    var _tags: js.UndefOr[js.Array[Tag]] = js.native
    var _useHumanStringForObject: js.UndefOr[Boolean] = js.native
    var _useSSL: js.UndefOr[Boolean] = js.native
    var _user: js.UndefOr[RawUserData] = js.native
    var _version: String = js.native
    var offlineStorage: js.Any = js.native
    def expressCustomData(error: Error, request: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
    def expressHandler(err: Error, req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): Unit = js.native
    def groupingKey(groupingKey: Hook[String]): this.type = js.native
    def init(options: RaygunOptions): this.type = js.native
    def offline(): Unit = js.native
    def onBeforeSend(onBeforeSend: Hook[Message]): this.type = js.native
    def online(): Unit = js.native
    def online(callback: SendCB): Unit = js.native
    def send(exception: String): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData, callback: js.Function1[/* err */ Error | Null, Unit]): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: Error): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: Error, customData: CustomData): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: Error, customData: CustomData, callback: js.Function1[/* err */ Error | Null, Unit]): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: Error,
      customData: CustomData,
      callback: js.Function1[/* err */ Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def setTags(tags: js.Array[Tag]): Unit = js.native
    def setUser(user: RawUserData): this.type = js.native
    def setVersion(version: String): this.type = js.native
    def stop(): Unit = js.native
    def transport(): Transport = js.native
    def user(req: Request_[ParamsDictionary, _, _, Query]): RawUserData | Null = js.native
  }
  
  val Client: Instantiable0[Raygun] = js.native
  @js.native
  object default extends js.Object {
    @js.native
    class Client () extends Raygun
    
    @js.native
    object Client extends TopLevel[Instantiable0[Raygun]]
    
  }
  
  type SendCB = js.Function2[/* error */ Error | Null, /* items */ js.UndefOr[js.Array[String]], Unit]
}

