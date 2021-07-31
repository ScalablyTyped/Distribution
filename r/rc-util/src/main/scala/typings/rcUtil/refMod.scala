package typings.rcUtil

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refMod {
  
  @JSImport("rc-util/lib/ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def composeRef[T](refs: Ref[T]*): Ref[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeRef")(refs.asInstanceOf[js.Any]).asInstanceOf[Ref[T]]
  
  @scala.inline
  def fillRef[T](ref: Ref[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def supportRef(nodeOrComponent: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportRef")(nodeOrComponent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
