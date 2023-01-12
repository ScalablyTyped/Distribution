package typings.restangular

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IDeferred
import typings.angular.mod.IRequestShortcutConfig
import typings.restangular.anon.Element
import typings.restangular.anon.Method
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ICollection
    extends StObject
       with IService
       with Array[Any] {
    
    def getList(): ICollectionPromise[Any] = js.native
    def getList(queryParams: Any): ICollectionPromise[Any] = js.native
    def getList(queryParams: Any, headers: Any): ICollectionPromise[Any] = js.native
    def getList(queryParams: Unit, headers: Any): ICollectionPromise[Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Any, headers: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Unit, headers: Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    def head(): IPromise[Any] = js.native
    def head(queryParams: Any): IPromise[Any] = js.native
    def head(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def head(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def options(): IPromise[Any] = js.native
    def options(queryParams: Any): IPromise[Any] = js.native
    def options(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def options(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def patch(): IPromise[Any] = js.native
    def patch(queryParams: Any): IPromise[Any] = js.native
    def patch(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def patch(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def plain(): Any = js.native
    @JSName("plain")
    def plain_T_Array[T](): js.Array[T] = js.native
    
    def post(elementToPost: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Any, headers: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Unit, headers: Any): IPromise[Any] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Any, headers: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Unit, headers: Any): IPromise[T] = js.native
    
    def putElement(idx: Any, params: Any, headers: Any): IPromise[Any] = js.native
    
    def trace(): IPromise[Any] = js.native
    def trace(queryParams: Any): IPromise[Any] = js.native
    def trace(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def trace(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): ICollection = js.native
  }
  
  @js.native
  trait ICollectionPromise[T]
    extends StObject
       with typings.angular.mod.IPromise[js.Array[T]] {
    
    @JSName("$object")
    var $object: js.Array[T] = js.native
    
    def call(methodName: String): ICollectionPromise[T] = js.native
    def call(methodName: String, params: Any): ICollectionPromise[T] = js.native
    
    def get(fieldName: String): ICollectionPromise[T] = js.native
    
    def push(`object`: Any): ICollectionPromise[T] = js.native
  }
  
  @js.native
  trait ICustom extends StObject {
    
    def addRestangularMethod(name: String, operation: String): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Any, headers: Any, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Any, headers: Unit, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: Any, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: Unit, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Any, headers: Any, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Any, headers: Unit, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: Any, elem: Any): IPromise[Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: Unit, elem: Any): IPromise[Any] = js.native
    
    def customDELETE(path: String): IPromise[Any] = js.native
    def customDELETE(path: String, params: Any): IPromise[Any] = js.native
    def customDELETE(path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customDELETE(path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    
    def customGET(path: String): IPromise[Any] = js.native
    def customGET(path: String, params: Any): IPromise[Any] = js.native
    def customGET(path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customGET(path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    
    def customGETLIST(path: String): ICollectionPromise[Any] = js.native
    def customGETLIST(path: String, params: Any): ICollectionPromise[Any] = js.native
    def customGETLIST(path: String, params: Any, headers: Any): ICollectionPromise[Any] = js.native
    def customGETLIST(path: String, params: Unit, headers: Any): ICollectionPromise[Any] = js.native
    
    def customOperation(operation: String, path: String): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Any, headers: Any, elem: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Any, headers: Unit, elem: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: Any, elem: Any): IPromise[Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: Unit, elem: Any): IPromise[Any] = js.native
    
    def customPATCH(): IPromise[Any] = js.native
    def customPATCH(elem: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: String): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: String, params: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: Unit, params: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Any, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: String): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: String, params: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    
    def customPOST(): IPromise[Any] = js.native
    def customPOST(elem: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: String): IPromise[Any] = js.native
    def customPOST(elem: Any, path: String, params: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: Unit, params: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Any, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: String): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: String, params: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    
    def customPUT(): IPromise[Any] = js.native
    def customPUT(elem: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: String): IPromise[Any] = js.native
    def customPUT(elem: Any, path: String, params: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: Unit, params: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Any, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: String): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: String, params: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: String, params: Any, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: String, params: Unit, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: Any, headers: Any): IPromise[Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: Unit, headers: Any): IPromise[Any] = js.native
  }
  
  @js.native
  trait IElement
    extends StObject
       with IService {
    
    def get(): IPromise[Any] = js.native
    def get(queryParams: Any): IPromise[Any] = js.native
    def get(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def get(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def getList(): ICollectionPromise[Any] = js.native
    def getList(subElement: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Any, queryParams: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Any, queryParams: Any, headers: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Any, queryParams: Unit, headers: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Unit, queryParams: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Unit, queryParams: Any, headers: Any): ICollectionPromise[Any] = js.native
    def getList(subElement: Unit, queryParams: Unit, headers: Any): ICollectionPromise[Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Any, queryParams: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Any, queryParams: Any, headers: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Any, queryParams: Unit, headers: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: Any, headers: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: Unit, headers: Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    @JSName("get")
    def get_T[T](): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: Any, headers: Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: Unit, headers: Any): IPromise[T] = js.native
    
    def head(): IPromise[Any] = js.native
    def head(queryParams: Any): IPromise[Any] = js.native
    def head(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def head(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    def options(): IPromise[Any] = js.native
    def options(queryParams: Any): IPromise[Any] = js.native
    def options(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def options(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def patch(): IPromise[Any] = js.native
    def patch(queryParams: Any): IPromise[Any] = js.native
    def patch(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def patch(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def plain(): Any = js.native
    @JSName("plain")
    def plain_T_T[T](): T = js.native
    
    def post(subElement: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Any, queryParams: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Any, queryParams: Any, headers: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Any, queryParams: Unit, headers: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Unit, queryParams: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Unit, queryParams: Any, headers: Any): IPromise[Any] = js.native
    def post(subElement: Any, elementToPost: Unit, queryParams: Unit, headers: Any): IPromise[Any] = js.native
    @JSName("post")
    def post_T[T](subElement: Any, elementToPost: T): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](subElement: Any, elementToPost: T, queryParams: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](subElement: Any, elementToPost: T, queryParams: Any, headers: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](subElement: Any, elementToPost: T, queryParams: Unit, headers: Any): IPromise[T] = js.native
    
    def put(): IPromise[Any] = js.native
    def put(queryParams: Any): IPromise[Any] = js.native
    def put(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def put(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def remove(): IPromise[Any] = js.native
    def remove(queryParams: Any): IPromise[Any] = js.native
    def remove(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def remove(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    var reqParams: js.UndefOr[Any] = js.native
    
    var route: js.UndefOr[String] = js.native
    
    def save(): IPromise[Any] = js.native
    def save(queryParams: Any): IPromise[Any] = js.native
    def save(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def save(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def trace(): IPromise[Any] = js.native
    def trace(queryParams: Any): IPromise[Any] = js.native
    def trace(queryParams: Any, headers: Any): IPromise[Any] = js.native
    def trace(queryParams: Unit, headers: Any): IPromise[Any] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): IElement = js.native
  }
  
  @js.native
  trait IPromise[T]
    extends StObject
       with typings.angular.mod.IPromise[T] {
    
    @JSName("$object")
    var $object: T = js.native
    
    def call(methodName: String): IPromise[T] = js.native
    def call(methodName: String, params: Any): IPromise[T] = js.native
    
    def get(fieldName: String): IPromise[T] = js.native
  }
  
  @js.native
  trait IProvider extends StObject {
    
    def addElementTransformer(route: String, isCollection: Boolean, transformer: js.Function): IProvider = js.native
    def addElementTransformer(route: String, transformer: js.Function): IProvider = js.native
    
    def addFullRequestInterceptor(
      requestInterceptor: js.Function7[
          /* element */ Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* headers */ Any, 
          /* params */ Any, 
          /* httpConfig */ IRequestShortcutConfig, 
          Element
        ]
    ): IProvider = js.native
    
    def addRequestInterceptor(
      requestInterceptor: js.Function4[/* element */ Any, /* operation */ String, /* what */ String, /* url */ String, Any]
    ): IProvider = js.native
    
    def addResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[Any], 
          Any
        ]
    ): IProvider = js.native
    
    def extendCollection(route: String, extender: js.Function1[/* collection */ ICollection, Any]): IProvider = js.native
    
    def extendModel(route: String, extender: js.Function1[/* model */ IElement, Any]): IProvider = js.native
    
    def setBaseUrl(baseUrl: String): IProvider = js.native
    
    def setDefaultHeaders(headers: Any): IProvider = js.native
    
    def setDefaultHttpFields(httpFields: Any): IProvider = js.native
    
    def setDefaultRequestParams(method: String, params: Any): IProvider = js.native
    def setDefaultRequestParams(methods: js.Array[String], params: Any): IProvider = js.native
    def setDefaultRequestParams(params: Any): IProvider = js.native
    
    def setEncodeIds(encode: Boolean): IProvider = js.native
    
    def setErrorInterceptor(
      errorInterceptor: js.Function3[
          /* response */ IResponse, 
          /* deferred */ IDeferred[Any], 
          /* responseHandler */ js.Function1[/* response */ IResponse, Any], 
          Any
        ]
    ): IProvider = js.native
    
    def setExtraFields(fields: js.Array[String]): IProvider = js.native
    
    def setFullRequestInterceptor(
      fullRequestInterceptor: js.Function7[
          /* element */ Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* headers */ Any, 
          /* params */ Any, 
          /* httpConfig */ IRequestShortcutConfig, 
          Element
        ]
    ): IProvider = js.native
    
    def setFullResponse(fullResponse: Boolean): IProvider = js.native
    
    def setJsonp(jsonp: Boolean): IProvider = js.native
    
    def setMethodOverriders(overriders: js.Array[String]): IProvider = js.native
    
    def setOnElemRestangularized(
      callback: js.Function4[
          /* elem */ Any, 
          /* isCollection */ Boolean, 
          /* what */ String, 
          /* restangular */ IService, 
          Any
        ]
    ): IProvider = js.native
    
    def setParentless(parentless: Boolean, routes: js.Array[String]): IProvider = js.native
    def setParentless(value: Any): IProvider = js.native
    
    def setPlainByDefault(isPlain: Boolean): IProvider = js.native
    
    def setRequestInterceptor(
      requestInterceptor: js.Function4[/* element */ Any, /* operation */ String, /* what */ String, /* url */ String, Any]
    ): IProvider = js.native
    
    def setRequestSuffix(suffix: String): IProvider = js.native
    
    def setResponseExtractor(
      responseInterceptor: js.Function6[
          /* data */ Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[Any], 
          Any
        ]
    ): IProvider = js.native
    
    def setResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[Any], 
          Any
        ]
    ): IProvider = js.native
    
    def setRestangularFields(fields: StringDictionary[String]): IProvider = js.native
    
    def setSelfLinkAbsoluteUrl(value: Boolean): IProvider = js.native
    
    def setTransformOnlyServerElements(active: Boolean): IProvider = js.native
    
    def setUseCannonicalId(useCannonicalId: Boolean): IProvider = js.native
  }
  
  trait IResponse extends StObject {
    
    var config: Method
    
    var data: Any
    
    def headers(name: String): String
    
    var status: Double
  }
  object IResponse {
    
    inline def apply(config: Method, data: Any, headers: String => String, status: Double): IResponse = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = js.Any.fromFunction1(headers), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Method): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: String => String): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScopedService
    extends StObject
       with IService {
    
    def getList(): ICollectionPromise[Any] = js.native
    def getList(queryParams: Any): ICollectionPromise[Any] = js.native
    def getList(queryParams: Any, headers: Any): ICollectionPromise[Any] = js.native
    def getList(queryParams: Unit, headers: Any): ICollectionPromise[Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Any, headers: Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Unit, headers: Any): ICollectionPromise[T] = js.native
    
    def one(id: Double): IElement = js.native
    
    def post(elementToPost: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Any, headers: Any): IPromise[Any] = js.native
    def post(elementToPost: Any, queryParams: Unit, headers: Any): IPromise[Any] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Any, headers: Any): IPromise[T] = js.native
    @JSName("post")
    def post_T[T](elementToPost: T, queryParams: Unit, headers: Any): IPromise[T] = js.native
  }
  
  @js.native
  trait IService
    extends StObject
       with ICustom
       with IProvider {
    
    def all(route: String): ICollection = js.native
    
    def allUrl(route: String, url: String): ICollection = js.native
    
    def copy(fromElement: Any): IElement = js.native
    
    def one(route: String): IElement = js.native
    def one(route: String, id: String): IElement = js.native
    def one(route: String, id: Double): IElement = js.native
    
    def oneUrl(route: String, url: String): IElement = js.native
    
    def restangularizeCollection(parent: Any, element: Any, route: String): ICollection = js.native
    
    def restangularizeElement(parent: Any, element: Any, route: String): IElement = js.native
    def restangularizeElement(parent: Any, element: Any, route: String, collection: Any): IElement = js.native
    def restangularizeElement(parent: Any, element: Any, route: String, collection: Any, reqParams: Any): IElement = js.native
    def restangularizeElement(parent: Any, element: Any, route: String, collection: Unit, reqParams: Any): IElement = js.native
    
    def service(route: String): IScopedService = js.native
    def service(route: String, parent: Any): IScopedService = js.native
    
    def stripRestangular(element: Any): Any = js.native
    
    def withConfig(configurer: js.Function1[/* RestangularProvider */ IProvider, Any]): IService = js.native
  }
}
