package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Equalssign
import typings.serverless.serverlessStrings.Greaterthansign
import typings.serverless.serverlessStrings.GreaterthansignEqualssign
import typings.serverless.serverlessStrings.Lessthansign
import typings.serverless.serverlessStrings.LessthansignEqualssign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Authorizers = StringDictionary[CognitoAuthorizer | OidcAuthorizer | JwtAuthorizer]

type CloudFormationResources = StringDictionary[CloudFormationResource]

type Credentials = StringDictionary[Any]

type Custom = StringDictionary[Any]

type Detail = StringDictionary[js.Array[String]]

type Environment = StringDictionary[Any]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typings.serverless.serverlessStrings._empty
  - java.lang.String
  - typings.serverless.anon.Anythingbut
  - typings.serverless.anon.Numeric
  - typings.serverless.anon.Exists
  - typings.serverless.anon.Prefix
*/
type Filter = _Filter | Null | String

type Functions = StringDictionary[AwsFunctionHandler | AwsFunctionImage]

type Input = StringDictionary[Any]

type Layers = StringDictionary[Layer]

type NumericFilter = (js.Tuple2[
Equalssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign, 
Double]) | (js.Tuple4[
Greaterthansign | GreaterthansignEqualssign, 
Double, 
Lessthansign | LessthansignEqualssign, 
Double])

type Outputs = StringDictionary[Output]

type ResourcesConditions = StringDictionary[Any]

type Tags = StringDictionary[String]
