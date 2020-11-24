package typings.servicenowLondon.global_

import org.scalablytyped.runtime.TopLevel
import typings.servicenowLondon.ScopedGlideRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GlideRecord")
@js.native
class GlideRecord protected () extends ScopedGlideRecord {
  /**
    * Creates an instance of the GlideRecord class for the specified table.
    *
    * @param tableName The table to be used.
    * @example
    *
    * var gr = new GlideRecord('incident');
    */
  def this(tableName: String) = this()
}
@JSGlobal("GlideRecord")
@js.native
object GlideRecord extends TopLevel[ScopedGlideRecord]
