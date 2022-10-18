package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacConstantsMod {
  
  @js.native
  sealed trait IacProjectType extends StObject
  @JSImport("snyk/dist/lib/iac/constants", "IacProjectType")
  @js.native
  object IacProjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IacProjectType & String] = js.native
    
    @js.native
    sealed trait ARM
      extends StObject
         with IacProjectType
    /* "armconfig" */ val ARM: typings.snyk.distLibIacConstantsMod.IacProjectType.ARM & String = js.native
    
    @js.native
    sealed trait CLOUDFORMATION
      extends StObject
         with IacProjectType
    /* "cloudformationconfig" */ val CLOUDFORMATION: typings.snyk.distLibIacConstantsMod.IacProjectType.CLOUDFORMATION & String = js.native
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with IacProjectType
    /* "customconfig" */ val CUSTOM: typings.snyk.distLibIacConstantsMod.IacProjectType.CUSTOM & String = js.native
    
    @js.native
    sealed trait K8S
      extends StObject
         with IacProjectType
    /* "k8sconfig" */ val K8S: typings.snyk.distLibIacConstantsMod.IacProjectType.K8S & String = js.native
    
    @js.native
    sealed trait MULTI_IAC
      extends StObject
         with IacProjectType
    /* "multiiacconfig" */ val MULTI_IAC: typings.snyk.distLibIacConstantsMod.IacProjectType.MULTI_IAC & String = js.native
    
    @js.native
    sealed trait TERRAFORM
      extends StObject
         with IacProjectType
    /* "terraformconfig" */ val TERRAFORM: typings.snyk.distLibIacConstantsMod.IacProjectType.TERRAFORM & String = js.native
  }
  
  @JSImport("snyk/dist/lib/iac/constants", "TEST_SUPPORTED_IAC_PROJECTS")
  @js.native
  val TEST_SUPPORTED_IAC_PROJECTS: js.Array[IacProjectTypes] = js.native
  
  /* Inlined {[ k in snyk.snyk/dist/lib/iac/constants.IacProjectTypes ]:? string} */
  object iacRemediationTypes {
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.armconfig")
    @js.native
    def armconfig: js.UndefOr[String] = js.native
    inline def armconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("armconfig")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.cloudformationconfig")
    @js.native
    def cloudformationconfig: js.UndefOr[String] = js.native
    inline def cloudformationconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cloudformationconfig")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.customconfig")
    @js.native
    def customconfig: js.UndefOr[String] = js.native
    inline def customconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customconfig")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.k8sconfig")
    @js.native
    def k8sconfig: js.UndefOr[String] = js.native
    inline def k8sconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("k8sconfig")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.multiiacconfig")
    @js.native
    def multiiacconfig: js.UndefOr[String] = js.native
    inline def multiiacconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiiacconfig")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/iac/constants", "iacRemediationTypes.terraformconfig")
    @js.native
    def terraformconfig: js.UndefOr[String] = js.native
    inline def terraformconfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("terraformconfig")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParserFileType * / scala.Any
    - typings.snyk.snykStrings.tf
    - typings.snyk.snykStrings.tfvars
  */
  type IacFileTypes = _IacFileTypes | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParserFileType */ Any)
  
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.k8sconfig
    - typings.snyk.snykStrings.terraformconfig
    - typings.snyk.snykStrings.cloudformationconfig
    - typings.snyk.snykStrings.armconfig
    - typings.snyk.snykStrings.customconfig
    - typings.snyk.snykStrings.multiiacconfig
  */
  trait IacProjectTypes extends StObject
  object IacProjectTypes {
    
    inline def armconfig: typings.snyk.snykStrings.armconfig = "armconfig".asInstanceOf[typings.snyk.snykStrings.armconfig]
    
    inline def cloudformationconfig: typings.snyk.snykStrings.cloudformationconfig = "cloudformationconfig".asInstanceOf[typings.snyk.snykStrings.cloudformationconfig]
    
    inline def customconfig: typings.snyk.snykStrings.customconfig = "customconfig".asInstanceOf[typings.snyk.snykStrings.customconfig]
    
    inline def k8sconfig: typings.snyk.snykStrings.k8sconfig = "k8sconfig".asInstanceOf[typings.snyk.snykStrings.k8sconfig]
    
    inline def multiiacconfig: typings.snyk.snykStrings.multiiacconfig = "multiiacconfig".asInstanceOf[typings.snyk.snykStrings.multiiacconfig]
    
    inline def terraformconfig: typings.snyk.snykStrings.terraformconfig = "terraformconfig".asInstanceOf[typings.snyk.snykStrings.terraformconfig]
  }
  
  trait _IacFileTypes extends StObject
}
