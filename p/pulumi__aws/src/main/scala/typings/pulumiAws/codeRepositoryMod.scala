package typings.pulumiAws

import typings.pulumiAws.outputMod.sagemaker.CodeRepositoryGitConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeRepositoryMod {
  
  @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository")
  @js.native
  class CodeRepository protected () extends CustomResource {
    /**
      * Create a CodeRepository resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CodeRepositoryArgs) = this()
    def this(name: String, args: CodeRepositoryArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    val codeRepositoryName: Output_[String] = js.native
    
    val gitConfig: Output_[CodeRepositoryGitConfig] = js.native
  }
  /* static members */
  object CodeRepository {
    
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CodeRepository]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CodeRepository]
    inline def get(name: String, id: Input[ID], state: CodeRepositoryState): CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CodeRepository]
    inline def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): CodeRepository = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CodeRepository]
    
    /**
      * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean]
  }
  
  trait CodeRepositoryArgs extends StObject {
    
    val codeRepositoryName: Input[String]
    
    val gitConfig: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]
  }
  object CodeRepositoryArgs {
    
    inline def apply(
      codeRepositoryName: Input[String],
      gitConfig: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]
    ): CodeRepositoryArgs = {
      val __obj = js.Dynamic.literal(codeRepositoryName = codeRepositoryName.asInstanceOf[js.Any], gitConfig = gitConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeRepositoryArgs]
    }
    
    extension [Self <: CodeRepositoryArgs](x: Self) {
      
      inline def setCodeRepositoryName(value: Input[String]): Self = StObject.set(x, "codeRepositoryName", value.asInstanceOf[js.Any])
      
      inline def setGitConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]): Self = StObject.set(x, "gitConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeRepositoryState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    val codeRepositoryName: js.UndefOr[Input[String]] = js.undefined
    
    val gitConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]] = js.undefined
  }
  object CodeRepositoryState {
    
    inline def apply(): CodeRepositoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeRepositoryState]
    }
    
    extension [Self <: CodeRepositoryState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCodeRepositoryName(value: Input[String]): Self = StObject.set(x, "codeRepositoryName", value.asInstanceOf[js.Any])
      
      inline def setCodeRepositoryNameUndefined: Self = StObject.set(x, "codeRepositoryName", js.undefined)
      
      inline def setGitConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]): Self = StObject.set(x, "gitConfig", value.asInstanceOf[js.Any])
      
      inline def setGitConfigUndefined: Self = StObject.set(x, "gitConfig", js.undefined)
    }
  }
}
