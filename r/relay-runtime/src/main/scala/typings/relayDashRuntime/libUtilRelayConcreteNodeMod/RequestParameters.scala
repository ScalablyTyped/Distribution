package typings.relayDashRuntime.libUtilRelayConcreteNodeMod

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
    id: String = null,
    text: String = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal(metadata = metadata, name = name, operationKind = operationKind)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RequestParameters]
  }
}

