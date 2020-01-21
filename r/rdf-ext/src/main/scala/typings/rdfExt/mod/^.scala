package typings.rdfExt.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
class ^ ()
  extends typings.rdfExt.dataFactoryMod.^

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Parsers: SinkMap[typings.node.eventsMod.^, Stream] = js.native
  var Serializers: SinkMap[Stream, typings.node.eventsMod.^] = js.native
  def asEvent(p: js.Any): typings.node.eventsMod.^ = js.native
  def waitFor(event: js.Any): js.Promise[_] = js.native
}

