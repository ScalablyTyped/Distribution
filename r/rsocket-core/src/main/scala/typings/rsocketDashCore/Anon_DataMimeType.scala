package typings.rsocketDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMimeType extends js.Object {
  var dataMimeType: String
  var keepAlive: Double
  var lifetime: Double
  var metadataMimeType: String
}

object Anon_DataMimeType {
  @scala.inline
  def apply(dataMimeType: String, keepAlive: Double, lifetime: Double, metadataMimeType: String): Anon_DataMimeType = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType, keepAlive = keepAlive, lifetime = lifetime, metadataMimeType = metadataMimeType)
  
    __obj.asInstanceOf[Anon_DataMimeType]
  }
}

