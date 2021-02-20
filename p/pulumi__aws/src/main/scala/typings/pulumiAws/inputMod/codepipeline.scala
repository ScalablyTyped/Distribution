package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipeline {
  
  @js.native
  trait PipelineArtifactStore extends StObject {
    
    /**
      * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryptionKey` block is documented below.
      */
    var encryptionKey: js.UndefOr[Input[PipelineArtifactStoreEncryptionKey]] = js.native
    
    /**
      * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
      */
    var location: Input[String] = js.native
    
    /**
      * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
      */
    var region: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the artifact store, such as Amazon S3
      */
    var `type`: Input[String] = js.native
  }
  object PipelineArtifactStore {
    
    @scala.inline
    def apply(location: Input[String], `type`: Input[String]): PipelineArtifactStore = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArtifactStore]
    }
    
    @scala.inline
    implicit class PipelineArtifactStoreMutableBuilder[Self <: PipelineArtifactStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionKey(value: Input[PipelineArtifactStoreEncryptionKey]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PipelineArtifactStoreEncryptionKey extends StObject {
    
    /**
      * The KMS key ARN or ID
      */
    var id: Input[String] = js.native
    
    /**
      * The type of key; currently only `KMS` is supported
      */
    var `type`: Input[String] = js.native
  }
  object PipelineArtifactStoreEncryptionKey {
    
    @scala.inline
    def apply(id: Input[String], `type`: Input[String]): PipelineArtifactStoreEncryptionKey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
    }
    
    @scala.inline
    implicit class PipelineArtifactStoreEncryptionKeyMutableBuilder[Self <: PipelineArtifactStoreEncryptionKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PipelineStage extends StObject {
    
    /**
      * The action(s) to include in the stage. Defined as an `action` block below
      */
    var actions: Input[js.Array[Input[PipelineStageAction]]] = js.native
    
    /**
      * The name of the stage.
      */
    var name: Input[String] = js.native
  }
  object PipelineStage {
    
    @scala.inline
    def apply(actions: Input[js.Array[Input[PipelineStageAction]]], name: Input[String]): PipelineStage = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineStage]
    }
    
    @scala.inline
    implicit class PipelineStageMutableBuilder[Self <: PipelineStage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Input[js.Array[Input[PipelineStageAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Input[PipelineStageAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PipelineStageAction extends StObject {
    
    /**
      * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
      */
    var category: Input[String] = js.native
    
    /**
      * A map of the action declaration's configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
      */
    var configuration: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A list of artifact names to be worked on.
      */
    var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The action declaration's name.
      */
    var name: Input[String] = js.native
    
    /**
      * The namespace all output variables will be accessed from.
      */
    var namespace: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of artifact names to output. Output artifact names must be unique within a pipeline.
      */
    var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
      */
    var owner: Input[String] = js.native
    
    /**
      * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy.
      */
    var provider: Input[String] = js.native
    
    /**
      * The region in which to run the action.
      */
    var region: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
      */
    var roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The order in which actions are run.
      */
    var runOrder: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A string that identifies the action type.
      */
    var version: Input[String] = js.native
  }
  object PipelineStageAction {
    
    @scala.inline
    def apply(
      category: Input[String],
      name: Input[String],
      owner: Input[String],
      provider: Input[String],
      version: Input[String]
    ): PipelineStageAction = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineStageAction]
    }
    
    @scala.inline
    implicit class PipelineStageActionMutableBuilder[Self <: PipelineStageAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: Input[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguration(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setInputArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
      
      @scala.inline
      def setInputArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "inputArtifacts", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setOutputArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputArtifactsUndefined: Self = StObject.set(x, "outputArtifacts", js.undefined)
      
      @scala.inline
      def setOutputArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "outputArtifacts", js.Array(value :_*))
      
      @scala.inline
      def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: Input[String]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setRunOrder(value: Input[Double]): Self = StObject.set(x, "runOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunOrderUndefined: Self = StObject.set(x, "runOrder", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebhookAuthenticationConfiguration extends StObject {
    
    /**
      * A valid CIDR block for `IP` filtering. Required for `IP`.
      */
    var allowedIpRange: js.UndefOr[Input[String]] = js.native
    
    /**
      * The shared secret for the GitHub repository webhook. Set this as `secret` in your `githubRepositoryWebhook`'s `configuration` block. Required for `GITHUB_HMAC`.
      */
    var secretToken: js.UndefOr[Input[String]] = js.native
  }
  object WebhookAuthenticationConfiguration {
    
    @scala.inline
    def apply(): WebhookAuthenticationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookAuthenticationConfiguration]
    }
    
    @scala.inline
    implicit class WebhookAuthenticationConfigurationMutableBuilder[Self <: WebhookAuthenticationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedIpRange(value: Input[String]): Self = StObject.set(x, "allowedIpRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedIpRangeUndefined: Self = StObject.set(x, "allowedIpRange", js.undefined)
      
      @scala.inline
      def setSecretToken(value: Input[String]): Self = StObject.set(x, "secretToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretTokenUndefined: Self = StObject.set(x, "secretToken", js.undefined)
    }
  }
  
  @js.native
  trait WebhookFilter extends StObject {
    
    /**
      * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
      */
    var jsonPath: Input[String] = js.native
    
    /**
      * The value to match on (e.g. `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
      */
    var matchEquals: Input[String] = js.native
  }
  object WebhookFilter {
    
    @scala.inline
    def apply(jsonPath: Input[String], matchEquals: Input[String]): WebhookFilter = {
      val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookFilter]
    }
    
    @scala.inline
    implicit class WebhookFilterMutableBuilder[Self <: WebhookFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonPath(value: Input[String]): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchEquals(value: Input[String]): Self = StObject.set(x, "matchEquals", value.asInstanceOf[js.Any])
    }
  }
}
