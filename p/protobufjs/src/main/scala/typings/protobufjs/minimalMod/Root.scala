package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typings.protobufjs.protobufjsMod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Root")
@js.native
object Root extends js.Object {
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: INamespace): typings.protobufjs.protobufjsMod.Root = js.native
  def fromJSON(json: INamespace, root: typings.protobufjs.protobufjsMod.Root): typings.protobufjs.protobufjsMod.Root = js.native
}

