package typings.restangular.mod

import typings.angular.mod.IRequestShortcutConfig
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection
  extends IService
     with Array[js.Any] {
  def getList(): ICollectionPromise[_] = js.native
  def getList(queryParams: js.Any): ICollectionPromise[_] = js.native
  def getList(queryParams: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
  @JSName("getList")
  def getList_T[T](): ICollectionPromise[T] = js.native
  @JSName("getList")
  def getList_T[T](queryParams: js.Any): ICollectionPromise[T] = js.native
  @JSName("getList")
  def getList_T[T](queryParams: js.Any, headers: js.Any): ICollectionPromise[T] = js.native
  def getRequestedUrl(): String = js.native
  def getRestangularUrl(): String = js.native
  def head(): IPromise[_] = js.native
  def head(queryParams: js.Any): IPromise[_] = js.native
  def head(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
  def options(): IPromise[_] = js.native
  def options(queryParams: js.Any): IPromise[_] = js.native
  def options(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
  def patch(): IPromise[_] = js.native
  def patch(queryParams: js.Any): IPromise[_] = js.native
  def patch(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
  def plain(): js.Any = js.native
  @JSName("plain")
  def plain_T_Array[T](): js.Array[T] = js.native
  def post(elementToPost: js.Any): IPromise[_] = js.native
  def post(elementToPost: js.Any, queryParams: js.Any): IPromise[_] = js.native
  def post(elementToPost: js.Any, queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
  def post[T](elementToPost: T): IPromise[T] = js.native
  def post[T](elementToPost: T, queryParams: js.Any): IPromise[T] = js.native
  def post[T](elementToPost: T, queryParams: js.Any, headers: js.Any): IPromise[T] = js.native
  def putElement(idx: js.Any, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def trace(): IPromise[_] = js.native
  def trace(queryParams: js.Any): IPromise[_] = js.native
  def trace(queryParams: js.Any, headers: js.Any): IPromise[_] = js.native
  def withHttpConfig(httpConfig: IRequestShortcutConfig): ICollection = js.native
}

