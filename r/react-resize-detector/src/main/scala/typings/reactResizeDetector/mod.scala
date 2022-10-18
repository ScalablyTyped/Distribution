package typings.reactResizeDetector

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactResizeDetector.buildResizeDetectorMod.ComponentsProps
import typings.reactResizeDetector.buildUseResizeDetectorMod.FunctionProps
import typings.reactResizeDetector.buildUseResizeDetectorMod.UseResizeDetectorReturn
import typings.reactResizeDetector.buildWithResizeDetectorMod.OptionalKey
import typings.reactResizeDetector.buildWithResizeDetectorMod.Without
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.targetRef
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resize-detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  open class default[ElementT /* <: HTMLElement */] protected ()
    extends typings.reactResizeDetector.buildResizeDetectorMod.default[ElementT] {
    def this(props: ComponentsProps[ElementT]) = this()
  }
  
  inline def useResizeDetector[T](): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeDetector")().asInstanceOf[UseResizeDetectorReturn[T]]
  inline def useResizeDetector[T](props: FunctionProps): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeDetector")(props.asInstanceOf[js.Any]).asInstanceOf[UseResizeDetectorReturn[T]]
  
  inline def withResizeDetector[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(ComponentInner.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
  inline def withResizeDetector[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P], options: ComponentsProps[ElementT]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(ComponentInner.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
}
