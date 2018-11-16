package typings
package restangularLib.restangularMod.restangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IService
  extends ICustom
     with IProvider {
  def all(route: java.lang.String): ICollection = js.native
  def allUrl(route: java.lang.String, url: java.lang.String): ICollection = js.native
  def copy(fromElement: js.Any): IElement = js.native
  def one(route: java.lang.String): IElement = js.native
  def one(route: java.lang.String, id: java.lang.String): IElement = js.native
  def one(route: java.lang.String, id: scala.Double): IElement = js.native
  def oneUrl(route: java.lang.String, url: java.lang.String): IElement = js.native
  def restangularizeCollection(parent: js.Any, element: js.Any, route: java.lang.String): ICollection = js.native
  def restangularizeElement(parent: js.Any, element: js.Any, route: java.lang.String): IElement = js.native
  def restangularizeElement(parent: js.Any, element: js.Any, route: java.lang.String, collection: js.Any): IElement = js.native
  def restangularizeElement(parent: js.Any, element: js.Any, route: java.lang.String, collection: js.Any, reqParams: js.Any): IElement = js.native
  def service(route: java.lang.String): IScopedService = js.native
  def service(route: java.lang.String, parent: js.Any): IScopedService = js.native
  def stripRestangular(element: js.Any): js.Any = js.native
  def withConfig(configurer: js.Function1[/* RestangularProvider */ IProvider, _]): IService = js.native
}

