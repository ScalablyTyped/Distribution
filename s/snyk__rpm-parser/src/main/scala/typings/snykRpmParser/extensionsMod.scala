package typings.snykRpmParser

import typings.snykRpmParser.rpmTypesMod.IndexEntry
import typings.snykRpmParser.rpmTypesMod.PackageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/rpm/extensions", JSImport.Namespace)
@js.native
object extensionsMod extends js.Object {
  def getPackageInfo(entries: js.Array[IndexEntry]): js.Promise[js.UndefOr[PackageInfo]] = js.native
}

