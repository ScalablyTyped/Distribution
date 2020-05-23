package typings.relayRuntime.relayConcreteNodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
   // 'mutation' | 'query' | 'subscription';
  val id: js.UndefOr[String | Null] = js.undefined
  val metadata: StringDictionary[js.Any]
  val name: String
  val operationKind: String
  val text: js.UndefOr[String | Null] = js.undefined
}

object RequestParameters {
  @scala.inline
  def apply(
    metadata: StringDictionary[js.Any],
    name: String,
    operationKind: String,
    id: js.UndefOr[Null | String] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined
  ): RequestParameters = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
}

