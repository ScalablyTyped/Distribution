package typings
package sourceDashListDashMapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mappings extends js.Object {
  var mappings: java.lang.String
  var sources: js.Array[
    java.lang.String | sourceDashListDashMapLib.sourceDashListDashMapMod.SourceNode | sourceDashListDashMapLib.sourceDashListDashMapMod.CodeNode
  ]
  var sourcesContent: js.Array[java.lang.String]
}

object Anon_Mappings {
  @scala.inline
  def apply(
    mappings: java.lang.String,
    sources: js.Array[
      java.lang.String | sourceDashListDashMapLib.sourceDashListDashMapMod.SourceNode | sourceDashListDashMapLib.sourceDashListDashMapMod.CodeNode
    ],
    sourcesContent: js.Array[java.lang.String]
  ): Anon_Mappings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappings")(mappings)
    __obj.updateDynamic("sources")(sources)
    __obj.updateDynamic("sourcesContent")(sourcesContent)
    __obj.asInstanceOf[Anon_Mappings]
  }
}

