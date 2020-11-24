package typings.restangular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
