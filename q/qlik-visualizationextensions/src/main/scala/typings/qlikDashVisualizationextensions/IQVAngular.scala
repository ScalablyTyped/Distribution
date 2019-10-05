package typings.qlikDashVisualizationextensions

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IController
import typings.angular.angularMod.IDirectiveFactory
import typings.angular.angularMod.IScope
import typings.angular.angularMod.Injectable
import typings.angular.angularMod.auto.IInjectorService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQVAngular extends js.Object {
  @JSName("$injector")
  var $injector: IInjectorService = js.native
  /**
    * Register a new directive with the compiler.
    *
    * @param name Name of the directive in camel-case (i.e. ngBind which will match as ng-bind)
    * @param directiveFactory An injectable directive factory function.
    */
  def directive(
    name: String,
    directiveFactory: Injectable[IDirectiveFactory[IScope, JQLite, IAttributes, IController]]
  ): Unit = js.native
  def directive(
    `object`: StringDictionary[Injectable[IDirectiveFactory[IScope, JQLite, IAttributes, IController]]]
  ): Unit = js.native
  def filter(name: String, filterFactoryFunction: Injectable[js.Function]): Unit = js.native
  def filter(`object`: StringDictionary[Injectable[js.Function]]): Unit = js.native
  /**
    * Register a service constructor, which will be invoked with new to create
    * the service instance. This is short for registering a service where its
    * provider's $get property is a factory function that returns an instance
    * instantiated by the injector from the service constructor function.
    * @param name The name of the instance.
    * @param serviceConstructor An injectable class (constructor function) that will be instantiated.
    * @return Returns the constructed singleton of the service class/function.
    */
  def service[T](name: String, serviceConstructor: Injectable[js.Function]): T = js.native
  def service[T](`object`: StringDictionary[Injectable[js.Function]]): T = js.native
}

