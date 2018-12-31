package typings
package qlikDashVisualizationextensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQVAngular extends js.Object {
  @JSName("$injector")
  var $injector: angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
  /**
    * Register a new directive with the compiler.
    *
    * @param name Name of the directive in camel-case (i.e. ngBind which will match as ng-bind)
    * @param directiveFactory An injectable directive factory function.
    */
  def directive(
    name: java.lang.String,
    directiveFactory: angularLib.angularMod.angularNs.Injectable[
      angularLib.angularMod.angularNs.IDirectiveFactory[
        angularLib.angularMod.angularNs.IScope, 
        angularLib.JQLite, 
        angularLib.angularMod.angularNs.IAttributes, 
        angularLib.angularMod.angularNs.IController
      ]
    ]
  ): scala.Unit = js.native
  def directive(
    `object`: org.scalablytyped.runtime.StringDictionary[
      angularLib.angularMod.angularNs.Injectable[
        angularLib.angularMod.angularNs.IDirectiveFactory[
          angularLib.angularMod.angularNs.IScope, 
          angularLib.JQLite, 
          angularLib.angularMod.angularNs.IAttributes, 
          angularLib.angularMod.angularNs.IController
        ]
      ]
    ]
  ): scala.Unit = js.native
  def filter(
    name: java.lang.String,
    filterFactoryFunction: angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function]
  ): scala.Unit = js.native
  def filter(
    `object`: org.scalablytyped.runtime.StringDictionary[
      angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function]
    ]
  ): scala.Unit = js.native
  /**
    * Register a service constructor, which will be invoked with new to create
    * the service instance. This is short for registering a service where its
    * provider's $get property is a factory function that returns an instance
    * instantiated by the injector from the service constructor function.
    * @param name The name of the instance.
    * @param serviceConstructor An injectable class (constructor function) that will be instantiated.
    * @return Returns the constructed singleton of the service class/function.
    */
  def service[T](
    name: java.lang.String,
    serviceConstructor: angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function]
  ): T = js.native
  def service[T](
    `object`: org.scalablytyped.runtime.StringDictionary[
      angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function]
    ]
  ): T = js.native
}

