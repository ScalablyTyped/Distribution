package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
   // 'mutation' | 'query' | 'subscription';
  val id: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val metadata: org.scalablytyped.runtime.StringDictionary[js.Any]
  val name: java.lang.String
  val operationKind: java.lang.String
  val text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object RequestParameters {
  @scala.inline
  def apply(
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any],
    name: java.lang.String,
    operationKind: java.lang.String,
    id: java.lang.String = null,
    text: java.lang.String = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal(metadata = metadata, name = name, operationKind = operationKind)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RequestParameters]
  }
}

