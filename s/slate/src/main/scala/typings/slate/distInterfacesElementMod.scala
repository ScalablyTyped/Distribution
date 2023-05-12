package typings.slate

import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distTypesCustomTypesMod.ExtendedType
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesElementMod {
  
  @JSImport("slate/dist/interfaces/element", "Element")
  @js.native
  val Element: ElementInterface = js.native
  type Element = ExtendedType[typings.slate.slateStrings.Element, BaseElement]
  
  trait BaseElement extends StObject {
    
    var children: js.Array[Descendant]
  }
  object BaseElement {
    
    inline def apply(children: js.Array[Descendant]): BaseElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseElement] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Descendant]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Descendant*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  type ElementEntry = js.Tuple2[typings.slate.distInterfacesElementMod.Element, Path]
  
  @js.native
  trait ElementInterface extends StObject {
    
    /**
      * Check if a value implements the 'Ancestor' interface.
      */
    def isAncestor(value: Any): /* is slate.slate/dist/interfaces/node.Ancestor */ Boolean = js.native
    
    /**
      * Check if a value implements the `Element` interface.
      */
    def isElement(value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
    
    /**
      * Check if a value is an array of `Element` objects.
      */
    def isElementList(value: Any): /* is std.Array<slate.slate/dist/interfaces/element.Element> */ Boolean = js.native
    
    /**
      * Check if a set of props is a partial of Element.
      */
    def isElementProps(props: Any): /* is std.Partial<slate.slate/dist/interfaces/element.Element> */ Boolean = js.native
    
    /**
      * Check if a value implements the `Element` interface and has elementKey with selected value.
      * Default it check to `type` key value
      */
    def isElementType[T /* <: typings.slate.distInterfacesElementMod.Element */](value: Any, elementVal: String): /* is T */ Boolean = js.native
    def isElementType[T /* <: typings.slate.distInterfacesElementMod.Element */](value: Any, elementVal: String, elementKey: String): /* is T */ Boolean = js.native
    
    /**
      * Check if an element matches set of properties.
      *
      * Note: this checks custom properties, and it does not ensure that any
      * children are equivalent.
      */
    def matches(
      element: typings.slate.distInterfacesElementMod.Element,
      props: Partial[typings.slate.distInterfacesElementMod.Element]
    ): Boolean = js.native
  }
}
