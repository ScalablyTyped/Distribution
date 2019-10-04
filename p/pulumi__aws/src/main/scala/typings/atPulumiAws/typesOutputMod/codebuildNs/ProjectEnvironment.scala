package typings.atPulumiAws.typesOutputMod.codebuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironment extends js.Object {
  /**
    * The ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
    */
  var certificate: js.UndefOr[String] = js.undefined
  /**
    * Information about the compute resources the build project will use. Available values for this parameter are: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM` or `BUILD_GENERAL1_LARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`
    */
  var computeType: String
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.Array[ProjectEnvironmentEnvironmentVariable]
  /**
    * The Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g. `nginx:latest`), and full Docker repository URIs such as those for ECR (e.g. `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
    */
  var image: String
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Available values for this parameter are `CODEBUILD` or `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. Default to `CODEBUILD`
    */
  var imagePullCredentialsType: js.UndefOr[String] = js.undefined
  /**
    * If set to true, enables running the Docker daemon inside a Docker container. Defaults to `false`.
    */
  var privilegedMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about credentials for access to a private Docker registry. Registry Credential config blocks are documented below.
    */
  var registryCredential: js.UndefOr[ProjectEnvironmentRegistryCredential] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: String
}

object ProjectEnvironment {
  @scala.inline
  def apply(
    computeType: String,
    environmentVariables: js.Array[ProjectEnvironmentEnvironmentVariable],
    image: String,
    `type`: String,
    certificate: String = null,
    imagePullCredentialsType: String = null,
    privilegedMode: js.UndefOr[Boolean] = js.undefined,
    registryCredential: ProjectEnvironmentRegistryCredential = null
  ): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType, environmentVariables = environmentVariables, image = image)
    __obj.updateDynamic("type")(`type`)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (imagePullCredentialsType != null) __obj.updateDynamic("imagePullCredentialsType")(imagePullCredentialsType)
    if (!js.isUndefined(privilegedMode)) __obj.updateDynamic("privilegedMode")(privilegedMode)
    if (registryCredential != null) __obj.updateDynamic("registryCredential")(registryCredential)
    __obj.asInstanceOf[ProjectEnvironment]
  }
}

