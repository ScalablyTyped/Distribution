package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStatement extends js.Object {
  var Action: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Condition: js.UndefOr[Conditions] = js.undefined
  var Effect: atPulumiAwsLib.atPulumiAwsLibStrings.Allow | atPulumiAwsLib.atPulumiAwsLibStrings.Deny
  var NotAction: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var NotPrincipal: js.UndefOr[Principal] = js.undefined
  var NotResource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Principal: js.UndefOr[Principal] = js.undefined
  var Resource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Sid: js.UndefOr[java.lang.String] = js.undefined
}

