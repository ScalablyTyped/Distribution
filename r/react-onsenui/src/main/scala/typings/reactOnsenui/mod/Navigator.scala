package typings.reactOnsenui.mod

import typings.reactOnsenui.anon.HTMLAttributesidclassName
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-onsenui", "Navigator")
@js.native
class Navigator protected ()
  extends Component[typings.reactOnsenui.anon.AnimationOptions, js.Any] {
  def this(props: HTMLAttributesidclassName & typings.reactOnsenui.anon.AnimationOptions) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: HTMLAttributesidclassName & typings.reactOnsenui.anon.AnimationOptions, context: js.Any) = this()
  
  var pages: js.Array[js.Any] = js.native
  
  def popPage(): js.Promise[HTMLElement] = js.native
  def popPage(options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def pushPage(route: js.Any): js.Promise[HTMLElement] = js.native
  def pushPage(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPage(route: js.Any): js.Promise[HTMLElement] = js.native
  def resetPage(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  def resetPageStack(route: js.Any): js.Promise[HTMLElement] = js.native
  def resetPageStack(route: js.Any, options: PageTransitionOptions): js.Promise[HTMLElement] = js.native
  
  var routes: js.Array[js.Any] = js.native
}
