package typings.reactAriaInteractions.mod

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.reactAriaInteractions.anon.IsTextInput
import typings.reactAriaInteractions.mod.^
import typings.reactTypesShared.srcDomMod.FocusableElement
import typings.reactTypesShared.srcEventsMod.MoveEvents
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def PressResponder: ForwardRefExoticComponent[PressResponderProps & RefAttributes[FocusableElement]] = ^.asInstanceOf[js.Dynamic].selectDynamic("PressResponder").asInstanceOf[ForwardRefExoticComponent[PressResponderProps & RefAttributes[FocusableElement]]]

inline def Pressable: ForwardRefExoticComponent[PressableProps & RefAttributes[Element]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Pressable").asInstanceOf[ForwardRefExoticComponent[PressableProps & RefAttributes[Element]]]

inline def getInteractionModality(): Modality = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionModality")().asInstanceOf[Modality]

inline def isFocusVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusVisible")().asInstanceOf[Boolean]

inline def setInteractionModality(modality: Modality): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInteractionModality")(modality.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useFocus[Target /* <: FocusableElement */](props: FocusProps[Target]): FocusResult[Target] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocus")(props.asInstanceOf[js.Any]).asInstanceOf[FocusResult[Target]]

inline def useFocusVisible(): FocusVisibleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusVisible")().asInstanceOf[FocusVisibleResult]
inline def useFocusVisible(props: FocusVisibleProps): FocusVisibleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusVisible")(props.asInstanceOf[js.Any]).asInstanceOf[FocusVisibleResult]

inline def useFocusVisibleListener(fn: FocusVisibleHandler, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusVisibleListener")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useFocusVisibleListener(fn: FocusVisibleHandler, deps: js.Array[Any], opts: IsTextInput): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusVisibleListener")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useFocusWithin(props: FocusWithinProps): FocusWithinResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(props.asInstanceOf[js.Any]).asInstanceOf[FocusWithinResult]

inline def useHover(props: HoverProps): HoverResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useHover")(props.asInstanceOf[js.Any]).asInstanceOf[HoverResult]

inline def useInteractOutside(props: InteractOutsideProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractOutside")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useInteractionModality(): Modality = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionModality")().asInstanceOf[Modality]

inline def useKeyboard(props: KeyboardProps): KeyboardResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboard")(props.asInstanceOf[js.Any]).asInstanceOf[KeyboardResult]

inline def useLongPress(props: LongPressProps): LongPressResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useLongPress")(props.asInstanceOf[js.Any]).asInstanceOf[LongPressResult]

inline def useMove(props: MoveEvents): MoveResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useMove")(props.asInstanceOf[js.Any]).asInstanceOf[MoveResult]

inline def usePress(props: PressHookProps): PressResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePress")(props.asInstanceOf[js.Any]).asInstanceOf[PressResult]

inline def useScrollWheel(props: ScrollWheelProps, ref: RefObject[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollWheel")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]

type FocusVisibleHandler = js.Function1[/* isFocusVisible */ Boolean, Unit]
