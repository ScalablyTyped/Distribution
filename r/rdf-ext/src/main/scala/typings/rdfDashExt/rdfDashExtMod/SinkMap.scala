package typings.rdfDashExt.rdfDashExtMod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkMap extends /* mediaType */ StringDictionary[Sink[Quad]] {
  def find(mediaType: String): Sink[Quad]
  def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any
  def list(): js.Array[String]
}

object SinkMap {
  @scala.inline
  def apply(
    find: String => Sink[Quad],
    `import`: (String, js.Any, js.Any) => js.Any,
    list: () => js.Array[String],
    StringDictionary: /* mediaType */ StringDictionary[Sink[Quad]] = null
  ): SinkMap = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
    __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SinkMap]
  }
}

