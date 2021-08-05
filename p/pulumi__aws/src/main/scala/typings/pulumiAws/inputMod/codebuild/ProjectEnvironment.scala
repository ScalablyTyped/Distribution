package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectEnvironment extends StObject {
  
  /**
    * The ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
    */
  var certificate: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Information about the compute resources the build project will use. Available values for this parameter are: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE` or `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `computeType` need to be `BUILD_GENERAL1_LARGE`.
    */
  var computeType: Input[String]
  
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]]] = js.undefined
  
  /**
    * The Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g. `nginx:latest`), and full Docker repository URIs such as those for ECR (e.g. `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
    */
  var image: Input[String]
  
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Available values for this parameter are `CODEBUILD` or `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. Default to `CODEBUILD`
    */
  var imagePullCredentialsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * If set to true, enables running the Docker daemon inside a Docker container. Defaults to `false`.
    */
  var privilegedMode: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Information about credentials for access to a private Docker registry. Registry Credential config blocks are documented below.
    */
  var registryCredential: js.UndefOr[Input[ProjectEnvironmentRegistryCredential]] = js.undefined
  
  /**
    * The type of build environment to use for related builds. Available values are: `LINUX_CONTAINER`, `LINUX_GPU_CONTAINER`, `WINDOWS_CONTAINER` or `ARM_CONTAINER`.
    */
  var `type`: Input[String]
}
object ProjectEnvironment {
  
  inline def apply(computeType: Input[String], image: Input[String], `type`: Input[String]): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironment]
  }
  
  extension [Self <: ProjectEnvironment](x: Self) {
    
    inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setComputeType(value: Input[String]): Self = StObject.set(x, "computeType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariables(value: Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setEnvironmentVariablesVarargs(value: Input[ProjectEnvironmentEnvironmentVariable]*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
    
    inline def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImagePullCredentialsType(value: Input[String]): Self = StObject.set(x, "imagePullCredentialsType", value.asInstanceOf[js.Any])
    
    inline def setImagePullCredentialsTypeUndefined: Self = StObject.set(x, "imagePullCredentialsType", js.undefined)
    
    inline def setPrivilegedMode(value: Input[Boolean]): Self = StObject.set(x, "privilegedMode", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedModeUndefined: Self = StObject.set(x, "privilegedMode", js.undefined)
    
    inline def setRegistryCredential(value: Input[ProjectEnvironmentRegistryCredential]): Self = StObject.set(x, "registryCredential", value.asInstanceOf[js.Any])
    
    inline def setRegistryCredentialUndefined: Self = StObject.set(x, "registryCredential", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
