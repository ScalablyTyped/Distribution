package typings.reactTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("React", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var PropTypes: js.Any = js.native
  
  def createElement(tag: js.Any, props: js.UndefOr[scala.Nothing], children: js.Any*): js.Any = js.native
  def createElement(tag: js.Any, props: js.Any, children: js.Any*): js.Any = js.native
  
  def findDOMNode(instance: js.Any): js.Any = js.native
  
  def render(element: js.Any, container: js.Any): js.Any = js.native
  
  def unmountComponentAtNode(container: js.Any): Unit = js.native
  
  @js.native
  class Component protected () extends js.Object {
    def this(props: js.Any, context: js.Any) = this()
    
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Any): Unit = js.native
    
    var props: js.Any = js.native
    
    def setState(partial: js.Any): Unit = js.native
    def setState(partial: js.Any, callback: js.Any): Unit = js.native
    
    var state: js.Any = js.native
  }
  /* static members */
  @js.native
  object Component extends js.Object {
    
    var name: String = js.native
  }
}
