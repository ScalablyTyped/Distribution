package typings.react.mod

import typings.std.Element
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
  // Custom components
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
}

