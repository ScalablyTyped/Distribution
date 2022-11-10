package typings.reachDescendants

import typings.reachDescendants.anon.Callback
import typings.reachDescendants.anon.Children
import typings.reachDescendants.reachDescendantsStrings.index
import typings.react.mod.Context
import typings.react.mod.Dispatch
import typings.react.mod.KeyboardEvent
import typings.react.mod.SetStateAction
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/descendants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DescendantProvider[DescendantType /* <: Descendant[HTMLElement] */](param0: Children[DescendantType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DescendantProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createDescendantContext[DescendantType /* <: Descendant[HTMLElement] */](name: String): Context[DescendantContextValue[DescendantType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescendantContext")(name.asInstanceOf[js.Any]).asInstanceOf[Context[DescendantContextValue[DescendantType]]]
  inline def createDescendantContext[DescendantType /* <: Descendant[HTMLElement] */](name: String, initialValue: js.Object): Context[DescendantContextValue[DescendantType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDescendantContext")(name.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Context[DescendantContextValue[DescendantType]]]
  
  /**
    * Testing this as an abstraction for compound components that use keyboard
    * navigation. Hoping this will help us prevent bugs and mismatched behavior
    * across various components, but it may also prove to be too messy of an
    * abstraction in the end.
    *
    * Currently used in:
    *   - Tabs
    *   - Accordion
    *
    * @param context
    * @param options
    */
  inline def useDescendantKeyDown[DescendantType /* <: Descendant[HTMLElement] */, K /* <: /* keyof DescendantType */ String */](context: Context[DescendantContextValue[DescendantType]], options: Callback[K, DescendantType]): js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDescendantKeyDown")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]]
  
  /**
    * This hook registers our descendant by passing it into an array. We can then
    * search that array by to find its index when registering it in the component.
    * We use this for focus management, keyboard navigation, and typeahead
    * functionality for some components.
    *
    * The hook accepts the element node and (optionally) a key. The key is useful
    * if multiple descendants have identical text values and we need to
    * differentiate siblings for some reason.
    *
    * Our main goals with this are:
    *   1) maximum composability,
    *   2) minimal API friction
    *   3) SSR compatibility*
    *   4) concurrent safe
    *   5) index always up-to-date with the tree despite changes
    *   6) works with memoization of any component in the tree (hopefully)
    *
    * As for SSR, the good news is that we don't actually need the index on the
    * server for most use-cases, as we are only using it to determine the order of
    * composed descendants for keyboard navigation. However, in the few cases where
    * this is not the case, we can require an explicit index from the app.
    */
  inline def useDescendant_index[DescendantType /* <: Descendant[HTMLElement] */](descendant: Omit[DescendantType, index], context: Context[DescendantContextValue[DescendantType]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useDescendant")(descendant.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useDescendant_index[DescendantType /* <: Descendant[HTMLElement] */](
    descendant: Omit[DescendantType, index],
    context: Context[DescendantContextValue[DescendantType]],
    indexProp: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useDescendant")(descendant.asInstanceOf[js.Any], context.asInstanceOf[js.Any], indexProp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useDescendants[DescendantType /* <: Descendant[HTMLElement] */](ctx: Context[DescendantContextValue[DescendantType]]): js.Array[DescendantType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDescendants")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Array[DescendantType]]
  
  inline def useDescendantsInit[DescendantType /* <: Descendant[HTMLElement] */](): js.Tuple2[js.Array[DescendantType], Dispatch[SetStateAction[js.Array[DescendantType]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDescendantsInit")().asInstanceOf[js.Tuple2[js.Array[DescendantType], Dispatch[SetStateAction[js.Array[DescendantType]]]]]
  
  trait Descendant[ElementType] extends StObject {
    
    var element: SomeElement[ElementType] | Null
    
    var index: Double
  }
  object Descendant {
    
    inline def apply[ElementType](index: Double): Descendant[ElementType] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[Descendant[ElementType]]
    }
    
    extension [Self <: Descendant[?], ElementType](x: Self & Descendant[ElementType]) {
      
      inline def setElement(value: SomeElement[ElementType]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescendantContextValue[DescendantType /* <: Descendant[HTMLElement] */] extends StObject {
    
    var descendants: js.Array[DescendantType]
    
    def registerDescendant(descendant: DescendantType): js.Function0[Unit]
  }
  object DescendantContextValue {
    
    inline def apply[DescendantType /* <: Descendant[HTMLElement] */](descendants: js.Array[DescendantType], registerDescendant: DescendantType => js.Function0[Unit]): DescendantContextValue[DescendantType] = {
      val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], registerDescendant = js.Any.fromFunction1(registerDescendant))
      __obj.asInstanceOf[DescendantContextValue[DescendantType]]
    }
    
    extension [Self <: DescendantContextValue[?], DescendantType /* <: Descendant[HTMLElement] */](x: Self & DescendantContextValue[DescendantType]) {
      
      inline def setDescendants(value: js.Array[DescendantType]): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
      
      inline def setDescendantsVarargs(value: DescendantType*): Self = StObject.set(x, "descendants", js.Array(value*))
      
      inline def setRegisterDescendant(value: DescendantType => js.Function0[Unit]): Self = StObject.set(x, "registerDescendant", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Element ? T : std.HTMLElement
    }}}
    */
  type SomeElement[T] = T
}
