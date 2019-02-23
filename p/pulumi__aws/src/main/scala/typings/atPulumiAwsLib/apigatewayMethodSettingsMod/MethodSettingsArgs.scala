package typings
package atPulumiAwsLib.apigatewayMethodSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The settings block, see below.
    */
  val settings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CacheDataEncryptedCacheTtlInSeconds]
  /**
    * The name of the stage
    */
  val stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

