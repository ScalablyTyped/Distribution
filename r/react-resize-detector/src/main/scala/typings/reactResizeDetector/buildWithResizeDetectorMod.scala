package typings.reactResizeDetector

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactResizeDetector.buildResizeDetectorMod.ComponentsProps
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.targetRef
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWithResizeDetectorMod {
  
  @JSImport("react-resize-detector/build/withResizeDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComponentInner.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
  inline def default[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P], options: ComponentsProps[ElementT]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComponentInner.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Key extends keyof T ? std.Omit<T, Key> & {[ K in Key ]:? T[K]} : T
    }}}
    */
  type OptionalKey[T, Key] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Key extends keyof T ? std.Omit<T, Key> : T
    }}}
    */
  type Without[T, Key] = T
}
