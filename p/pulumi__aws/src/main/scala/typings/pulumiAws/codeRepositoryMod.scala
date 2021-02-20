package typings.pulumiAws

import typings.pulumiAws.outputMod.sagemaker.CodeRepositoryGitConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing CodeRepository resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID]): CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState): CodeRepository = js.native
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository.get")
    @js.native
    def get(name: String, id: Input[ID], state: CodeRepositoryState, opts: CustomResourceOptions): CodeRepository = js.native
    
    /**
      * Returns true if the given object is an instance of CodeRepository.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sagemaker/codeRepository", "CodeRepository.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/codeRepository.CodeRepository */ Boolean = js.native
  }
  
  @js.native
  trait CodeRepositoryArgs extends StObject {
    
    val codeRepositoryName: Input[String] = js.native
    
    val gitConfig: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig] = js.native
  }
  object CodeRepositoryArgs {
    
    @scala.inline
    def apply(
      codeRepositoryName: Input[String],
      gitConfig: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]
    ): CodeRepositoryArgs = {
      val __obj = js.Dynamic.literal(codeRepositoryName = codeRepositoryName.asInstanceOf[js.Any], gitConfig = gitConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeRepositoryArgs]
    }
    
    @scala.inline
    implicit class CodeRepositoryArgsMutableBuilder[Self <: CodeRepositoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeRepositoryName(value: Input[String]): Self = StObject.set(x, "codeRepositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]): Self = StObject.set(x, "gitConfig", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CodeRepositoryState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    val codeRepositoryName: js.UndefOr[Input[String]] = js.native
    
    val gitConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]] = js.native
  }
  object CodeRepositoryState {
    
    @scala.inline
    def apply(): CodeRepositoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeRepositoryState]
    }
    
    @scala.inline
    implicit class CodeRepositoryStateMutableBuilder[Self <: CodeRepositoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCodeRepositoryName(value: Input[String]): Self = StObject.set(x, "codeRepositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeRepositoryNameUndefined: Self = StObject.set(x, "codeRepositoryName", js.undefined)
      
      @scala.inline
      def setGitConfig(value: Input[typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig]): Self = StObject.set(x, "gitConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitConfigUndefined: Self = StObject.set(x, "gitConfig", js.undefined)
    }
  }
}
