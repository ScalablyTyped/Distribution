package typings.reachUtils

import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/utils", "assignRef")
  @js.native
  def assignRef(): Unit = js.native
  @JSImport("@reach/utils", "assignRef")
  @js.native
  def assignRef(ref: js.UndefOr[Ref[_]], value: ReactNode): Unit = js.native
  @JSImport("@reach/utils", "assignRef")
  @js.native
  def assignRef(ref: Ref[_]): Unit = js.native
  
  @JSImport("@reach/utils", "checkStyles")
  @js.native
  def checkStyles(pkg: String): js.Function0[Unit] = js.native
  
  @JSImport("@reach/utils", "wrapEvent")
  @js.native
  def wrapEvent(handler: js.UndefOr[scala.Nothing], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
  @JSImport("@reach/utils", "wrapEvent")
  @js.native
  def wrapEvent(handler: ReactEventHandler[Element], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
}
