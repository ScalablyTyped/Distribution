package typings.restangular.mod

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
