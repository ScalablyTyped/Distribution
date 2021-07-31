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
       with Array[js.Any] {
    
    def getList(): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: js.Any, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: Unit, headers: js.Any): ICollectionPromise[js.Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Unit, headers: js.Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    def head(): IPromise[js.Any] = js.native
    def head(queryParams: js.Any): IPromise[js.Any] = js.native
    def head(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def head(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def options(): IPromise[js.Any] = js.native
    def options(queryParams: js.Any): IPromise[js.Any] = js.native
    def options(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def options(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def patch(): IPromise[js.Any] = js.native
    def patch(queryParams: js.Any): IPromise[js.Any] = js.native
    def patch(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def patch(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def plain(): js.Any = js.native
    @JSName("plain")
    def plain_T_Array[T](): js.Array[T] = js.native
    
    def post(elementToPost: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def post[T](elementToPost: T): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: Unit, headers: js.Any): IPromise[T] = js.native
    
    def putElement(idx: js.Any, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    
    def trace(): IPromise[js.Any] = js.native
    def trace(queryParams: js.Any): IPromise[js.Any] = js.native
    def trace(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def trace(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): ICollection = js.native
  }
  
  @js.native
  trait ICollectionPromise[T]
    extends StObject
       with typings.angular.mod.IPromise[js.Array[T]] {
    
    @JSName("$object")
    var $object: js.Array[T] = js.native
    
    def call(methodName: String): ICollectionPromise[T] = js.native
    def call(methodName: String, params: js.Any): ICollectionPromise[T] = js.native
    
    def get(fieldName: String): ICollectionPromise[T] = js.native
    
    def push(`object`: js.Any): ICollectionPromise[T] = js.native
  }
  
  @js.native
  trait ICustom extends StObject {
    
    def addRestangularMethod(name: String, operation: String): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: Unit, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: js.Any, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: js.Any, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def addRestangularMethod(name: String, operation: String, path: Unit, params: Unit, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    
    def customDELETE(path: String): IPromise[js.Any] = js.native
    def customDELETE(path: String, params: js.Any): IPromise[js.Any] = js.native
    def customDELETE(path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customDELETE(path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def customGET(path: String): IPromise[js.Any] = js.native
    def customGET(path: String, params: js.Any): IPromise[js.Any] = js.native
    def customGET(path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customGET(path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def customGETLIST(path: String): ICollectionPromise[js.Any] = js.native
    def customGETLIST(path: String, params: js.Any): ICollectionPromise[js.Any] = js.native
    def customGETLIST(path: String, params: js.Any, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def customGETLIST(path: String, params: Unit, headers: js.Any): ICollectionPromise[js.Any] = js.native
    
    def customOperation(operation: String, path: String): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: js.Any, elem: js.Any): IPromise[js.Any] = js.native
    def customOperation(operation: String, path: String, params: Unit, headers: Unit, elem: js.Any): IPromise[js.Any] = js.native
    
    def customPATCH(): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: String): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: js.Any, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: String): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPATCH(elem: Unit, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def customPOST(): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: String): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: js.Any, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: String): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPOST(elem: Unit, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def customPUT(): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: String): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: js.Any, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: String): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: String, params: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: String, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: String, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def customPUT(elem: Unit, path: Unit, params: Unit, headers: js.Any): IPromise[js.Any] = js.native
  }
  
  @js.native
  trait IElement
    extends StObject
       with IService {
    
    def get(): IPromise[js.Any] = js.native
    def get(queryParams: js.Any): IPromise[js.Any] = js.native
    def get(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def get(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def getList(): ICollectionPromise[js.Any] = js.native
    def getList(subElement: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: js.Any, queryParams: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: js.Any, queryParams: js.Any, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: js.Any, queryParams: Unit, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: Unit, queryParams: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: Unit, queryParams: js.Any, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(subElement: Unit, queryParams: Unit, headers: js.Any): ICollectionPromise[js.Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: Unit, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: Unit, queryParams: Unit, headers: js.Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    @JSName("get")
    def get_T[T](): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: js.Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: Unit, headers: js.Any): IPromise[T] = js.native
    
    def head(): IPromise[js.Any] = js.native
    def head(queryParams: js.Any): IPromise[js.Any] = js.native
    def head(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def head(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    def options(): IPromise[js.Any] = js.native
    def options(queryParams: js.Any): IPromise[js.Any] = js.native
    def options(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def options(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def patch(): IPromise[js.Any] = js.native
    def patch(queryParams: js.Any): IPromise[js.Any] = js.native
    def patch(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def patch(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def plain(): js.Any = js.native
    @JSName("plain")
    def plain_T_T[T](): T = js.native
    
    def post(subElement: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: Unit, queryParams: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: Unit, queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def post(subElement: js.Any, elementToPost: Unit, queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def post[T](subElement: js.Any, elementToPost: T): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: Unit, headers: js.Any): IPromise[T] = js.native
    
    def put(): IPromise[js.Any] = js.native
    def put(queryParams: js.Any): IPromise[js.Any] = js.native
    def put(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def put(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def remove(): IPromise[js.Any] = js.native
    def remove(queryParams: js.Any): IPromise[js.Any] = js.native
    def remove(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def remove(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    var reqParams: js.UndefOr[js.Any] = js.native
    
    var route: js.UndefOr[String] = js.native
    
    def save(): IPromise[js.Any] = js.native
    def save(queryParams: js.Any): IPromise[js.Any] = js.native
    def save(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def save(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def trace(): IPromise[js.Any] = js.native
    def trace(queryParams: js.Any): IPromise[js.Any] = js.native
    def trace(queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def trace(queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): IElement = js.native
  }
  
  @js.native
  trait IPromise[T]
    extends StObject
       with typings.angular.mod.IPromise[T] {
    
    @JSName("$object")
    var $object: T = js.native
    
    def call(methodName: String): IPromise[T] = js.native
    def call(methodName: String, params: js.Any): IPromise[T] = js.native
    
    def get(fieldName: String): IPromise[T] = js.native
  }
  
  @js.native
  trait IProvider extends StObject {
    
    def addElementTransformer(route: String, isCollection: Boolean, transformer: js.Function): IProvider = js.native
    def addElementTransformer(route: String, transformer: js.Function): IProvider = js.native
    
    def addFullRequestInterceptor(
      requestInterceptor: js.Function7[
          /* element */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* headers */ js.Any, 
          /* params */ js.Any, 
          /* httpConfig */ IRequestShortcutConfig, 
          Element
        ]
    ): IProvider = js.native
    
    def addRequestInterceptor(
      requestInterceptor: js.Function4[
          /* element */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          js.Any
        ]
    ): IProvider = js.native
    
    def addResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[js.Any], 
          js.Any
        ]
    ): IProvider = js.native
    
    def extendCollection(route: String, extender: js.Function1[/* collection */ ICollection, js.Any]): IProvider = js.native
    
    def extendModel(route: String, extender: js.Function1[/* model */ IElement, js.Any]): IProvider = js.native
    
    def setBaseUrl(baseUrl: String): IProvider = js.native
    
    def setDefaultHeaders(headers: js.Any): IProvider = js.native
    
    def setDefaultHttpFields(httpFields: js.Any): IProvider = js.native
    
    def setDefaultRequestParams(method: String, params: js.Any): IProvider = js.native
    def setDefaultRequestParams(methods: js.Array[String], params: js.Any): IProvider = js.native
    def setDefaultRequestParams(params: js.Any): IProvider = js.native
    
    def setEncodeIds(encode: Boolean): IProvider = js.native
    
    def setErrorInterceptor(
      errorInterceptor: js.Function3[
          /* response */ IResponse, 
          /* deferred */ IDeferred[js.Any], 
          /* responseHandler */ js.Function1[/* response */ IResponse, js.Any], 
          js.Any
        ]
    ): IProvider = js.native
    
    def setExtraFields(fields: js.Array[String]): IProvider = js.native
    
    def setFullRequestInterceptor(
      fullRequestInterceptor: js.Function7[
          /* element */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* headers */ js.Any, 
          /* params */ js.Any, 
          /* httpConfig */ IRequestShortcutConfig, 
          Element
        ]
    ): IProvider = js.native
    
    def setFullResponse(fullResponse: Boolean): IProvider = js.native
    
    def setJsonp(jsonp: Boolean): IProvider = js.native
    
    def setMethodOverriders(overriders: js.Array[String]): IProvider = js.native
    
    def setOnElemRestangularized(
      callback: js.Function4[
          /* elem */ js.Any, 
          /* isCollection */ Boolean, 
          /* what */ String, 
          /* restangular */ IService, 
          js.Any
        ]
    ): IProvider = js.native
    
    def setParentless(parentless: Boolean, routes: js.Array[String]): IProvider = js.native
    def setParentless(value: js.Any): IProvider = js.native
    
    def setPlainByDefault(isPlain: Boolean): IProvider = js.native
    
    def setRequestInterceptor(
      requestInterceptor: js.Function4[
          /* element */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          js.Any
        ]
    ): IProvider = js.native
    
    def setRequestSuffix(suffix: String): IProvider = js.native
    
    def setResponseExtractor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[js.Any], 
          js.Any
        ]
    ): IProvider = js.native
    
    def setResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[js.Any], 
          js.Any
        ]
    ): IProvider = js.native
    
    def setRestangularFields(fields: StringDictionary[String]): IProvider = js.native
    
    def setSelfLinkAbsoluteUrl(value: Boolean): IProvider = js.native
    
    def setTransformOnlyServerElements(active: Boolean): IProvider = js.native
    
    def setUseCannonicalId(useCannonicalId: Boolean): IProvider = js.native
  }
  
  trait IResponse extends StObject {
    
    var config: Method
    
    var data: js.Any
    
    def headers(name: String): String
    
    var status: Double
  }
  object IResponse {
    
    @scala.inline
    def apply(config: Method, data: js.Any, headers: String => String, status: Double): IResponse = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = js.Any.fromFunction1(headers), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Method): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: String => String): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScopedService
    extends StObject
       with IService {
    
    def getList(): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: js.Any, headers: js.Any): ICollectionPromise[js.Any] = js.native
    def getList(queryParams: Unit, headers: js.Any): ICollectionPromise[js.Any] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: Unit, headers: js.Any): ICollectionPromise[T] = js.native
    
    def one(id: Double): IElement = js.native
    
    def post(elementToPost: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[js.Any] = js.native
    def post(elementToPost: js.Any, queryParams: Unit, headers: js.Any): IPromise[js.Any] = js.native
    def post[T](elementToPost: T): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: Unit, headers: js.Any): IPromise[T] = js.native
  }
  
  @js.native
  trait IService
    extends StObject
       with ICustom
       with IProvider {
    
    def all(route: String): ICollection = js.native
    
    def allUrl(route: String, url: String): ICollection = js.native
    
    def copy(fromElement: js.Any): IElement = js.native
    
    def one(route: String): IElement = js.native
    def one(route: String, id: String): IElement = js.native
    def one(route: String, id: Double): IElement = js.native
    
    def oneUrl(route: String, url: String): IElement = js.native
    
    def restangularizeCollection(parent: js.Any, element: js.Any, route: String): ICollection = js.native
    
    def restangularizeElement(parent: js.Any, element: js.Any, route: String): IElement = js.native
    def restangularizeElement(parent: js.Any, element: js.Any, route: String, collection: js.Any): IElement = js.native
    def restangularizeElement(parent: js.Any, element: js.Any, route: String, collection: js.Any, reqParams: js.Any): IElement = js.native
    def restangularizeElement(parent: js.Any, element: js.Any, route: String, collection: Unit, reqParams: js.Any): IElement = js.native
    
    def service(route: String): IScopedService = js.native
    def service(route: String, parent: js.Any): IScopedService = js.native
    
    def stripRestangular(element: js.Any): js.Any = js.native
    
    def withConfig(configurer: js.Function1[/* RestangularProvider */ IProvider, js.Any]): IService = js.native
  }
}
