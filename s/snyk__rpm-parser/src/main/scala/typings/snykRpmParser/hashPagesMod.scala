package typings.snykRpmParser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/berkeleydb/hash-pages", JSImport.Namespace)
@js.native
object hashPagesMod extends js.Object {
  def bufferToHashValueContent(berkeleydb: Buffer, page: Buffer, pageStartOffset: Double, pageSizeBytes: Double): Buffer = js.native
}

