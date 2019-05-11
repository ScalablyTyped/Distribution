package typings
package protobufjsLib.lightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends protobufjsLib.protobufjsMod.Root {
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/light", "Root")
@js.native
object Root extends js.Object {
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: protobufjsLib.protobufjsMod.INamespace): protobufjsLib.protobufjsMod.Root = js.native
  def fromJSON(json: protobufjsLib.protobufjsMod.INamespace, root: protobufjsLib.protobufjsMod.Root): protobufjsLib.protobufjsMod.Root = js.native
}

