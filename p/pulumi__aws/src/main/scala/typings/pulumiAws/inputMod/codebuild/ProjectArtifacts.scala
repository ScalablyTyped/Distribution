package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectArtifacts extends StObject {
  
  /**
    * The artifact identifier. Must be the same specified inside AWS CodeBuild buildspec.
    */
  var artifactIdentifier: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If set to true, output artifacts will not be encrypted. If `type` is set to `NO_ARTIFACTS` then this value will be ignored. Defaults to `false`.
    */
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Information about the build output artifact location. If `type` is set to `CODEPIPELINE` or `NO_ARTIFACTS` then this value will be ignored. If `type` is set to `S3`, this is the name of the output bucket.
    */
  var location: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values for this parameter are: `BUILD_ID` or `NONE`.
    */
  var namespaceType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If set to true, a name specified in the build spec file overrides the artifact name.
    */
  var overrideArtifactName: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The type of build output artifact to create. If `type` is set to `S3`, valid values for this parameter are: `NONE` or `ZIP`
    */
  var packaging: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If `type` is set to `S3`, this is the path to the output artifact
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The build output artifact's type. Valid values for this parameter are: `CODEPIPELINE`, `NO_ARTIFACTS` or `S3`.
    */
  var `type`: Input[String]
}
object ProjectArtifacts {
  
  inline def apply(`type`: Input[String]): ProjectArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArtifacts]
  }
  
  extension [Self <: ProjectArtifacts](x: Self) {
    
    inline def setArtifactIdentifier(value: Input[String]): Self = StObject.set(x, "artifactIdentifier", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdentifierUndefined: Self = StObject.set(x, "artifactIdentifier", js.undefined)
    
    inline def setEncryptionDisabled(value: Input[Boolean]): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespaceType(value: Input[String]): Self = StObject.set(x, "namespaceType", value.asInstanceOf[js.Any])
    
    inline def setNamespaceTypeUndefined: Self = StObject.set(x, "namespaceType", js.undefined)
    
    inline def setOverrideArtifactName(value: Input[Boolean]): Self = StObject.set(x, "overrideArtifactName", value.asInstanceOf[js.Any])
    
    inline def setOverrideArtifactNameUndefined: Self = StObject.set(x, "overrideArtifactName", js.undefined)
    
    inline def setPackaging(value: Input[String]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
