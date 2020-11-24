package typings.streamChain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Stream = typings.node.streamMod.Readable | typings.node.streamMod.Writable | typings.node.streamMod.Duplex | typings.node.streamMod.Transform
  
  type StreamItem = typings.streamChain.mod.Stream | typings.streamChain.mod.TransformFunction
  
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
