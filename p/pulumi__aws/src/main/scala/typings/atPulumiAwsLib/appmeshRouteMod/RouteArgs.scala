package typings
package atPulumiAwsLib.appmeshRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the route.
    */
  val meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to use for the route.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The route specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HttpRouteAnonActionMatch]
  val virtualRouterName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

