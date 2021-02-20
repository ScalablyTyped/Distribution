package typings.restangular

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IDeferred
import typings.angular.mod.IRequestShortcutConfig
import typings.restangular.anon.Element
import typings.restangular.anon.Method
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait ICollection
    extends IService
       with Array[js.Any] {
    
    def getList(): ICollectionPromise[_] = js.native
    def getList(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[_] = js.native
    def getList(queryParams: js.Any): ICollectionPromise[_] = js.native
    def getList(queryParams: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    def head(): IPromise[_] = js.native
    def head(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def head(queryParams: js.Any): IPromise[_] = js.native
    def head(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def options(): IPromise[_] = js.native
    def options(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def options(queryParams: js.Any): IPromise[_] = js.native
    def options(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def patch(): IPromise[_] = js.native
    def patch(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def patch(queryParams: js.Any): IPromise[_] = js.native
    def patch(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def plain(): js.Any = js.native
    @JSName("plain")
    def plain_T_Array[T](): js.Array[T] = js.native
    
    def post(elementToPost: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    def post[T](elementToPost: T): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    
    def putElement(idx: js.Any, params: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def trace(): IPromise[_] = js.native
    def trace(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def trace(queryParams: js.Any): IPromise[_] = js.native
    def trace(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): ICollection = js.native
  }
  
  @js.native
  trait ICollectionPromise[T]
    extends typings.angular.mod.IPromise[js.Array[T]] {
    
    @JSName("$object")
    var $object: js.Array[T] = js.native
    
    def call(methodName: String): ICollectionPromise[T] = js.native
    def call(methodName: String, params: js.Any): ICollectionPromise[T] = js.native
    
    def get(fieldName: String): ICollectionPromise[T] = js.native
    
    def push(`object`: js.Any): ICollectionPromise[T] = js.native
  }
  
  @js.native
  trait ICustom extends StObject {
    
    def addRestangularMethod(name: String, operation: String): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.UndefOr[scala.Nothing],
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.Any,
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: js.UndefOr[scala.Nothing],
      params: js.Any,
      headers: js.UndefOr[scala.Nothing],
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: js.UndefOr[scala.Nothing],
      params: js.Any,
      headers: js.Any,
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: String): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: String,
      params: js.UndefOr[scala.Nothing],
      headers: js.UndefOr[scala.Nothing],
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: String,
      params: js.UndefOr[scala.Nothing],
      headers: js.Any,
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any): IPromise[_] = js.native
    def addRestangularMethod(
      name: String,
      operation: String,
      path: String,
      params: js.Any,
      headers: js.UndefOr[scala.Nothing],
      elem: js.Any
    ): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[_] = js.native
    
    def customDELETE(path: String): IPromise[_] = js.native
    def customDELETE(path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customDELETE(path: String, params: js.Any): IPromise[_] = js.native
    def customDELETE(path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def customGET(path: String): IPromise[_] = js.native
    def customGET(path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customGET(path: String, params: js.Any): IPromise[_] = js.native
    def customGET(path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def customGETLIST(path: String): ICollectionPromise[_] = js.native
    def customGETLIST(path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[_] = js.native
    def customGETLIST(path: String, params: js.Any): ICollectionPromise[_] = js.native
    def customGETLIST(path: String, params: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
    
    def customOperation(operation: String, path: String): IPromise[_] = js.native
    def customOperation(
      operation: String,
      path: String,
      params: js.UndefOr[scala.Nothing],
      headers: js.UndefOr[scala.Nothing],
      elem: js.Any
    ): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any, elem: js.Any): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.Any): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: js.UndefOr[scala.Nothing], elem: js.Any): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customOperation(operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[_] = js.native
    
    def customPATCH(): IPromise[_] = js.native
    def customPATCH(
      elem: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.Any
    ): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: String): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: String): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
    def customPATCH(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def customPOST(): IPromise[_] = js.native
    def customPOST(
      elem: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.Any
    ): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: String): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: String): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
    def customPOST(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def customPUT(): IPromise[_] = js.native
    def customPUT(
      elem: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      headers: js.Any
    ): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: String): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.UndefOr[scala.Nothing], path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: js.UndefOr[scala.Nothing], params: js.Any, headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: String): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: String, params: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
    def customPUT(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  }
  
  @js.native
  trait IElement extends IService {
    
    def get(): IPromise[_] = js.native
    def get(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def get(queryParams: js.Any): IPromise[_] = js.native
    def get(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def getList(): ICollectionPromise[_] = js.native
    def getList(subElement: js.UndefOr[scala.Nothing], queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.UndefOr[scala.Nothing], queryParams: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.UndefOr[scala.Nothing], queryParams: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.Any, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.Any, queryParams: js.Any): ICollectionPromise[_] = js.native
    def getList(subElement: js.Any, queryParams: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.UndefOr[scala.Nothing], queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.UndefOr[scala.Nothing], queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.UndefOr[scala.Nothing], queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](subElement: js.Any, queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    
    def getRequestedUrl(): String = js.native
    
    def getRestangularUrl(): String = js.native
    
    @JSName("get")
    def get_T[T](): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: js.Any): IPromise[T] = js.native
    @JSName("get")
    def get_T[T](queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    
    def head(): IPromise[_] = js.native
    def head(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def head(queryParams: js.Any): IPromise[_] = js.native
    def head(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    def options(): IPromise[_] = js.native
    def options(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def options(queryParams: js.Any): IPromise[_] = js.native
    def options(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def patch(): IPromise[_] = js.native
    def patch(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def patch(queryParams: js.Any): IPromise[_] = js.native
    def patch(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def plain(): js.Any = js.native
    @JSName("plain")
    def plain_T_T[T](): T = js.native
    
    def post(subElement: js.Any): IPromise[_] = js.native
    def post(
      subElement: js.Any,
      elementToPost: js.UndefOr[scala.Nothing],
      queryParams: js.UndefOr[scala.Nothing],
      headers: js.Any
    ): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.UndefOr[scala.Nothing], queryParams: js.Any): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.UndefOr[scala.Nothing], queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.Any): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: js.Any): IPromise[_] = js.native
    def post(subElement: js.Any, elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    def post[T](subElement: js.Any, elementToPost: T): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](subElement: js.Any, elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
    
    def put(): IPromise[_] = js.native
    def put(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def put(queryParams: js.Any): IPromise[_] = js.native
    def put(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def remove(): IPromise[_] = js.native
    def remove(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def remove(queryParams: js.Any): IPromise[_] = js.native
    def remove(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    var reqParams: js.UndefOr[js.Any] = js.native
    
    var route: js.UndefOr[String] = js.native
    
    def save(): IPromise[_] = js.native
    def save(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def save(queryParams: js.Any): IPromise[_] = js.native
    def save(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def trace(): IPromise[_] = js.native
    def trace(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def trace(queryParams: js.Any): IPromise[_] = js.native
    def trace(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    
    def withHttpConfig(httpConfig: IRequestShortcutConfig): IElement = js.native
  }
  
  @js.native
  trait IPromise[T]
    extends typings.angular.mod.IPromise[T] {
    
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
      requestInterceptor: js.Function4[/* element */ js.Any, /* operation */ String, /* what */ String, /* url */ String, _]
    ): IProvider = js.native
    
    def addResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[_], 
          _
        ]
    ): IProvider = js.native
    
    def extendCollection(route: String, extender: js.Function1[/* collection */ ICollection, _]): IProvider = js.native
    
    def extendModel(route: String, extender: js.Function1[/* model */ IElement, _]): IProvider = js.native
    
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
          /* deferred */ IDeferred[_], 
          /* responseHandler */ js.Function1[/* response */ IResponse, _], 
          _
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
          _
        ]
    ): IProvider = js.native
    
    def setParentless(parentless: Boolean, routes: js.Array[String]): IProvider = js.native
    def setParentless(value: js.Any): IProvider = js.native
    
    def setPlainByDefault(isPlain: Boolean): IProvider = js.native
    
    def setRequestInterceptor(
      requestInterceptor: js.Function4[/* element */ js.Any, /* operation */ String, /* what */ String, /* url */ String, _]
    ): IProvider = js.native
    
    def setRequestSuffix(suffix: String): IProvider = js.native
    
    def setResponseExtractor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[_], 
          _
        ]
    ): IProvider = js.native
    
    def setResponseInterceptor(
      responseInterceptor: js.Function6[
          /* data */ js.Any, 
          /* operation */ String, 
          /* what */ String, 
          /* url */ String, 
          /* response */ IResponse, 
          /* deferred */ IDeferred[_], 
          _
        ]
    ): IProvider = js.native
    
    def setRestangularFields(fields: StringDictionary[String]): IProvider = js.native
    
    def setSelfLinkAbsoluteUrl(value: Boolean): IProvider = js.native
    
    def setTransformOnlyServerElements(active: Boolean): IProvider = js.native
    
    def setUseCannonicalId(useCannonicalId: Boolean): IProvider = js.native
  }
  
  @js.native
  trait IResponse extends StObject {
    
    var config: Method = js.native
    
    var data: js.Any = js.native
    
    def headers(name: String): String = js.native
    
    var status: Double = js.native
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
  trait IScopedService extends IService {
    
    def getList(): ICollectionPromise[_] = js.native
    def getList(queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[_] = js.native
    def getList(queryParams: js.Any): ICollectionPromise[_] = js.native
    def getList(queryParams: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
    @JSName("getList")
    def getList_T[T](): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.UndefOr[scala.Nothing], headers: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any): ICollectionPromise[T] = js.native
    @JSName("getList")
    def getList_T[T](queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
    
    def one(id: Double): IElement = js.native
    
    def post(elementToPost: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any): IPromise[_] = js.native
    def post(elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
    def post[T](elementToPost: T): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.UndefOr[scala.Nothing], headers: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
    def post[T](elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
  }
  
  @js.native
  trait IService
    extends ICustom
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
    def restangularizeElement(
      parent: js.Any,
      element: js.Any,
      route: String,
      collection: js.UndefOr[scala.Nothing],
      reqParams: js.Any
    ): IElement = js.native
    def restangularizeElement(parent: js.Any, element: js.Any, route: String, collection: js.Any): IElement = js.native
    def restangularizeElement(parent: js.Any, element: js.Any, route: String, collection: js.Any, reqParams: js.Any): IElement = js.native
    
    def service(route: String): IScopedService = js.native
    def service(route: String, parent: js.Any): IScopedService = js.native
    
    def stripRestangular(element: js.Any): js.Any = js.native
    
    def withConfig(configurer: js.Function1[/* RestangularProvider */ IProvider, _]): IService = js.native
  }
}
