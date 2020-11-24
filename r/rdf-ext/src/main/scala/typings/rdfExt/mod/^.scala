package typings.rdfExt.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext", JSImport.Namespace)
@js.native
class ^ ()
  extends typings.rdfExt.dataFactoryMod.^
@JSImport("rdf-ext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var Parsers: SinkMap[EventEmitter, Stream] = js.native
  
  var Serializers: SinkMap[Stream, EventEmitter] = js.native
  
  def asEvent(p: js.Any): EventEmitter = js.native
  
  def waitFor(event: js.Any): js.Promise[_] = js.native
}
