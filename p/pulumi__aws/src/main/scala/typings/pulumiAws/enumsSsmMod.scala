package typings.pulumiAws

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsSsmMod {
  
  /* Inlined { readonly String :'String',  readonly StringList :'StringList',  readonly SecureString :'SecureString'}[keyof { readonly String :'String',  readonly StringList :'StringList',  readonly SecureString :'SecureString'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.String
    - typings.pulumiAws.pulumiAwsStrings.StringList
    - typings.pulumiAws.pulumiAwsStrings.SecureString
  */
  trait ParameterType extends StObject
  object ParameterType {
    
    @JSImport("@pulumi/aws/types/enums/ssm", "ParameterType.SecureString")
    @js.native
    val SecureString: typings.pulumiAws.pulumiAwsStrings.SecureString = js.native
    
    @JSImport("@pulumi/aws/types/enums/ssm", "ParameterType.String")
    @js.native
    val String: typings.pulumiAws.pulumiAwsStrings.String = js.native
    
    @JSImport("@pulumi/aws/types/enums/ssm", "ParameterType.StringList")
    @js.native
    val StringList: typings.pulumiAws.pulumiAwsStrings.StringList = js.native
  }
}
