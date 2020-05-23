package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awsProviderMod {
  type Authorizers = org.scalablytyped.runtime.StringDictionary[
    typings.serverless.awsProviderMod.CognitoAuthorizer | typings.serverless.awsProviderMod.OidcAuthorizer | typings.serverless.awsProviderMod.JwtAuthorizer
  ]
  type CloudFormationResources = org.scalablytyped.runtime.StringDictionary[typings.serverless.awsProviderMod.CloudFormationResource]
  type Detail = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type Environment = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Functions = org.scalablytyped.runtime.StringDictionary[typings.serverless.awsProviderMod.AwsFunction]
  type Input = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Layers = org.scalablytyped.runtime.StringDictionary[typings.serverless.awsProviderMod.Layer]
  type Outputs = org.scalablytyped.runtime.StringDictionary[typings.serverless.awsProviderMod.Output]
  type Tags = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
