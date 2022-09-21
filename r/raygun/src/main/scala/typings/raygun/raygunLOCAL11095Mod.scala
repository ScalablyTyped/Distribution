package typings.raygun

import org.scalablytyped.runtime.Instantiable0
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunLOCAL11095Mod {
  
  object default {
    
    @JSImport("raygun/build/raygun_LOCAL_11095", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raygun/build/raygun_LOCAL_11095", "default.Client")
    @js.native
    def Client: Instantiable0[Raygun] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("raygun/build/raygun_LOCAL_11095", "default.Client")
    @js.native
    open class ClientCls ()
      extends StObject
         with Raygun
    
    inline def Client_=(x: Instantiable0[Raygun]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("raygun/build/raygun_LOCAL_11095", "Client")
  @js.native
  val Client: Instantiable0[Raygun] = js.native
  type Client = Raygun
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("raygun/build/raygun_LOCAL_11095", "Client")
  @js.native
  open class ClientCls ()
    extends StObject
       with Raygun
  
  @js.native
  trait Raygun extends StObject {
    
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
    
    /* private */ var buildSendOptions: Any = js.native
    
    def expressCustomData(
      error: js.Error,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Object = js.native
    
    def expressHandler(
      err: js.Error,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): Unit = js.native
    
    def groupingKey(groupingKey: Hook[String]): this.type = js.native
    
    def init(options: RaygunOptions): this.type = js.native
    
    def offline(): Unit = js.native
    
    /* private */ var offlineStorage: Any = js.native
    
    /* private */ var offlineTransport: Any = js.native
    
    def onBeforeSend(onBeforeSend: Hook[Message]): this.type = js.native
    
    def online(): Unit = js.native
    def online(callback: SendCB): Unit = js.native
    
    /* private */ var reportUncaughtExceptions: Any = js.native
    
    def send(exception: String): Message = js.native
    def send(exception: String, customData: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Message = js.native
    def send(
      exception: String,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Unit,
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: String,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: Unit, callback: Unit, request: Unit, tags: js.Array[Tag]): Message = js.native
    def send(
      exception: String,
      customData: Unit,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: String,
      customData: Unit,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData): Message = js.native
    def send(exception: String, customData: CustomData, callback: js.Function1[/* err */ js.Error | Null, Unit]): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Unit,
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData, callback: Unit, request: Unit, tags: js.Array[Tag]): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error): Message = js.native
    def send(exception: js.Error, customData: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Message = js.native
    def send(
      exception: js.Error,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Unit,
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error, customData: Unit, callback: Unit, request: Unit, tags: js.Array[Tag]): Message = js.native
    def send(
      exception: js.Error,
      customData: Unit,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: Unit,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error, customData: CustomData): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Unit,
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error, customData: CustomData, callback: Unit, request: Unit, tags: js.Array[Tag]): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: Unit,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      tags: js.Array[Tag]
    ): Message = js.native
    
    /* private */ var sendSync: Any = js.native
    
    def setTags(tags: js.Array[Tag]): Unit = js.native
    
    def setUser(user: RawUserData): this.type = js.native
    
    def setVersion(version: String): this.type = js.native
    
    def stop(): Unit = js.native
    
    def transport(): Transport = js.native
    
    def user(): RawUserData | Null = js.native
    def user(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): RawUserData | Null = js.native
  }
  
  type SendCB = js.Function2[/* error */ js.Error | Null, /* items */ js.UndefOr[js.Array[String]], Unit]
}
