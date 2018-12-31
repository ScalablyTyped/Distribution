package typings
package atPulumiAwsLib.awsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/awsMixins", "@pulumi/aws")
@js.native
object awsMod extends js.Object {
  /**
    * Provides quick access to the "aws-sdk" SDK (https://github.com/aws/aws-sdk-js) within a
    * javascript callback function that is serialized into an AWS Lambda.  Inside a Pulumi app
    * a program can be written like so:
    *
    * ```ts
    *    import * as aws from "@pulumi/aws";
    *
    *    // ...
    *
    *    // inside the callback function for an AWS Lambda:
    *    const client = new aws.sdk.DynamoDB.DocumentClient(...opt-args...);
    * ```
    *
    * Note: this property will give you the aws-sdk module that AWS automatically includes
    * with any javascript Lambda.
    */
  val sdk: atPulumiAwsLib.Anon_TemporaryCredentials = js.native
}

