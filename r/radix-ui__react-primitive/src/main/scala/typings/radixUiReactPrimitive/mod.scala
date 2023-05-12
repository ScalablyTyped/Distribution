package typings.radixUiReactPrimitive

import typings.radixUiReactPrimitive.anon.AsChild
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@radix-ui/react-primitive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@radix-ui/react-primitive", "Primitive")
  @js.native
  val Primitive: Primitives = js.native
  
  @JSImport("@radix-ui/react-primitive", "Root")
  @js.native
  val Root: Primitives = js.native
  
  inline def dispatchDiscreteCustomEvent_target[E /* <: CustomEvent[Any] */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: E['target'] */ js.Any,
    event: E
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchDiscreteCustomEvent")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ComponentPropsWithoutRef[T /* <: ElementType[Any] */] = PropsWithoutRef[ComponentProps[T]]
  
  type PrimitiveForwardRefComponent[E /* <: ElementType[Any] */] = ForwardRefExoticComponent[PrimitivePropsWithRef[E]]
  
  type PrimitivePropsWithRef[E /* <: ElementType[Any] */] = ComponentPropsWithRef[E] & AsChild
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ E in 'a' | 'button' | 'div' | 'form' | 'h2' | 'h3' | 'img' | 'input' | 'label' | 'li' | 'nav' | 'ol' | 'p' | 'span' | 'svg' | 'ul' ]: @radix-ui/react-primitive.@radix-ui/react-primitive.PrimitiveForwardRefComponent<E>}
    }}}
    */
  @js.native
  trait Primitives extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends any ? 'ref' extends keyof P ? std.Pick<P, std.Exclude<keyof P, 'ref'>> : P : P
    }}}
    */
  type PropsWithoutRef[P] = P
}
