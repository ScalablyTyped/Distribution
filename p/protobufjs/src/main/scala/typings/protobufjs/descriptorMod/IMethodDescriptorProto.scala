package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethodDescriptorProto extends js.Object {
  var clientStreaming: js.UndefOr[Boolean] = js.undefined
  var inputType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[IMethodOptions] = js.undefined
  var outputType: js.UndefOr[String] = js.undefined
  var serverStreaming: js.UndefOr[Boolean] = js.undefined
}

object IMethodDescriptorProto {
  @scala.inline
  def apply(
    clientStreaming: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    name: String = null,
    options: IMethodOptions = null,
    outputType: String = null,
    serverStreaming: js.UndefOr[Boolean] = js.undefined
  ): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientStreaming)) __obj.updateDynamic("clientStreaming")(clientStreaming.get.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outputType != null) __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    if (!js.isUndefined(serverStreaming)) __obj.updateDynamic("serverStreaming")(serverStreaming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
}

