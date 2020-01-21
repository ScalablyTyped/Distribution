package typings.reactCsv

import typings.react.mod.Component
import typings.reactCsv.downloadMod.DownloadPropTypes
import typings.reactCsv.linkMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CSVDownload ()
    extends Component[DownloadPropTypes, js.Object, js.Any]
  
  @js.native
  class CSVLink ()
    extends Component[LinkProps, js.Object, js.Any]
  
}

