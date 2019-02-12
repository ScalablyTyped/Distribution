package typings
package atPulumiAwsLib.ramResourceShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShareArgs extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the resource share.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource share.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

