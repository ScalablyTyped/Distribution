package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRootArgument extends ReaderArgumentDefinition {
  val kind: java.lang.String
   // 'RootArgument';
  val name: java.lang.String
  val `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ReaderRootArgument {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, `type`: java.lang.String = null): ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderRootArgument]
  }
}

