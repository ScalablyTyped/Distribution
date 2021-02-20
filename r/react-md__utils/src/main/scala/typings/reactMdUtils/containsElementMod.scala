package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsElementMod {
  
  @JSImport("@react-md/utils/types/containsElement", "containsElement")
  @js.native
  def containsElement(container: CheckableThing, child: CheckableThing): Boolean = js.native
  
  type CheckableElement = HTMLElement | Null
  
  type CheckableThing = CheckableElement | MutableRefObject[CheckableElement]
}
