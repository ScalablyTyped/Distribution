package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/build/package/modules/attributes", JSImport.Namespace)
@js.native
object attributesMod extends js.Object {
  val attributesModule: Module = js.native
  type Attrs = Record[String, String | Double | Boolean]
}

