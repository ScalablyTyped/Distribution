package typings.reactMdUtils

import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.RefCallback
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.anon.Current
import typings.reactMdUtils.anon.ReadonlyActiveDescendantC
import typings.reactMdUtils.anon.ReadonlyKeyboardFocusCont
import typings.reactMdUtils.reactMdUtilsStrings.height
import typings.reactMdUtils.reactMdUtilsStrings.max
import typings.reactMdUtils.reactMdUtilsStrings.min
import typings.reactMdUtils.reactMdUtilsStrings.width
import typings.reactMdUtils.typesBemMod.BEMResult
import typings.reactMdUtils.typesBemMod.Block
import typings.reactMdUtils.typesColorsHexToRGBMod.BlueBit
import typings.reactMdUtils.typesColorsHexToRGBMod.GreenBit
import typings.reactMdUtils.typesColorsHexToRGBMod.HexString
import typings.reactMdUtils.typesColorsHexToRGBMod.RedBit
import typings.reactMdUtils.typesColorsIsContrastCompliantMod.ContrastRatioCompliance
import typings.reactMdUtils.typesContainsElementMod.CheckableThing
import typings.reactMdUtils.typesDirMod.DirProps
import typings.reactMdUtils.typesDirMod.WritingDirection
import typings.reactMdUtils.typesDirMod.WritingDirectionContext
import typings.reactMdUtils.typesEventsScrollListenerMod.ScrollListenerProps
import typings.reactMdUtils.typesEventsUseScrollListenerMod.ScrollListenerHookOptions
import typings.reactMdUtils.typesEventsUtilsMod.DelegatedEventHandler
import typings.reactMdUtils.typesEventsUtilsMod.DelegatedEventTarget
import typings.reactMdUtils.typesGetPercentageMod.GetPercentageOptions
import typings.reactMdUtils.typesHoverHoverModeProviderMod.HoverModeProviderProps
import typings.reactMdUtils.typesHoverUseHoverModeContextMod.HoverModeContext
import typings.reactMdUtils.typesHoverUseHoverModeMod.HoverModeHookReturnValue
import typings.reactMdUtils.typesHoverUseHoverModeMod.HoverModeOptions
import typings.reactMdUtils.typesKeyboardMovementActiveDescendantContextMod.ActiveDescendantContext
import typings.reactMdUtils.typesKeyboardMovementActiveDescendantMovementProviderMod.ActiveDescendantMovementProviderProps
import typings.reactMdUtils.typesKeyboardMovementKeyboardMovementProviderMod.KeyboardMovementProviderProps
import typings.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusContext
import typings.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookOptions
import typings.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookReturnValue
import typings.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookOptions
import typings.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookReturnValue
import typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions
import typings.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookReturnValue
import typings.reactMdUtils.typesLayoutGridCellMod.GridCellProps
import typings.reactMdUtils.typesLayoutGridListCellMod.GridListCellProps
import typings.reactMdUtils.typesLayoutGridListMod.GridListProps
import typings.reactMdUtils.typesLayoutGridMod.GridProps
import typings.reactMdUtils.typesLayoutUseGridListMod.GridListSize
import typings.reactMdUtils.typesLayoutUseGridListMod.UseGridListOptions
import typings.reactMdUtils.typesLayoutUseGridListMod.UseGridListReturnValue
import typings.reactMdUtils.typesLoopMod.LoopOptions
import typings.reactMdUtils.typesModeTypesMod.UserInteractionMode
import typings.reactMdUtils.typesModeUserInteractionModeListenerMod.UserInteractionModeListenerProps
import typings.reactMdUtils.typesPositioningTypesMod.Coords
import typings.reactMdUtils.typesPositioningTypesMod.FixedPosition
import typings.reactMdUtils.typesPositioningTypesMod.FixedPositionOptions
import typings.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import typings.reactMdUtils.typesSearchCaseInsensitiveFilterMod.CaseInsensitiveOptions
import typings.reactMdUtils.typesSearchUseKeyboardSearchMod.KeyboardSearchOptions
import typings.reactMdUtils.typesSearchUtilsMod.GetItemValue_
import typings.reactMdUtils.typesSearchUtilsMod.SearchOptions
import typings.reactMdUtils.typesSizingAppSizeListenerMod.AppSizeListenerProps
import typings.reactMdUtils.typesSizingConstantsMod.QuerySize
import typings.reactMdUtils.typesSizingMediaOnlyMod.MediaOnlyProps
import typings.reactMdUtils.typesSizingResizeListenerMod.ResizeListenerProps
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSizeOptions
import typings.reactMdUtils.typesSizingUseResizeListenerMod.ResizeListenerOptions
import typings.reactMdUtils.typesSizingUseResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.typesSizingUseResizeObserverMod.UseResizeObserverOptions
import typings.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuery
import typings.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuerys
import typings.reactMdUtils.typesThrottleMod.ThrottleableFunction
import typings.reactMdUtils.typesThrottleMod.ThrottledFunction
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.reactMdUtils.typesUnitToNumberMod.UnitToNumberOptions
import typings.reactMdUtils.typesUseCloseOnOutsideClickMod.CloseOnOutsideClickOptions
import typings.reactMdUtils.typesUseDropzoneMod.DropzoneHandlers
import typings.reactMdUtils.typesUseDropzoneMod.DropzoneHookReturnValue
import typings.reactMdUtils.typesUseEnsuredRefMod.EnsuredRefs
import typings.reactMdUtils.typesUseIntervalMod.ReturnValue
import typings.reactMdUtils.typesWiaAriaFocusContainerMod.FocusContainerProps
import typings.reactMdUtils.typesWiaAriaFocusElementWithinMod.Focus
import typings.reactMdUtils.typesWiaAriaGetInstanceMod.RefOrInstance
import typings.reactMdUtils.typesWiaAriaIsFocusableMod.ElementFocusType
import typings.reactMdUtils.typesWiaAriaMovementTypesMod.MovementConfig
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.typesWiaAriaMovementUseFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementProviders
import typings.reactMdUtils.typesWiaAriaRadioRadioGroupMod.RadioGroupProps
import typings.reactMdUtils.typesWiaAriaRadioRadioWidgetMod.RadioWidgetProps
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typings.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import typings.reactMdUtils.typesWiaAriaTryToSubmitRelatedFormMod.KeyboardSubmitEventPartial
import typings.reactMdUtils.typesWiaAriaUsePreviousFocusMod.FocusFallback
import typings.std.AddEventListenerOptions
import typings.std.DOMRect
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.Omit
import typings.std.OrientationType
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils", "ABOVE_CENTER_ANCHOR")
  @js.native
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_LEFT_ANCHOR")
  @js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_RIGHT_ANCHOR")
  @js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_LEFT_ANCHOR")
  @js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_RIGHT_ANCHOR")
  @js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def ActiveDescendantMovementProvider(param0: ActiveDescendantMovementProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/utils", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  inline def AppSizeListener(param0: AppSizeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/utils", "BELOW_CENTER_ANCHOR")
  @js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_LEFT_ANCHOR")
  @js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_RIGHT_ANCHOR")
  @js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_LEFT_ANCHOR")
  @js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_RIGHT_ANCHOR")
  @js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_CENTER_ANCHOR")
  @js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_LEFT_ANCHOR")
  @js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_LEFT_ANCHOR")
  @js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils", "CENTER_CENTER_ANCHOR")
  @js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_LEFT_ANCHOR")
  @js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_RIGHT_ANCHOR")
  @js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_LEFT_ANCHOR")
  @js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_RIGHT_ANCHOR")
  @js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_LARGE_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  inline def DEFAULT_DIR(): WritingDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_DIR")().asInstanceOf[WritingDirection]
  
  @JSImport("@react-md/utils", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_DEACTIVATION_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_DEACTIVATION_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_EXIT_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_EXIT_TIME: /* 300 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_VISIBLE_IN_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_VISIBLE_IN_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_LTR_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  @JSImport("@react-md/utils", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_RTL_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[Any] = js.native
    inline def getItemValue_=(x: GetItemValue_[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    inline def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    inline def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-md/utils", "DEFAULT_SEARCH_RESET_TIME")
  @js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MAX_WIDTH")
  @js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MIN_WIDTH")
  @js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TRIM")
  @js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_VALUE_KEY")
  @js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  
  inline def DesktopOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Dir(param0: DirProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Dir")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/utils", "FOCUSABLE_ELEMENTS")
  @js.native
  val FOCUSABLE_ELEMENTS: js.Array[String] = js.native
  
  @JSImport("@react-md/utils", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  @JSImport("@react-md/utils", "HoverModeContextProvider")
  @js.native
  val HoverModeContextProvider: Provider[HoverModeContext] = js.native
  
  inline def HoverModeProvider(param0: HoverModeProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("HoverModeProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/utils", "IncrementMovementKey")
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
  
  @JSImport("@react-md/utils", "JumpMovementKey")
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
  
  @JSImport("@react-md/utils", "KeyboardMovementContextProvider")
  @js.native
  val KeyboardMovementContextProvider: Provider[KeyboardFocusContext] = js.native
  
  inline def KeyboardMovementProvider(param0: KeyboardMovementProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/utils", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  inline def MobileOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  object MovementPresets {
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @JSImport("@react-md/utils", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  @JSImport("@react-md/utils", "PROGRAMATICALLY_FOCUSABLE")
  @js.native
  val PROGRAMATICALLY_FOCUSABLE: String = js.native
  
  inline def PhoneOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("@react-md/utils", "RadioGroup")
  @js.native
  val RadioGroup: ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def ResizeListener(param0: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("@react-md/utils", "TAB_FOCUSABLE")
  @js.native
  val TAB_FOCUSABLE: String = js.native
  
  @JSImport("@react-md/utils", "TOP_CENTER_ANCHOR")
  @js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_LEFT_ANCHOR")
  @js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_RIGHT_ANCHOR")
  @js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_LEFT_ANCHOR")
  @js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_RIGHT_ANCHOR")
  @js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  
  inline def TabletOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def UserInteractionModeListener(param0: UserInteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def applyRef[E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")().asInstanceOf[Unit]
  inline def applyRef[E](instance: E): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyRef[E](instance: E, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyRef[E](instance: Null, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bem(base: Block): BEMResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bem")(base.asInstanceOf[js.Any]).asInstanceOf[BEMResult]
  
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def containsElement(container: CheckableThing, child: CheckableThing): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsElement")(container.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def defaults[O /* <: js.Object */, R /* <: js.Object */](optional: O, required: R): O & R = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(optional.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[O & R]
  
  inline def delegateEvent(eventType: String): DelegatedEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Unit,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  
  inline def disableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extractTextContent(stringOrElement: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchInRange")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], isSelfMatchable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findSizingContainer(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")().asInstanceOf[HTMLElement | Null]
  inline def findSizingContainer(el: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def focusElementWithin(container: Document, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElement[E /* <: HTMLElement */](): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: E): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def getElementRect(element: HTMLElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  inline def getElementRect(element: HTMLElement, coords: Coords): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
  
  inline def getFixedPosition(param0: FixedPositionOptions): FixedPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedPosition")(param0.asInstanceOf[js.Any]).asInstanceOf[FixedPosition]
  
  inline def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getFuzzyRegExp(query: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFuzzyRegExp")(query.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getItemValue(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getItemValue(item: Any, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def getPercentage(param0: GetPercentageOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentage")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSearchString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getViewportSize(direction: height | width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusable(element: Document): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Document, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def loop(param0: LoopOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nearest(value: Double, min: Double, max: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def nearest(value: Double, min: Double, max: Double, steps: Double, range: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], omitKeys.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
  
  inline def scrollIntoView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")().asInstanceOf[Unit]
  inline def scrollIntoView(container: Null, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ThrottledFunction[F]]
  
  inline def toWidthPart(v: Unit, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart(v: QuerySize, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tryToSubmitRelatedForm(event: KeyboardSubmitEventPartial): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToSubmitRelatedForm")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unitToNumber(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: String, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unitToNumber(unit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useActiveDescendant[E /* <: HTMLElement */](param0: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")().asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](param0: ActiveDescendantFocusHookOptions[E]): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: ActiveDescendantOptions[D, CE, IE]): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(param0: AppSizeOptions): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(param0.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  inline def useCloseOnOutsideClick[E /* <: HTMLElement */](param0: CloseOnOutsideClickOptions[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnOutsideClick")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useDir(): WritingDirectionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useDir")().asInstanceOf[WritingDirectionContext]
  
  inline def useDropzone[E /* <: HTMLElement */](options: DropzoneHandlers[E]): DropzoneHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")(options.asInstanceOf[js.Any]).asInstanceOf[DropzoneHookReturnValue[E]]
  
  inline def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")().asInstanceOf[EnsuredRefs[E]]
  inline def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")(propRef.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Unit, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")().asInstanceOf[UseGridListReturnValue[E]]
  inline def useGridList[E /* <: HTMLElement */](param0: PropsWithRef[UseGridListOptions, E]): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")(param0.asInstanceOf[js.Any]).asInstanceOf[UseGridListReturnValue[E]]
  
  inline def useGridListSize(): GridListSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridListSize")().asInstanceOf[GridListSize]
  
  inline def useHoverMode(): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")().asInstanceOf[HoverModeHookReturnValue]
  inline def useHoverMode(param0: HoverModeOptions): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")(param0.asInstanceOf[js.Any]).asInstanceOf[HoverModeHookReturnValue]
  
  inline def useHoverModeContext(): HoverModeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverModeContext")().asInstanceOf[HoverModeContext]
  
  inline def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultRunning.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyboardFocus[E /* <: HTMLElement */](): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")().asInstanceOf[KeyboardFocusHookReturnValue[E]]
  inline def useKeyboardFocus[E /* <: HTMLElement */](options: KeyboardFocusHookOptions[E]): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")(options.asInstanceOf[js.Any]).asInstanceOf[KeyboardFocusHookReturnValue[E]]
  
  inline def useKeyboardFocusContext(): ReadonlyKeyboardFocusCont = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusContext")().asInstanceOf[ReadonlyKeyboardFocusCont]
  
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")().asInstanceOf[RefCallback[E]]
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](ref: Ref[E]): RefCallback[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[E]]
  
  inline def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](param0: KeyboardMovementOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(param0.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useKeyboardSearch[D, E /* <: HTMLElement */](param0: KeyboardSearchOptions[D, E]): typings.reactMdUtils.typesSearchUseKeyboardSearchMod.ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardSearch")(param0.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.typesSearchUseKeyboardSearchMod.ReturnValue[E]]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOnUnmount(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnUnmount")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useOrientation(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[OrientationType]
  inline def useOrientation(defaultValue: OrientationType): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
  
  inline def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRefCache[T](cacheable: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefCache")(cacheable.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useResizeListener(param0: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  
  inline def useScrollListener(param0: ScrollListenerHookOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useTempValue[T](defaultValue: T): typings.reactMdUtils.typesUseTempValueMod.ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.typesUseTempValueMod.ReturnValue[T]]
  inline def useTempValue[T](defaultValue: T, resetTime: Double): typings.reactMdUtils.typesUseTempValueMod.ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any], resetTime.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.typesUseTempValueMod.ReturnValue[T]]
  
  inline def useTimeout(cb: js.Function0[Unit], delay: Double): typings.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): typings.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): typings.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  
  inline def useToggle(defaultToggled: js.Function0[Boolean]): typings.reactMdUtils.typesUseToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.typesUseToggleMod.ReturnValue]
  inline def useToggle(defaultToggled: Boolean): typings.reactMdUtils.typesUseToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.typesUseToggleMod.ReturnValue]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  inline def useWidthMediaQuery(param0: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def withinRange(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
