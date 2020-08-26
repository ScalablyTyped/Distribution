package typings.rxjs.webSocketSubjectMod

import typings.rxjs.anon.Instantiable
import typings.rxjs.rxjsStrings.arraybuffer
import typings.rxjs.rxjsStrings.blob
import typings.rxjs.typesMod.NextObserver
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketSubjectConfig[T] extends js.Object {
  /**
    * A WebSocket constructor to use. This is useful for situations like using a
    * WebSocket impl in Node (WebSocket is a DOM API), or for mocking a WebSocket
    * for testing purposes
    */
  var WebSocketCtor: js.UndefOr[Instantiable] = js.native
  /** Sets the `binaryType` property of the underlying WebSocket. */
  var binaryType: js.UndefOr[blob | arraybuffer] = js.native
  /**
    * An Observer than watches when close events occur on the underlying webSocket
    */
  var closeObserver: js.UndefOr[NextObserver[CloseEvent]] = js.native
  /**
    * An Observer that watches when a close is about to occur due to
    * unsubscription.
    */
  var closingObserver: js.UndefOr[NextObserver[Unit]] = js.native
  /**
    * A deserializer used for messages arriving on the socket from the
    * server. Defaults to JSON.parse.
    */
  var deserializer: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.native
  /**
    * An Observer that watches when open events occur on the underlying web socket.
    */
  var openObserver: js.UndefOr[NextObserver[Event]] = js.native
  /** The protocol to use to connect */
  var protocol: js.UndefOr[String | js.Array[String]] = js.native
  /** @deprecated use {@link deserializer} */
  var resultSelector: js.UndefOr[js.Function1[/* e */ MessageEvent, T]] = js.native
  /**
    * A serializer used to create messages from passed values before the
    * messages are sent to the server. Defaults to JSON.stringify.
    */
  var serializer: js.UndefOr[js.Function1[/* value */ T, WebSocketMessage]] = js.native
  /** The url of the socket server to connect to */
  var url: String = js.native
}

object WebSocketSubjectConfig {
  @scala.inline
  def apply[T](url: String): WebSocketSubjectConfig[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketSubjectConfig[T]]
  }
  @scala.inline
  implicit class WebSocketSubjectConfigOps[Self <: WebSocketSubjectConfig[_], T] (val x: Self with WebSocketSubjectConfig[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebSocketCtor(value: Instantiable): Self = this.set("WebSocketCtor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSocketCtor: Self = this.set("WebSocketCtor", js.undefined)
    @scala.inline
    def setBinaryType(value: blob | arraybuffer): Self = this.set("binaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryType: Self = this.set("binaryType", js.undefined)
    @scala.inline
    def setCloseObserver(value: NextObserver[CloseEvent]): Self = this.set("closeObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseObserver: Self = this.set("closeObserver", js.undefined)
    @scala.inline
    def setClosingObserver(value: NextObserver[Unit]): Self = this.set("closingObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosingObserver: Self = this.set("closingObserver", js.undefined)
    @scala.inline
    def setDeserializer(value: /* e */ MessageEvent => T): Self = this.set("deserializer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeserializer: Self = this.set("deserializer", js.undefined)
    @scala.inline
    def setOpenObserver(value: NextObserver[Event]): Self = this.set("openObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenObserver: Self = this.set("openObserver", js.undefined)
    @scala.inline
    def setProtocolVarargs(value: String*): Self = this.set("protocol", js.Array(value :_*))
    @scala.inline
    def setProtocol(value: String | js.Array[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setResultSelector(value: /* e */ MessageEvent => T): Self = this.set("resultSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResultSelector: Self = this.set("resultSelector", js.undefined)
    @scala.inline
    def setSerializer(value: /* value */ T => WebSocketMessage): Self = this.set("serializer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
  }
  
}

