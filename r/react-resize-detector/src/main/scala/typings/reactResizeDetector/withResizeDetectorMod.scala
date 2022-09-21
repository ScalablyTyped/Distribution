package typings.reactResizeDetector

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.targetRef
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import typings.reactResizeDetector.resizeDetectorMod.ComponentsProps
import typings.std.HTMLElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withResizeDetectorMod {
  
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
  
  type OptionalKey[T, Key] = T | ((Omit[T, Key]) & typings.reactResizeDetector.reactResizeDetectorStrings.OptionalKey & TopLevel[T])
  
  type Without[T, Key] = T | (Omit[T, Key])
}
