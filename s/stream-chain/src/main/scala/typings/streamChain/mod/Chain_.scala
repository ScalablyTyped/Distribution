package typings.streamChain.mod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chain_ extends Duplex {
  
  var input: Stream = js.native
  
  var output: Stream = js.native
  
  var streams: js.Array[Stream] = js.native
}
