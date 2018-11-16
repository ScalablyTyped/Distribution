package typings
package sharepointLib.SPNs.DocumentSetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DocumentSet.DocumentSet")
@js.native
class DocumentSet ()
  extends sharepointLib.SPNs.ClientObject

@JSGlobal("SP.DocumentSet.DocumentSet")
@js.native
object DocumentSet extends js.Object {
  def create(
    context: sharepointLib.SPNs.ClientContext,
    parentFolder: sharepointLib.SPNs.Folder,
    name: java.lang.String,
    ctid: sharepointLib.SPNs.ContentTypeId
  ): sharepointLib.SPNs.StringResult = js.native
}

