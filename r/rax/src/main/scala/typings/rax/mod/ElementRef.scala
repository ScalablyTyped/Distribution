package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets the instance type for a Rax element. The instance will be different for various component types:
  *
  * - Rax class components will be the class instance. So if you had `class Foo extends Component<{}> {}`
  *   and used `ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
  * - Rax stateless functional components do not have a backing instance and so `ElementRef<typeof Bar>`
  *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
  * - JSX intrinsics like `div` will give you their DOM instance. For `ElementRef<'div'>` that would be
  *   `HTMLDivElement`. For `ElementRef<'input'>` that would be `HTMLInputElement`.
  * - Rax stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
  *   to component.
  *
  * `C` must be the type _of_ a Rax component so you need to use typeof as in `ElementRef<typeof MyComponent>`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  'ref' extends keyof rax.rax.ComponentPropsWithRef<C> ? std.NonNullable<rax.rax.ComponentPropsWithRef<C>['ref']> extends rax.rax.Ref<infer Instance> ? Instance : never : never
  }}}
  */
@js.native
trait ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 219, starting with typings.rax.mod.ForwardRefExoticComponent[scala.Any], typings.rax.anon.Instantiable, js.Function2[
/ * props * / scala.Any, 
/ * context * / js.UndefOr[scala.Any], 
(typings.rax.mod.RaxElement[scala.Any, java.lang.String | typings.rax.mod.JSXElementConstructor[scala.Any]]) | scala.Null] */ Any */] extends StObject
