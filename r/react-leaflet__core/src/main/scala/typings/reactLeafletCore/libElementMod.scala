package typings.reactLeafletCore

import typings.react.mod.MutableRefObject
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libElementMod {
  
  @JSImport("@react-leaflet/core/lib/element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createElementHook[E, P, C](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]]
  ): js.Function2[/* props */ P, /* context */ LeafletContextInterface, ReturnType[ElementHook[E, P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElementHook")(createElement.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* props */ P, /* context */ LeafletContextInterface, ReturnType[ElementHook[E, P]]]]
  inline def createElementHook[E, P, C](
    createElement: js.Function2[/* props */ P, /* context */ LeafletContextInterface, LeafletElement[E, Any]],
    updateElement: js.Function3[/* instance */ E, /* props */ P, /* prevProps */ P, Unit]
  ): js.Function2[/* props */ P, /* context */ LeafletContextInterface, ReturnType[ElementHook[E, P]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementHook")(createElement.asInstanceOf[js.Any], updateElement.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ P, /* context */ LeafletContextInterface, ReturnType[ElementHook[E, P]]]]
  
  inline def createElementObject[T, C](instance: T, context: LeafletContextInterface): LeafletElement[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementObject")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[LeafletElement[T, C]]
  inline def createElementObject[T, C](instance: T, context: LeafletContextInterface, container: C): LeafletElement[T, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementObject")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[LeafletElement[T, C]]
  
  type ElementHook[E, P] = js.Function2[
    /* props */ P, 
    /* context */ LeafletContextInterface, 
    MutableRefObject[LeafletElement[E, Any]]
  ]
  
  /* Inlined std.Readonly<{  instance :T,   context :@react-leaflet/core.@react-leaflet/core/lib/context.LeafletContextInterface,   container :C | null | undefined}> */
  trait LeafletElement[T, C] extends StObject {
    
    val container: js.UndefOr[C | Null] = js.undefined
    
    val context: LeafletContextInterface
    
    val instance: T
  }
  object LeafletElement {
    
    inline def apply[T, C](context: LeafletContextInterface, instance: T): LeafletElement[T, C] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeafletElement[T, C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeafletElement[?, ?], T, C] (val x: Self & (LeafletElement[T, C])) extends AnyVal {
      
      inline def setContainer(value: C): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContext(value: LeafletContextInterface): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: T): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
