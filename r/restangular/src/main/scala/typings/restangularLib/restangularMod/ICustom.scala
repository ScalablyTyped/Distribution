package typings
package restangularLib.restangularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustom extends js.Object {
  def addRestangularMethod(name: java.lang.String, operation: java.lang.String): IPromise[_] = js.native
  def addRestangularMethod(name: java.lang.String, operation: java.lang.String, path: java.lang.String): IPromise[_] = js.native
  def addRestangularMethod(name: java.lang.String, operation: java.lang.String, path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def addRestangularMethod(
    name: java.lang.String,
    operation: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    headers: js.Any
  ): IPromise[_] = js.native
  def addRestangularMethod(
    name: java.lang.String,
    operation: java.lang.String,
    path: java.lang.String,
    params: js.Any,
    headers: js.Any,
    elem: js.Any
  ): IPromise[_] = js.native
  def customDELETE(path: java.lang.String): IPromise[_] = js.native
  def customDELETE(path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customDELETE(path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customGET(path: java.lang.String): IPromise[_] = js.native
  def customGET(path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customGET(path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customGETLIST(path: java.lang.String): ICollectionPromise[_] = js.native
  def customGETLIST(path: java.lang.String, params: js.Any): ICollectionPromise[_] = js.native
  def customGETLIST(path: java.lang.String, params: js.Any, headers: js.Any): ICollectionPromise[_] = js.native
  def customOperation(operation: java.lang.String, path: java.lang.String): IPromise[_] = js.native
  def customOperation(operation: java.lang.String, path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customOperation(operation: java.lang.String, path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customOperation(operation: java.lang.String, path: java.lang.String, params: js.Any, headers: js.Any, elem: js.Any): IPromise[_] = js.native
  def customPATCH(): IPromise[_] = js.native
  def customPATCH(elem: js.Any): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: java.lang.String): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customPATCH(elem: js.Any, path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customPOST(): IPromise[_] = js.native
  def customPOST(elem: js.Any): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: java.lang.String): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customPOST(elem: js.Any, path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
  def customPUT(): IPromise[_] = js.native
  def customPUT(elem: js.Any): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: java.lang.String): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: java.lang.String, params: js.Any): IPromise[_] = js.native
  def customPUT(elem: js.Any, path: java.lang.String, params: js.Any, headers: js.Any): IPromise[_] = js.native
}

