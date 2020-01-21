package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMDE extends js.Object {
  var codemirror: js.Any = js.native
  def clearAutosavedValue(): Unit = js.native
  def isFullscreenActive(): Boolean = js.native
  def isPreviewActive(): Boolean = js.native
  def isSideBySideActive(): Boolean = js.native
  def toTextArea(): Unit = js.native
  def value(): String = js.native
  def value(`val`: String): Unit = js.native
}

