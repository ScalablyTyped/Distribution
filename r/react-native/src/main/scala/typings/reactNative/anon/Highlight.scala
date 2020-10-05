package typings.reactNative.anon

import typings.reactNative.reactNativeStrings.leading
import typings.reactNative.reactNativeStrings.trailing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlight extends js.Object {
  def highlight(): Unit = js.native
  def unhighlight(): Unit = js.native
  @JSName("updateProps")
  def updateProps_leading(select: leading, newProps: js.Any): Unit = js.native
  @JSName("updateProps")
  def updateProps_trailing(select: trailing, newProps: js.Any): Unit = js.native
}

