package typings
package simplemdeLib.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMDE extends js.Object {
  var codemirror: js.Any = js.native
  def clearAutosavedValue(): scala.Unit = js.native
  def isFullscreenActive(): scala.Boolean = js.native
  def isPreviewActive(): scala.Boolean = js.native
  def isSideBySideActive(): scala.Boolean = js.native
  def toTextArea(): scala.Unit = js.native
  def value(): java.lang.String = js.native
  def value(`val`: java.lang.String): scala.Unit = js.native
}

