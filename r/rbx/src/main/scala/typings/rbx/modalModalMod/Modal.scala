package typings.rbx.modalModalMod

import typings.rbx.Anon7
import typings.rbx.AnonActive
import typings.rbx.AnonAsElementType
import typings.rbx.NoneTAsComponentextendsElBody
import typings.rbx.PickModalContainerPropsac
import typings.rbx.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.TypeofModalContainer
import typings.rbx.TypeofModalPortal
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
import typings.react.mod._Global_.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/components/modal/modal", "Modal")
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
  var defaultProps: AnonAsElementType with (Partial[PickModalContainerPropsac with (Pick[_, String | Double | js.Symbol])]) = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: AnonActive = js.native
  def apply[TAsComponent /* <: ElementType[_] */](
    props: Anon7[TAsComponent] with PickModalContainerPropsac with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = js.native
}

