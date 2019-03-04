package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQDownloadInfo extends js.Object {
  /**
    * FileSize of the generated QVF
    */
  var qFileSize: scala.Double
  /**
    * URL of the generated QVF
    */
  var qUrl: java.lang.String
}

object IQDownloadInfo {
  @scala.inline
  def apply(qFileSize: scala.Double, qUrl: java.lang.String): IQDownloadInfo = {
    val __obj = js.Dynamic.literal(qFileSize = qFileSize, qUrl = qUrl)
  
    __obj.asInstanceOf[IQDownloadInfo]
  }
}

