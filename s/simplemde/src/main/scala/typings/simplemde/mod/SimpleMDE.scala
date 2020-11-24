package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleMDE extends js.Object {
  
  def clearAutosavedValue(): Unit = js.native
  
  var codemirror: js.Any = js.native
  
  def isFullscreenActive(): Boolean = js.native
  
  def isPreviewActive(): Boolean = js.native
  
  def isSideBySideActive(): Boolean = js.native
  
  def toTextArea(): Unit = js.native
  
  def value(): String = js.native
  def value(`val`: String): Unit = js.native
}
