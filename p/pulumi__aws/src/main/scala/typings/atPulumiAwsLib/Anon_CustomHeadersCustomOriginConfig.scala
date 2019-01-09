package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeadersCustomOriginConfig extends js.Object {
  var customHeaders: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var customOriginConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_HttpPortHttpsPort]] = js.undefined
  var domainName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var originId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var originPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var s3OriginConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_OriginAccessIdentityInput]] = js.undefined
}

