package typings.reactMdUtils

import typings.reactMdUtils.typesWiaAriaMovementTypesMod.MovementConfig
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.typesWiaAriaMovementUseFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementProviders
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaMovementMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey & String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowDown & String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowLeft & String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowRight & String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowUp & String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageDown & String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageUp & String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowDown & String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowLeft & String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowRight & String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowUp & String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowDown & String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowUp & String = js.native
    
    /* "PageDown" */ val PageDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageDown & String = js.native
    
    /* "PageUp" */ val PageUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageUp & String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowDown & String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowLeft & String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowRight & String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowUp & String = js.native
  }
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey & String] = js.native
    
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltEnd & String = js.native
    
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltHome & String = js.native
    
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlEnd & String = js.native
    
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlHome & String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftEnd & String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftHome & String = js.native
    
    /* "End" */ val End: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.End & String = js.native
    
    /* "Home" */ val Home: typings.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.Home & String = js.native
  }
  
  object MovementPresets {
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(hasDefaultFocusedIndexOnChangeOptions.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
}
