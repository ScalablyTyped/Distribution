package typings.snykRpmParser

import typings.node.Buffer
import typings.snykRpmParser.rpmTypesMod.IndexEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/rpm/header", JSImport.Namespace)
@js.native
object headerMod extends js.Object {
  def headerImport(data: Buffer): js.Promise[js.Array[IndexEntry]] = js.native
}

