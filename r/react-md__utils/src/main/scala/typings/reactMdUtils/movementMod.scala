package typings.reactMdUtils

import typings.reactMdUtils.movementTypesMod.MovementConfig
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/movement", JSImport.Namespace)
@js.native
object movementMod extends js.Object {
  def getItemId(id: String, i: Double): String = js.native
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = js.native
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = js.native
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = js.native
  @js.native
  object IncrementMovementKey extends js.Object {
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown with String = js.native
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft with String = js.native
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight with String = js.native
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp with String = js.native
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown with String = js.native
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp with String = js.native
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown with String = js.native
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft with String = js.native
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight with String = js.native
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp with String = js.native
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown with String = js.native
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp with String = js.native
    /* "PageDown" */ val PageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown with String = js.native
    /* "PageUp" */ val PageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp with String = js.native
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown with String = js.native
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft with String = js.native
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight with String = js.native
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.IncrementMovementKey with String] = js.native
  }
  
  @js.native
  object JumpMovementKey extends js.Object {
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd with String = js.native
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome with String = js.native
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd with String = js.native
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome with String = js.native
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd with String = js.native
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome with String = js.native
    /* "End" */ val End: typings.reactMdUtils.movementTypesMod.JumpMovementKey.End with String = js.native
    /* "Home" */ val Home: typings.reactMdUtils.movementTypesMod.JumpMovementKey.Home with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.JumpMovementKey with String] = js.native
  }
  
  @js.native
  object MovementPresets extends js.Object {
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    val VERTICAL_MENU: MovementConfig = js.native
    val VERTICAL_TABS: MovementConfig = js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
}

