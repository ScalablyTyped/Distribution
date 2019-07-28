package typings.restangular.restangularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustom extends js.Object {
  def addRestangularMethod(name: String, operation: String): IPromise[_] = js.native
  def addRestangularMethod(name: String, operation: String, path: String): IPromise[_] = js.native
  def addRestangularMethod(name: String, operation: String, path: String, params: js.Any): IPromise[_] = js.native
  def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def addRestangularMethod(name: String, operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[_] = js.native
  def customDELETE(path: String): IPromise[_] = js.native
  def customDELETE(path: String, params: js.Any): IPromise[_] = js.native
  def customDELETE(path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customGET(path: String): IPromise[_] = js.native
  def customGET(path: String, params: js.Any): IPromise[_] = js.native
  def customGET(path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customGETLIST(path: String): ICollectionPromise[_] = js.native
  def customGETLIST(path: String, params: js.Any): ICollectionPromise[_] = js.native
  def customGETLIST(path: String, params: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
  def customOperation(operation: String, path: String): IPromise[_] = js.native
  def customOperation(operation: String, path: String, params: js.Any): IPromise[_] = js.native
  def customOperation(operation: String, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customOperation(operation: String, path: String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[_] = js.native
  def customPATCH(): IPromise[_] = js.native
  def customPATCH(elem: js.Any): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: String): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customPOST(): IPromise[_] = js.native
  def customPOST(elem: js.Any): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: String): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customPUT(): IPromise[_] = js.native
  def customPUT(elem: js.Any): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: String): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: String, params: js.Any): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: String, params: js.Any, headers: js.Any): IPromise[_] = js.native
}

