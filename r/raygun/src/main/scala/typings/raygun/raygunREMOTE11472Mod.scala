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

object raygunREMOTE11472Mod {
  
  @JSImport("raygun/build/raygun_REMOTE_11472", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("raygun/build/raygun_REMOTE_11472", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("raygun/build/raygun_REMOTE_11472", "default.Client")
    @js.native
    open class Client ()
      extends StObject
         with Raygun
    @JSImport("raygun/build/raygun_REMOTE_11472", "default.Client")
    @js.native
    def Client: Instantiable0[Raygun] = js.native
    inline def Client_=(x: Instantiable0[Raygun]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
    
    @JSImport("raygun/build/raygun_REMOTE_11472", "default.addBreadcrumb")
    @js.native
    def addBreadcrumb: js.Function2[
        /* breadcrumb */ String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any), 
        /* type */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
        ], 
        Unit
      ] = js.native
    inline def addBreadcrumb(breadcrumb: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBreadcrumb(
      breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addBreadcrumb_=(
      x: js.Function2[
          /* breadcrumb */ String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any), 
          /* type */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addBreadcrumb")(x.asInstanceOf[js.Any])
    
    inline def addBreadcrumb_type(
      breadcrumb: String,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addBreadcrumb_type(
      breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("raygun/build/raygun_REMOTE_11472", "default.runWithBreadcrumbs")
    @js.native
    def runWithBreadcrumbs: js.Function1[/* f */ js.Function0[Unit], Unit] = js.native
    inline def runWithBreadcrumbs(f: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithBreadcrumbs")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def runWithBreadcrumbs_=(x: js.Function1[/* f */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runWithBreadcrumbs")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("raygun/build/raygun_REMOTE_11472", "Client")
  @js.native
  open class Client ()
    extends StObject
       with Raygun
  @JSImport("raygun/build/raygun_REMOTE_11472", "Client")
  @js.native
  val Client: Instantiable0[Raygun] = js.native
  
  inline def addBreadcrumb(breadcrumb: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addBreadcrumb(
    breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addBreadcrumb_type(
    breadcrumb: String,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBreadcrumb_type(
    breadcrumb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalBreadcrumb * / any['type'] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBreadcrumb")(breadcrumb.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def runWithBreadcrumbs(f: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runWithBreadcrumbs")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    def addBreadcrumb(b: String): Unit = js.native
    def addBreadcrumb(
      b: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Breadcrumb */ Any
    ): Unit = js.native
    
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
    
    def onBeforeSend(onBeforeSend: Hook[Message]): this.type = js.native
    
    def online(): Unit = js.native
    def online(callback: SendCB): Unit = js.native
    
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
    
    def setTags(tags: js.Array[Tag]): Unit = js.native
    
    def setUser(user: RawUserData): this.type = js.native
    
    def setVersion(version: String): this.type = js.native
    
    def stop(): Unit = js.native
    
    def transport(): Transport = js.native
    
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
