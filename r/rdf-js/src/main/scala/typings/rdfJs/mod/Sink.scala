package typings.rdfJs.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends js.Object {
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def `import`(stream: InputStream): OutputStream = js.native
}

object Sink {
  @scala.inline
  def apply[/* <: typings.node.eventsMod.EventEmitter */ InputStream, /* <: typings.node.eventsMod.EventEmitter */ OutputStream](`import`: InputStream => OutputStream): Sink[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Sink[InputStream, OutputStream]]
  }
  @scala.inline
  implicit class SinkOps[Self <: Sink[_, _], /* <: typings.node.eventsMod.EventEmitter */ InputStream, /* <: typings.node.eventsMod.EventEmitter */ OutputStream] (val x: Self with (Sink[InputStream, OutputStream])) extends AnyVal {
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
    def setImport(value: InputStream => OutputStream): Self = this.set("import", js.Any.fromFunction1(value))
  }
  
}

