package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums/ssm", JSImport.Namespace)
@js.native
object enumsSsmMod extends js.Object {
  
  /* Inlined { readonly String :'String',  readonly StringList :'StringList',  readonly SecureString :'SecureString'}[keyof { readonly String :'String',  readonly StringList :'StringList',  readonly SecureString :'SecureString'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.String
    - typings.pulumiAws.pulumiAwsStrings.StringList
    - typings.pulumiAws.pulumiAwsStrings.SecureString
  */
  trait ParameterType extends js.Object
  @js.native
  object ParameterType extends js.Object {
    
    val SecureString: typings.pulumiAws.pulumiAwsStrings.SecureString = js.native
    
    val String: typings.pulumiAws.pulumiAwsStrings.String = js.native
    
    val StringList: typings.pulumiAws.pulumiAwsStrings.StringList = js.native
  }
}
