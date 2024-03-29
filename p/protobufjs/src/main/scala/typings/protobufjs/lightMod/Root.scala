package typings.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/light", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
open class Root ()
  extends typings.protobufjs.mod.Root {
  def this(options: StringDictionary[Any]) = this()
}
/* static members */
object Root {
  
  @JSImport("protobufjs/light", "Root")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  inline def fromJSON(json: INamespace): typings.protobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Root]
  inline def fromJSON(json: INamespace, root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Root]
}
