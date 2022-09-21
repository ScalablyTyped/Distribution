package typings.salesforceCanvasJsSdk

import typings.salesforceCanvasJsSdk.Sfdc.canvas.Client_
import typings.salesforceCanvasJsSdk.Sfdc.canvas.Context
import typings.salesforceCanvasJsSdk.Sfdc.canvas.Response
import typings.salesforceCanvasJsSdk.Sfdc.canvas.SignedRequest
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.AjaxSettings
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.Event
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.Size
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.Subscription
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.SubscriptionRef
import typings.salesforceCanvasJsSdk.Sfdc.canvas.client.Version
import typings.salesforceCanvasJsSdk.Sfdc.canvas.oauth.LoginContext
import typings.salesforceCanvasJsSdk.Sfdc.canvas.xd.Callback
import typings.salesforceCanvasJsSdk.Sfdc.canvas.xd.OriginCheckFn
import typings.salesforceCanvasJsSdk.anon.Height
import typings.salesforceCanvasJsSdk.anon.Typeofcanvas
import typings.std.ArrayLike
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Sfdc {
    
    object canvas {
      
      inline def apply(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSGlobal("Sfdc.canvas")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Sfdc.canvas.ApplicationAuthType")
      @js.native
      object ApplicationAuthType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationAuthType & String] = js.native
        
        /* "OAUTH" */ val OAUTH: typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationAuthType.OAUTH & String = js.native
        
        /* "SIGNED_REQUEST" */ val SIGNED_REQUEST: typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationAuthType.SIGNED_REQUEST & String = js.native
      }
      
      @JSGlobal("Sfdc.canvas.ApplicationOptions")
      @js.native
      object ApplicationOptions extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationOptions & String] = js.native
        
        /* "HideHeader" */ val HIDE_HEADER: typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationOptions.HIDE_HEADER & String = js.native
        
        /* "HideShare" */ val HIDE_SHARE: typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationOptions.HIDE_SHARE & String = js.native
        
        /* "PersonalEnabled" */ val PERSONAL_ENABLED: typings.salesforceCanvasJsSdk.Sfdc.canvas.ApplicationOptions.PERSONAL_ENABLED & String = js.native
      }
      
      @JSGlobal("Sfdc.canvas.EnvironmentDisplayLocation")
      @js.native
      object EnvironmentDisplayLocation extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation & String] = js.native
        
        /* "Chatter" */ val CHATTER: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.CHATTER & String = js.native
        
        /* "ChatterFeed" */ val CHATTER_FEED: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.CHATTER_FEED & String = js.native
        
        /* "MobileNav" */ val MOBILE_NAV: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.MOBILE_NAV & String = js.native
        
        /* "None" */ val NONE: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.NONE & String = js.native
        
        /* "OpenCTI" */ val OPEN_CTI: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.OPEN_CTI & String = js.native
        
        /* "PageLayout" */ val PAGE_LAYOUT: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.PAGE_LAYOUT & String = js.native
        
        /* "Publisher" */ val PUBLISHER: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.PUBLISHER & String = js.native
        
        /* "ServiceDesk" */ val SERVICE_DESK: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.SERVICE_DESK & String = js.native
        
        /* "Visualforce" */ val VISUAL_FORCE: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplayLocation.VISUAL_FORCE & String = js.native
      }
      
      @JSGlobal("Sfdc.canvas.EnvironmentDisplaySubLocation")
      @js.native
      object EnvironmentDisplaySubLocation extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplaySubLocation & String] = js.native
        
        /* "S1MobileCardFullview" */ val MOBILE_CARD_FULLVIEW: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplaySubLocation.MOBILE_CARD_FULLVIEW & String = js.native
        
        /* "S1MobileCardPreview" */ val MOBILE_CARD_PREVIEW: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplaySubLocation.MOBILE_CARD_PREVIEW & String = js.native
        
        /* "S1RecordHomeFullview" */ val RECORD_HOME_FULLVIEW: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplaySubLocation.RECORD_HOME_FULLVIEW & String = js.native
        
        /* "S1RecordHomePreview" */ val RECORD_HOME_PREVIEW: typings.salesforceCanvasJsSdk.Sfdc.canvas.EnvironmentDisplaySubLocation.RECORD_HOME_PREVIEW & String = js.native
      }
      
      @JSGlobal("Sfdc.canvas.UserType")
      @js.native
      object UserType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.salesforceCanvasJsSdk.Sfdc.canvas.UserType & String] = js.native
        
        /* "STANDARD" */ val STANDARD: typings.salesforceCanvasJsSdk.Sfdc.canvas.UserType.STANDARD & String = js.native
      }
      
      inline def appearsJson(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("appearsJson")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def attr(el: HTMLElement, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def byClass(clazz: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("byClass")(clazz.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
      
      inline def byId(id: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("byId")(id.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
      
      inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      object client {
        
        @JSGlobal("Sfdc.canvas.client")
        @js.native
        val ^ : js.Any = js.native
        
        inline def ajax(url: String, settings: AjaxSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def autogrow(client: Client_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autogrow")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def autogrow(client: Client_, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autogrow")(client.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def autogrow(client: Client_, enabled: Boolean, interval: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autogrow")(client.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def autogrow(client: Client_, enabled: Unit, interval: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autogrow")(client.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def ctx(callback: js.Function1[/* msg */ Response[Context | String], Unit], client: Client_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ctx")(callback.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def publish(client: Client_, event: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(client.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def refreshSignedRequest(cb: js.Function1[/* data */ Response[typings.salesforceCanvasJsSdk.anon.Response], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshSignedRequest")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def repost(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repost")().asInstanceOf[Unit]
        inline def repost(refresh: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repost")(refresh.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def resize(client: Client_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def resize(client: Client_, size: Height): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(client.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def signedrequest(): SignedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("signedrequest")().asInstanceOf[SignedRequest]
        inline def signedrequest(req: SignedRequest): SignedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("signedrequest")(req.asInstanceOf[js.Any]).asInstanceOf[SignedRequest]
        
        inline def size(): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Size]
        
        inline def subscribe(client: Client_, subscriptions: js.Array[Subscription]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(client.asInstanceOf[js.Any], subscriptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def subscribe(client: Client_, subscriptions: Subscription): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(client.asInstanceOf[js.Any], subscriptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def token(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("token")().asInstanceOf[String | Null]
        inline def token(t: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(t.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        inline def unsubscribe(client: Client_, subscriptions: js.Array[SubscriptionRef]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(client.asInstanceOf[js.Any], subscriptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def unsubscribe(client: Client_, subscriptions: SubscriptionRef): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(client.asInstanceOf[js.Any], subscriptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def version(): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[Version]
      }
      
      object console {
        
        @JSGlobal("Sfdc.canvas.console")
        @js.native
        val ^ : js.Any = js.native
        
        inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
        
        inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
        
        inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
        
        inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      }
      
      object cookies {
        
        @JSGlobal("Sfdc.canvas.cookies")
        @js.native
        val ^ : js.Any = js.native
        
        inline def get(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def set(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def set(name: String, value: String, days: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      inline def decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def document(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("document")().asInstanceOf[Document]
      
      inline def each[T, S](
        obj: js.Array[T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def each[T, S](
        obj: js.Array[T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], Unit],
        ctx: S
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def each[T, S](
        obj: Record[String, T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def each[T, S](
        obj: Record[String, T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], Unit],
        ctx: S
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def endsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def escapeToUTF8(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeToUTF8")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */](a: A, b: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A & B]
      inline def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */](a: A, b: B, c: C): A & B & C = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[A & B & C]
      inline def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */, D /* <: Record[String, Any] */](a: A, b: B, c: C, d: D): A & B & C & D = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D]
      inline def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */, D /* <: Record[String, Any] */, E /* <: Record[String, Any] */](a: A, b: B, c: C, d: D, e: E): A & B & C & D & E = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E]
      
      inline def hasOwn(obj: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def identity[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
      
      inline def indexOf[T](arr: ArrayLike[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def invoker(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invoker")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def isArguments(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArguments")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isArray(value: Any): /* is std.ArrayLike<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayLike<unknown> */ Boolean]
      
      inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isNil(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
      
      inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
      
      inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
      
      inline def map[T, R, S](
        obj: js.Array[T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], R]
      ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
      inline def map[T, R, S](
        obj: js.Array[T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], R],
        ctx: S
      ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
      inline def map[T, R, S](
        obj: Record[String, T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], R]
      ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
      inline def map[T, R, S](
        obj: Record[String, T],
        it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], R],
        ctx: S
      ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], it.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
      
      inline def module(ns: String, decl: Record[String, Any]): Typeofcanvas = (^.asInstanceOf[js.Dynamic].applyDynamic("module")(ns.asInstanceOf[js.Any], decl.asInstanceOf[js.Any])).asInstanceOf[Typeofcanvas]
      
      inline def nop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nop")().asInstanceOf[Unit]
      
      object oauth {
        
        @JSGlobal("Sfdc.canvas.oauth")
        @js.native
        val ^ : js.Any = js.native
        
        /** @deprecated */
        inline def checkChildWindowStatus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkChildWindowStatus")().asInstanceOf[Unit]
        
        inline def childWindowUnloadNotification(hash: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("childWindowUnloadNotification")(hash.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def client(): Client_ = ^.asInstanceOf[js.Dynamic].applyDynamic("client")().asInstanceOf[Client_]
        
        inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
        
        inline def instance(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[String | Null]
        inline def instance(t: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(t.asInstanceOf[js.Any]).asInstanceOf[String | Null]
        
        inline def loggedin(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggedin")().asInstanceOf[Boolean]
        
        inline def login(ctx: LoginContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def loginUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loginUrl")().asInstanceOf[String]
        
        inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
        
        inline def token(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("token")().asInstanceOf[String | Null]
        inline def token(t: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(t.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      inline def objectify(q: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectify")(q.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
      
      inline def onReady(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def param(obj: ArrayLike[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def param(obj: ArrayLike[Any], encode: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(obj.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def param(obj: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def param(obj: Record[String, Any], encode: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(obj.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def prototypeOf(obj: Any): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prototypeOf")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
      
      inline def query(url: String, q: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(url.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def remove[T](arr: ArrayLike[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      
      inline def size(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Double]
      inline def size(obj: ArrayLike[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def size(obj: Record[String, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def slice[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      inline def slice[T](arr: js.Array[T], begin: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(arr.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      inline def slice[T](arr: js.Array[T], begin: Double, end: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(arr.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      inline def slice[T](arr: js.Array[T], begin: Unit, end: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(arr.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
      
      inline def startsWithHttp(orig: String, newUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWithHttp")(orig.asInstanceOf[js.Any], newUrl.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def stripUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def toArray(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[Any]]
      inline def toArray[T](iterable: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      inline def toArray[T](iterable: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      
      inline def uncapitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uncapitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def validEventName(name: String, res: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("validEventName")(name.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def validEventName(name: String, res: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("validEventName")(name.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def values[T](obj: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      inline def values[T](obj: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
      
      object xd {
        
        @JSGlobal("Sfdc.canvas.xd")
        @js.native
        val ^ : js.Any = js.native
        
        inline def post(message: String, targetUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(message.asInstanceOf[js.Any], targetUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def post(message: String, targetUrl: String, target: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(message.asInstanceOf[js.Any], targetUrl.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def receive(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("receive")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def receive(callback: Callback, sourceOrigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receive")(callback.asInstanceOf[js.Any], sourceOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def receive(callback: Callback, sourceOrigin: OriginCheckFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("receive")(callback.asInstanceOf[js.Any], sourceOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
      }
    }
  }
}
