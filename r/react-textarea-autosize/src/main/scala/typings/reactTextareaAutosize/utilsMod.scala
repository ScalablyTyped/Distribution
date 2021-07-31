package typings.reactTextareaAutosize

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def pick[Obj /* <: StringDictionary[js.Any] */, Key /* <: /* keyof Obj */ String */](props: js.Array[Key], obj: Obj): Pick[Obj, Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(props.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Pick[Obj, Key]]
}
