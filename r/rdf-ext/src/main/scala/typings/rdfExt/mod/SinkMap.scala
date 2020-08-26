package typings.rdfExt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
  def find(mediaType: String): Sink[InputStream, OutputStream] = js.native
  def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any = js.native
  def list(): js.Array[String] = js.native
}

object SinkMap {
  @scala.inline
  def apply[/* <: typings.node.eventsMod.EventEmitter */ InputStream, /* <: typings.node.eventsMod.EventEmitter */ OutputStream](
    find: String => Sink[InputStream, OutputStream],
    `import`: (String, js.Any, js.Any) => js.Any,
    list: () => js.Array[String]
  ): SinkMap[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
    __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
    __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
  }
  @scala.inline
  implicit class SinkMapOps[Self <: SinkMap[_, _], /* <: typings.node.eventsMod.EventEmitter */ InputStream, /* <: typings.node.eventsMod.EventEmitter */ OutputStream] (val x: Self with (SinkMap[InputStream, OutputStream])) extends AnyVal {
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
    def setFind(value: String => Sink[InputStream, OutputStream]): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setImport(value: (String, js.Any, js.Any) => js.Any): Self = this.set("import", js.Any.fromFunction3(value))
    @scala.inline
    def setList(value: () => js.Array[String]): Self = this.set("list", js.Any.fromFunction0(value))
  }
  
}

