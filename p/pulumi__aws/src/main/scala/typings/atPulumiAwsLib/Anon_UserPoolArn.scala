package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserPoolArn extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var onUnauthenticatedRequest: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionCookieName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sessionTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var userPoolArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userPoolClientId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userPoolDomain: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

