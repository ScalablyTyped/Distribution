package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets the instance type for a React element. The instance will be different for various component types:
  *
  * - React class components will be the class instance. So if you had `class Foo extends React.Component<{}> {}`
  *   and used `React.ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
  * - React stateless functional components do not have a backing instance and so `React.ElementRef<typeof Bar>`
  *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
  * - JSX intrinsics like `div` will give you their DOM instance. For `React.ElementRef<'div'>` that would be
  *   `HTMLDivElement`. For `React.ElementRef<'input'>` that would be `HTMLInputElement`.
  * - React stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
  *   to component.
  *
  * `C` must be the type _of_ a React component so you need to use typeof as in `React.ElementRef<typeof MyComponent>`.
  *
  * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
  *       `React.forwardRef()` returns.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  'ref' extends keyof react.react.ComponentPropsWithRef<C> ? std.NonNullable<react.react.ComponentPropsWithRef<C>['ref']> extends react.react.Ref<infer Instance> ? Instance : never : never
  }}}
  */
@js.native
trait ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.react.mod.ForwardRefExoticComponent[scala.Any], typings.react.anon.Instantiable, js.Function2[
/ * props * / scala.Any, 
/ * context * / js.UndefOr[scala.Any], 
typings.react.mod.ReactElement | scala.Null] */ Any */] extends StObject
