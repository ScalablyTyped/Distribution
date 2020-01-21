package typings.rdfExt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkMap[InputStream /* <: typings.node.eventsMod.^ */, OutputStream /* <: typings.node.eventsMod.^ */] extends /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
  def find(mediaType: String): Sink[InputStream, OutputStream]
  def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any
  def list(): js.Array[String]
}

object SinkMap {
  @scala.inline
  def apply[InputStream /* <: typings.node.eventsMod.^ */, OutputStream /* <: typings.node.eventsMod.^ */](
    find: String => Sink[InputStream, OutputStream],
    `import`: (String, js.Any, js.Any) => js.Any,
    list: () => js.Array[String],
    StringDictionary: /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] = null
  ): SinkMap[InputStream, OutputStream] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
    __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
  }
}

