package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectEnvironment extends js.Object {
  /**
    * The ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
    */
  var certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the compute resources the build project will use. Available values for this parameter are: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE` or `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `computeType` need to be `BUILD_GENERAL1_LARGE`.
    */
  var computeType: Input[String] = js.native
  /**
    * A set of environment variables to make available to builds for this build project.
    */
  var environmentVariables: js.UndefOr[Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]]] = js.native
  /**
    * The Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g. `nginx:latest`), and full Docker repository URIs such as those for ECR (e.g. `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
    */
  var image: Input[String] = js.native
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. Available values for this parameter are `CODEBUILD` or `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials. Default to `CODEBUILD`
    */
  var imagePullCredentialsType: js.UndefOr[Input[String]] = js.native
  /**
    * If set to true, enables running the Docker daemon inside a Docker container. Defaults to `false`.
    */
  var privilegedMode: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Information about credentials for access to a private Docker registry. Registry Credential config blocks are documented below.
    */
  var registryCredential: js.UndefOr[Input[ProjectEnvironmentRegistryCredential]] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: Input[String] = js.native
}

object ProjectEnvironment {
  @scala.inline
  def apply(
    computeType: Input[String],
    image: Input[String],
    `type`: Input[String],
    certificate: Input[String] = null,
    environmentVariables: Input[js.Array[Input[ProjectEnvironmentEnvironmentVariable]]] = null,
    imagePullCredentialsType: Input[String] = null,
    privilegedMode: Input[Boolean] = null,
    registryCredential: Input[ProjectEnvironmentRegistryCredential] = null
  ): ProjectEnvironment = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (imagePullCredentialsType != null) __obj.updateDynamic("imagePullCredentialsType")(imagePullCredentialsType.asInstanceOf[js.Any])
    if (privilegedMode != null) __obj.updateDynamic("privilegedMode")(privilegedMode.asInstanceOf[js.Any])
    if (registryCredential != null) __obj.updateDynamic("registryCredential")(registryCredential.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironment]
  }
}

