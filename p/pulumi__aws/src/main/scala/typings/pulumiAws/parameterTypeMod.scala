package typings.pulumiAws

import typings.pulumiAws.enumsSsmMod.ParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterTypeMod {
  
  @JSImport("@pulumi/aws/ssm/parameterType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/ssm/parameterType", "SecureStringParameter")
  @js.native
  def SecureStringParameter: ParameterType = js.native
  @scala.inline
  def SecureStringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureStringParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ssm/parameterType", "StringListParameter")
  @js.native
  def StringListParameter: ParameterType = js.native
  @scala.inline
  def StringListParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringListParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ssm/parameterType", "StringParameter")
  @js.native
  def StringParameter: ParameterType = js.native
  @scala.inline
  def StringParameter_=(x: ParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringParameter")(x.asInstanceOf[js.Any])
}
