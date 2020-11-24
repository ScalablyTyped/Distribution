package typings.qlikVisualizationextensions

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirectiveFactory
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQVAngular extends js.Object {
  
  @JSName("$injector")
  var $injector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IInjectorService */ js.Any = js.native
  
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
