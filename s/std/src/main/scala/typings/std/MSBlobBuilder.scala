package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSBlobBuilder extends js.Object {
  def append(data: js.Any): Unit = js.native
  def append(data: js.Any, endings: java.lang.String): Unit = js.native
  def getBlob(): Blob = js.native
  def getBlob(contentType: java.lang.String): Blob = js.native
}

