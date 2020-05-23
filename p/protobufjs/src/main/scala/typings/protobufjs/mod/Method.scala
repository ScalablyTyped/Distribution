package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Method")
@js.native
class Method protected () extends ReflectionObject {
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
  def this(name: String, `type`: js.UndefOr[String], requestType: String, responseType: String) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: Boolean
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: Boolean
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: Boolean,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: Boolean,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: StringDictionary[js.Any],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: StringDictionary[js.Any],
    responseStream: Boolean,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: StringDictionary[js.Any],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(
    name: String,
    `type`: js.UndefOr[String],
    requestType: String,
    responseType: String,
    requestStream: Boolean,
    responseStream: Boolean,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  /** Whether requests are streamed or not. */
  var requestStream: js.UndefOr[Boolean] = js.native
  /** Request type. */
  var requestType: String = js.native
  /** Resolved request type. */
  var resolvedRequestType: Type | Null = js.native
  /** Resolved response type. */
  var resolvedResponseType: Type | Null = js.native
  /** Whether responses are streamed or not. */
  var responseStream: js.UndefOr[Boolean] = js.native
  /** Response type. */
  var responseType: String = js.native
  /** Method type. */
  var `type`: String = js.native
  def toJSON(toJSONOptions: IToJSONOptions): IMethod = js.native
}

/* static members */
@JSImport("protobufjs", "Method")
@js.native
object Method extends js.Object {
  /**
    * Constructs a method from a method descriptor.
    * @param name Method name
    * @param json Method descriptor
    * @returns Created method
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMethod): Method = js.native
}

