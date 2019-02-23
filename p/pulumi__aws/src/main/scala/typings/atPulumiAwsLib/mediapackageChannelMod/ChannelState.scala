package typings
package atPulumiAwsLib.mediapackageChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelState extends js.Object {
  /**
    * The ARN of the channel
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique identifier describing the channel
    */
  val channelId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A description of the channel
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A single item list of HLS ingest information
    */
  val hlsIngests: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IngestEndpointsAnonPasswordUrl]
      ]
    ]
  ] = js.undefined
}

