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
  open class Component protected () extends StObject {
    def this(props: Any, context: Any) = this()
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: Any): Unit = js.native
    
    var props: Any = js.native
    
    def setState(partial: Any): Unit = js.native
    def setState(partial: Any, callback: Any): Unit = js.native
    
    var state: Any = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("React", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("React", "Component.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("React", "PropTypes")
  @js.native
  def PropTypes: Any = js.native
  inline def PropTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropTypes")(x.asInstanceOf[js.Any])
  
  inline def createElement(tag: Any, props: Any, children: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def createElement(tag: Any, props: Unit, children: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def findDOMNode(instance: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def render(element: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unmountComponentAtNode(container: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
