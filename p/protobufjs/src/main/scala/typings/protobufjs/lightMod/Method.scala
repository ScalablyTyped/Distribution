package typings.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Method")
@js.native
class Method protected ()
  extends typings.protobufjs.mod.Method {
  /**
    * Constructs a new service method instance.
    * @param name Method name
    * @param type Method type, usually `"rpc"`
    * @param requestType Request message type
    * @param responseType Response message type
    * @param [requestStream] Whether the request is streamed
    * @param [responseStream] Whether the response is streamed
    * @param [options] Declared options
    * @param [comment] The comment for this method
    */
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: js.UndefOr[Boolean | StringDictionary[js.Any]],
    responseStream: js.UndefOr[Boolean | StringDictionary[js.Any]],
    options: js.UndefOr[StringDictionary[js.Any]],
    comment: js.UndefOr[String]
  ) = this()
}

/* static members */
@JSImport("protobufjs/light", "Method")
@js.native
object Method extends js.Object {
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMethod): typings.protobufjs.mod.Method = js.native
}

