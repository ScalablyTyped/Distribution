package typings.restangular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

