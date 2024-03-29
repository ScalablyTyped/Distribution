package typings.reactOnsenui.mod

import typings.reactOnsenui.anon.HTMLAttributesidclassName
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-onsenui", "Navigator")
@js.native
open class Navigator protected ()
  extends Component[typings.reactOnsenui.anon.AnimationOptions, Any] {
  def this(props: HTMLAttributesidclassName & typings.reactOnsenui.anon.AnimationOptions) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: HTMLAttributesidclassName & typings.reactOnsenui.anon.AnimationOptions, context: Any) = this()
  
  var pages: js.Array[Any] = js.native
  
  def popPage(): js.Promise[HTMLElement] = js.native
  def popPage(options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def pushPage(route: Any): js.Promise[HTMLElement] = js.native
  def pushPage(route: Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPage(route: Any): js.Promise[HTMLElement] = js.native
  def resetPage(route: Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPageStack(route: Any): js.Promise[HTMLElement] = js.native
  def resetPageStack(route: Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  var routes: js.Array[Any] = js.native
}
