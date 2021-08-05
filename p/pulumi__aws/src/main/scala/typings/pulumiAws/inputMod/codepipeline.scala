package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipeline {
  
  trait PipelineArtifactStore extends StObject {
    
    /**
      * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryptionKey` block is documented below.
      */
    var encryptionKey: js.UndefOr[Input[PipelineArtifactStoreEncryptionKey]] = js.undefined
    
    /**
      * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
      */
    var location: Input[String]
    
    /**
      * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
      */
    var region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the artifact store, such as Amazon S3
      */
    var `type`: Input[String]
  }
  object PipelineArtifactStore {
    
    inline def apply(location: Input[String], `type`: Input[String]): PipelineArtifactStore = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArtifactStore]
    }
    
    extension [Self <: PipelineArtifactStore](x: Self) {
      
      inline def setEncryptionKey(value: Input[PipelineArtifactStoreEncryptionKey]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PipelineArtifactStoreEncryptionKey extends StObject {
    
    /**
      * The KMS key ARN or ID
      */
    var id: Input[String]
    
    /**
      * The type of key; currently only `KMS` is supported
      */
    var `type`: Input[String]
  }
  object PipelineArtifactStoreEncryptionKey {
    
    inline def apply(id: Input[String], `type`: Input[String]): PipelineArtifactStoreEncryptionKey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArtifactStoreEncryptionKey]
    }
    
    extension [Self <: PipelineArtifactStoreEncryptionKey](x: Self) {
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PipelineStage extends StObject {
    
    /**
      * The action(s) to include in the stage. Defined as an `action` block below
      */
    var actions: Input[js.Array[Input[PipelineStageAction]]]
    
    /**
      * The name of the stage.
      */
    var name: Input[String]
  }
  object PipelineStage {
    
    inline def apply(actions: Input[js.Array[Input[PipelineStageAction]]], name: Input[String]): PipelineStage = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineStage]
    }
    
    extension [Self <: PipelineStage](x: Self) {
      
      inline def setActions(value: Input[js.Array[Input[PipelineStageAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Input[PipelineStageAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PipelineStageAction extends StObject {
    
    /**
      * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
      */
    var category: Input[String]
    
    /**
      * A map of the action declaration's configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
      */
    var configuration: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of artifact names to be worked on.
      */
    var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The action declaration's name.
      */
    var name: Input[String]
    
    /**
      * The namespace all output variables will be accessed from.
      */
    var namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of artifact names to output. Output artifact names must be unique within a pipeline.
      */
    var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
      */
    var owner: Input[String]
    
    /**
      * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy.
      */
    var provider: Input[String]
    
    /**
      * The region in which to run the action.
      */
    var region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
      */
    var roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The order in which actions are run.
      */
    var runOrder: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A string that identifies the action type.
      */
    var version: Input[String]
  }
  object PipelineStageAction {
    
    inline def apply(
      category: Input[String],
      name: Input[String],
      owner: Input[String],
      provider: Input[String],
      version: Input[String]
    ): PipelineStageAction = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineStageAction]
    }
    
    extension [Self <: PipelineStageAction](x: Self) {
      
      inline def setCategory(value: Input[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setInputArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
      
      inline def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
      
      inline def setInputArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "inputArtifacts", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOutputArtifacts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
      
      inline def setOutputArtifactsUndefined: Self = StObject.set(x, "outputArtifacts", js.undefined)
      
      inline def setOutputArtifactsVarargs(value: Input[String]*): Self = StObject.set(x, "outputArtifacts", js.Array(value :_*))
      
      inline def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: Input[String]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setRunOrder(value: Input[Double]): Self = StObject.set(x, "runOrder", value.asInstanceOf[js.Any])
      
      inline def setRunOrderUndefined: Self = StObject.set(x, "runOrder", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookAuthenticationConfiguration extends StObject {
    
    /**
      * A valid CIDR block for `IP` filtering. Required for `IP`.
      */
    var allowedIpRange: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The shared secret for the GitHub repository webhook. Set this as `secret` in your `githubRepositoryWebhook`'s `configuration` block. Required for `GITHUB_HMAC`.
      */
    var secretToken: js.UndefOr[Input[String]] = js.undefined
  }
  object WebhookAuthenticationConfiguration {
    
    inline def apply(): WebhookAuthenticationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookAuthenticationConfiguration]
    }
    
    extension [Self <: WebhookAuthenticationConfiguration](x: Self) {
      
      inline def setAllowedIpRange(value: Input[String]): Self = StObject.set(x, "allowedIpRange", value.asInstanceOf[js.Any])
      
      inline def setAllowedIpRangeUndefined: Self = StObject.set(x, "allowedIpRange", js.undefined)
      
      inline def setSecretToken(value: Input[String]): Self = StObject.set(x, "secretToken", value.asInstanceOf[js.Any])
      
      inline def setSecretTokenUndefined: Self = StObject.set(x, "secretToken", js.undefined)
    }
  }
  
  trait WebhookFilter extends StObject {
    
    /**
      * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
      */
    var jsonPath: Input[String]
    
    /**
      * The value to match on (e.g. `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
      */
    var matchEquals: Input[String]
  }
  object WebhookFilter {
    
    inline def apply(jsonPath: Input[String], matchEquals: Input[String]): WebhookFilter = {
      val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookFilter]
    }
    
    extension [Self <: WebhookFilter](x: Self) {
      
      inline def setJsonPath(value: Input[String]): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
      
      inline def setMatchEquals(value: Input[String]): Self = StObject.set(x, "matchEquals", value.asInstanceOf[js.Any])
    }
  }
}
