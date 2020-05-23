package typings.snykRpmParser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/berkeleydb", JSImport.Namespace)
@js.native
object berkeleydbMod extends js.Object {
  def bufferToHashDbValues(data: Buffer): js.Promise[js.Array[Buffer] | scala.Nothing] = js.native
  def bufferToHashIndexValues(page: Buffer, entries: Double): js.Array[Double] = js.native
  def bufferToHashValueContent(berkeleydb: Buffer, page: Buffer, pageStartOffset: Double, pageSizeBytes: Double): Buffer = js.native
  def validateBerkeleyDbMetadata(data: Buffer): Unit | scala.Nothing = js.native
  def validatePageSize(pageSize: Double): Unit | scala.Nothing = js.native
}

