package typings.rbx.mod

import typings.rbx.anon.Active
import typings.rbx.anon.AsElementType
import typings.rbx.anon.NoneTAsComponentextendsElBody
import typings.rbx.anon.PickModalContainerPropsac
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.TypeofModalContainer
import typings.rbx.anon.TypeofModalPortal
import typings.rbx.anon.`7`
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.modalBackgroundMod.ModalBackgroundProps
import typings.rbx.modalCloseMod.ModalCloseProps
import typings.rbx.modalContextMod.ModalContextValue
import typings.rbx.rbxStrings.active
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.children
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.closeOnBlur
import typings.rbx.rbxStrings.closeOnEsc
import typings.rbx.rbxStrings.containerClassName
import typings.rbx.rbxStrings.document
import typings.rbx.rbxStrings.onClose
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx", "Modal")
@js.native
object Modal extends js.Object {
  var Background: ForwardRefAsExoticComponent[ModalBackgroundProps, ElementType[_]] = js.native
  var Card: NoneTAsComponentextendsElBody = js.native
  var Close: ForwardRefAsExoticComponent[ModalCloseProps, ElementType[_]] = js.native
  var Container: TypeofModalContainer = js.native
  var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
  var Context: typings.react.mod.Context[ModalContextValue] = js.native
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var Portal: TypeofModalPortal = js.native
  var defaultProps: AsElementType with (Partial[PickModalContainerPropsac with (Pick[_, String | Double | js.Symbol])]) = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: Active = js.native
  def apply[TAsComponent /* <: ElementType[_] */](
    props: `7`[TAsComponent] with PickModalContainerPropsac with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = js.native
}

