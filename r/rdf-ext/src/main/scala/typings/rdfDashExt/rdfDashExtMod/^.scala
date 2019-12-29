package typings.rdfDashExt.rdfDashExtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
class ^ ()
  extends typings.rdfDashExt.libDataFactoryMod.^

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Parsers: SinkMap = js.native
  var Serializers: SinkMap = js.native
  def asEvent(p: js.Any): typings.node.eventsMod.^ = js.native
  def waitFor(event: js.Any): js.Promise[_] = js.native
}

