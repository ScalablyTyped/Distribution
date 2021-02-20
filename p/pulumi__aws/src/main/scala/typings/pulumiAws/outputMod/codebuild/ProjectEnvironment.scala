package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectEnvironment extends StObject {
  
  /**
    * The ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
    */
  var certificate: js.UndefOr[String] = js.native
  
  /**
    * Information about the compute resources the build project will use. Available values for this parameter are: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE` or `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `computeType` need to be `BUILD_GENERAL1_LARGE`.
    */
  var computeType: String = js.native
  
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[js.Array[ProjectEnvironmentEnvironmentVariable]] = js.native
  
  /**
    * The Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g. `nginx:latest`), and full Docker repository URIs such as those for ECR (e.g. `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
    */
  var image: String = js.native
  
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Available values for this parameter are `CODEBUILD` or `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. Default to `CODEBUILD`
    */
  var imagePullCredentialsType: js.UndefOr[String] = js.native
  
  /**
    * If set to true, enables running the Docker daemon inside a Docker container. Defaults to `false`.
    */
  var privilegedMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about credentials for access to a private Docker registry. Registry Credential config blocks are documented below.
    */
  var registryCredential: js.UndefOr[ProjectEnvironmentRegistryCredential] = js.native
  
  /**
    * The type of build environment to use for related builds. Available values are: `LINUX_CONTAINER`, `LINUX_GPU_CONTAINER`, `WINDOWS_CONTAINER` or `ARM_CONTAINER`.
    */
  var `type`: String = js.native
}
object ProjectEnvironment {
  
  @scala.inline
  def apply(computeType: String, image: String, `type`: String): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironment]
  }
  
  @scala.inline
  implicit class ProjectEnvironmentMutableBuilder[Self <: ProjectEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setComputeType(value: String): Self = StObject.set(x, "computeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[ProjectEnvironmentEnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: ProjectEnvironmentEnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullCredentialsType(value: String): Self = StObject.set(x, "imagePullCredentialsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullCredentialsTypeUndefined: Self = StObject.set(x, "imagePullCredentialsType", js.undefined)
    
    @scala.inline
    def setPrivilegedMode(value: Boolean): Self = StObject.set(x, "privilegedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedModeUndefined: Self = StObject.set(x, "privilegedMode", js.undefined)
    
    @scala.inline
    def setRegistryCredential(value: ProjectEnvironmentRegistryCredential): Self = StObject.set(x, "registryCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryCredentialUndefined: Self = StObject.set(x, "registryCredential", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
