package typings.reactTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("React", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("React", "Component")
  @js.native
  class Component protected () extends StObject {
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
  object Component {
    
    @JSImport("React", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("React", "Component.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("React", "PropTypes")
  @js.native
  def PropTypes: js.Any = js.native
  @scala.inline
  def PropTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropTypes")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def createElement(tag: js.Any, props: js.Any, children: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def createElement(tag: js.Any, props: Unit, children: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def findDOMNode(instance: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def render(element: js.Any, container: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unmountComponentAtNode(container: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
