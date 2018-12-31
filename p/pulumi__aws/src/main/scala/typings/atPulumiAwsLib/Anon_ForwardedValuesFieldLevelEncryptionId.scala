package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedValuesFieldLevelEncryptionId extends js.Object {
  var allowedMethods: js.Array[java.lang.String]
  var cachedMethods: js.Array[java.lang.String]
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var defaultTtl: js.UndefOr[scala.Double] = js.undefined
  var fieldLevelEncryptionId: js.UndefOr[java.lang.String] = js.undefined
  var forwardedValues: Anon_QueryString
  var lambdaFunctionAssociations: js.UndefOr[js.Array[Anon_LambdaArn]] = js.undefined
  var maxTtl: js.UndefOr[scala.Double] = js.undefined
  var minTtl: js.UndefOr[scala.Double] = js.undefined
  var smoothStreaming: js.UndefOr[scala.Boolean] = js.undefined
  var targetOriginId: java.lang.String
  var trustedSigners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var viewerProtocolPolicy: java.lang.String
}

