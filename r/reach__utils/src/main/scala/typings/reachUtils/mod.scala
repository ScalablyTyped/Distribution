package typings.reachUtils

import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assignRef(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")().asInstanceOf[Unit]
  @scala.inline
  def assignRef(ref: Unit, value: ReactNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assignRef(ref: Ref[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def assignRef(ref: Ref[js.Any], value: ReactNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkStyles(pkg: String): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkStyles")(pkg.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def wrapEvent(handler: Unit, cb: ReactEventHandler[Element]): ReactEventHandler[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEvent")(handler.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ReactEventHandler[Element]]
  @scala.inline
  def wrapEvent(handler: ReactEventHandler[Element], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEvent")(handler.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ReactEventHandler[Element]]
}
