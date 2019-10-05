package typings.atPulumiAws

import typings.atPulumiAws.ssmParameterTypeMod.ParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/parameterType", JSImport.Namespace)
@js.native
object ssmParameterTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.String
    - typings.atPulumiAws.atPulumiAwsStrings.StringList
    - typings.atPulumiAws.atPulumiAwsStrings.SecureString
  */
  trait ParameterType extends js.Object
  
  var SecureStringParameter: ParameterType = js.native
  var StringListParameter: ParameterType = js.native
  var StringParameter: ParameterType = js.native
}

