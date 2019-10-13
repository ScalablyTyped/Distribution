package typings.reactDashCsv

import typings.react.reactMod.Component
import typings.reactDashCsv.componentsDownloadMod.DownloadPropTypes
import typings.reactDashCsv.componentsLinkMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-csv", JSImport.Namespace)
@js.native
object reactDashCsvMod extends js.Object {
  @js.native
  class CSVDownload ()
    extends Component[DownloadPropTypes, js.Object, js.Any]
  
  @js.native
  class CSVLink ()
    extends Component[LinkProps, js.Object, js.Any]
  
}

