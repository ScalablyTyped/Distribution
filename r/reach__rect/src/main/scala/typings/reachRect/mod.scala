package typings.reachRect

import typings.reachRect.srcMod.PRect
import typings.reachRect.srcMod.RectProps
import typings.reachRect.srcMod.UseRectOptions
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.DOMRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Rect
    *
    * @param props
    */
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  val default: FC[RectProps] = js.native
  
  /**
    * Rect
    *
    * @param props
    */
  @JSImport("@reach/rect", "Rect")
  @js.native
  val Rect: FC[RectProps] = js.native
  
  inline def useRect[T /* <: Element */](nodeRef: RefObject[js.UndefOr[Null | T]]): Null | DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any]).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](nodeRef: RefObject[js.UndefOr[T | Null]], observe: js.UndefOr[Boolean]): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](
    nodeRef: RefObject[js.UndefOr[T | Null]],
    observe: js.UndefOr[Boolean],
    onChange: js.UndefOr[js.Function1[/* rect */ PRect, Unit]]
  ): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](
    nodeRef: RefObject[js.UndefOr[T | Null]],
    observe: Unit,
    onChange: js.UndefOr[js.Function1[/* rect */ PRect, Unit]]
  ): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](nodeRef: RefObject[js.UndefOr[T | Null]], options: UseRectOptions): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
}
