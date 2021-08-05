package typings.reactMdUtils

import typings.react.mod.Context
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typings.reactMdUtils.bemMod.BEMResult
import typings.reactMdUtils.bemMod.Block
import typings.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions
import typings.reactMdUtils.containsElementMod.CheckableThing
import typings.reactMdUtils.delegateEventMod.DelegatedEventHandler
import typings.reactMdUtils.delegateEventMod.DelegatedEventTarget
import typings.reactMdUtils.dirMod.DirProps
import typings.reactMdUtils.dirMod.WritingDirection
import typings.reactMdUtils.dirMod.WritingDirectionContext
import typings.reactMdUtils.focusContainerMod.FocusContainerProps
import typings.reactMdUtils.focusElementWithinMod.Focus
import typings.reactMdUtils.getInstanceMod.RefOrInstance
import typings.reactMdUtils.gridCellMod.GridCellProps
import typings.reactMdUtils.gridListCellMod.GridListCellProps
import typings.reactMdUtils.gridListMod.GridListProps
import typings.reactMdUtils.gridMod.GridProps
import typings.reactMdUtils.hexToRGBMod.BlueBit
import typings.reactMdUtils.hexToRGBMod.GreenBit
import typings.reactMdUtils.hexToRGBMod.HexString
import typings.reactMdUtils.hexToRGBMod.RedBit
import typings.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import typings.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import typings.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import typings.reactMdUtils.movementTypesMod.MovementConfig
import typings.reactMdUtils.reactMdUtilsStrings.height
import typings.reactMdUtils.reactMdUtilsStrings.max
import typings.reactMdUtils.reactMdUtilsStrings.min
import typings.reactMdUtils.reactMdUtilsStrings.width
import typings.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typings.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typings.reactMdUtils.scrollListenerMod.ScrollListenerProps
import typings.reactMdUtils.sizingConstantsMod.QuerySize
import typings.reactMdUtils.throttleMod.ThrottleableFunction
import typings.reactMdUtils.throttleMod.ThrottledFunction
import typings.reactMdUtils.touchesMod.TouchTypes
import typings.reactMdUtils.typesMod.Coords
import typings.reactMdUtils.typesMod.FixedPosition
import typings.reactMdUtils.typesMod.FixedPositionOptions
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.reactMdUtils.unitToNumberMod.UnitToNumberOptions
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typings.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import typings.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import typings.reactMdUtils.useCloseOnOutsideClickMod.CloseOnOutsideClickOptions
import typings.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typings.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typings.reactMdUtils.useGridListMod.GridListSize
import typings.reactMdUtils.useGridListMod.UseGridListOptions
import typings.reactMdUtils.useGridListMod.UseGridListReturnValue
import typings.reactMdUtils.useIntervalMod.ReturnValue
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typings.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import typings.reactMdUtils.useKeyboardSearchMod.KeyboardSearchOptions
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typings.reactMdUtils.usePreviousFocusMod.FocusFallback
import typings.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typings.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.useResizeObserverMod.UseResizeObserverOptions
import typings.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import typings.reactMdUtils.useScrollListenerMod.Options
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuery
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typings.reactMdUtils.utilsMod.GetItemValue_
import typings.reactMdUtils.utilsMod.SearchOptions
import typings.std.AddEventListenerOptions
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Omit
import typings.std.OrientationType
import typings.std.RegExp
import typings.std.TouchEvent
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
  
  @JSImport("@react-md/utils", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  object AppSizeListener {
    
    inline def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils", "AppSizeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      inline def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      inline def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      inline def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.onChange")
      @js.native
      def onChange: js.Any = js.native
      inline def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      inline def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      inline def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "AppSizeListener.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      inline def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
    }
  }
  
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
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[js.Any] = js.native
    inline def getItemValue_=(x: GetItemValue_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
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
  
  @JSImport("@react-md/utils", "DesktopOnly")
  @js.native
  val DesktopOnly: FC[MediaOnlyProps] = js.native
  
  object Dir {
    
    inline def apply(hasChildrenDefaultDir: DirProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenDefaultDir.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils", "Dir")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "Dir.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "Dir.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "Dir.propTypes.defaultDir")
      @js.native
      def defaultDir: js.Any = js.native
      inline def defaultDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDir")(x.asInstanceOf[js.Any])
    }
  }
  
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
  
  @JSImport("@react-md/utils", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.IncrementMovementKey & String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown & String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft & String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight & String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp & String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown & String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp & String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown & String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft & String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight & String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp & String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown & String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp & String = js.native
    
    /* "PageDown" */ val PageDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown & String = js.native
    
    /* "PageUp" */ val PageUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp & String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown & String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft & String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight & String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typings.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp & String = js.native
  }
  
  object InteractionModeListener {
    
    inline def apply(hasChildren: InteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils", "InteractionModeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "InteractionModeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "InteractionModeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMdUtils.movementTypesMod.JumpMovementKey & String] = js.native
    
    /* "Alt+End" */ val AltEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd & String = js.native
    
    /* "Alt+Home" */ val AltHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome & String = js.native
    
    /* "Control+End" */ val ControlEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd & String = js.native
    
    /* "Control+Home" */ val ControlHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome & String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd & String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typings.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome & String = js.native
    
    /* "End" */ val End: typings.reactMdUtils.movementTypesMod.JumpMovementKey.End & String = js.native
    
    /* "Home" */ val Home: typings.reactMdUtils.movementTypesMod.JumpMovementKey.Home & String = js.native
  }
  
  @JSImport("@react-md/utils", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils", "MobileOnly")
  @js.native
  val MobileOnly: FC[MediaOnlyProps] = js.native
  
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
  
  object PassiveEvents {
    
    @JSImport("@react-md/utils", "PassiveEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "PassiveEvents.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    inline def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
    
    inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
  }
  
  @JSImport("@react-md/utils", "PhoneOnly")
  @js.native
  val PhoneOnly: FC[MediaOnlyProps] = js.native
  
  object ResizeListener {
    
    inline def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].apply(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("@react-md/utils", "ResizeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.immediate")
      @js.native
      def immediate: js.Any = js.native
      inline def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.onResize")
      @js.native
      def onResize: js.Any = js.native
      inline def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeListener.propTypes.options")
      @js.native
      def options: js.Any = js.native
      inline def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
  }
  
  object ResizeObserver {
    
    inline def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/utils", "ResizeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.component")
      @js.native
      def component: js.Any = js.native
      inline def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.disableHeight")
      @js.native
      def disableHeight: js.Any = js.native
      inline def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.disableWidth")
      @js.native
      def disableWidth: js.Any = js.native
      inline def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils", "ResizeObserver.propTypes.target")
      @js.native
      def target: js.Any = js.native
      inline def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
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
  
  @JSImport("@react-md/utils", "TabletOnly")
  @js.native
  val TabletOnly: FC[MediaOnlyProps] = js.native
  
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyRef[E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")().asInstanceOf[Unit]
  inline def applyRef[E](instance: E): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyRef[E](instance: E, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyRef[E](instance: Null, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bem(base: Block): BEMResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bem")(base.asInstanceOf[js.Any]).asInstanceOf[BEMResult]
  
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def containsElement(container: CheckableThing, child: CheckableThing): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsElement")(container.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  
  inline def disable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enable(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def focusElementWithin(container: Document, focus: Focus, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElement[E /* <: HTMLElement */](): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: E): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def getElementRect(element: HTMLElement): DOMRect | ClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect | ClientRect]
  inline def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[DOMRect | ClientRect]
  
  inline def getFixedPosition(
    hasContainerElementPropAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthTypePreventOverlapTransformOriginDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedPosition")(hasContainerElementPropAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthTypePreventOverlapTransformOriginDisableSwappingDisableVHBounds.asInstanceOf[js.Any]).asInstanceOf[FixedPosition]
  
  inline def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getFuzzyRegExp(query: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFuzzyRegExp")(query.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getItemValue(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getItemValue(item: js.Any, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def getPercentage(min: Double, max: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPercentage")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSearchString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getViewportSize_height(direction: height): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getViewportSize_width(direction: width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loop(x: Double, max: Double, increment: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(x.asInstanceOf[js.Any], max.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def loop(x: Double, max: Double, increment: Boolean, minmax: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(x.asInstanceOf[js.Any], max.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minmax.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nearest(value: Double, min: Double, max: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], omitKeys.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
  
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollIntoView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")().asInstanceOf[Unit]
  inline def scrollIntoView(container: Null, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ThrottledFunction[F]]
  
  inline def toWidthPart_max(v: Unit, prefix: max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart_max(v: QuerySize, prefix: max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toWidthPart_min(v: Unit, prefix: min): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart_min(v: QuerySize, prefix: min): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unitToNumber(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: String, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unitToNumber(unit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  inline def useCloseOnOutsideClick[E /* <: HTMLElement */](hasEnabledElementOnOutsideClick: CloseOnOutsideClickOptions[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnOutsideClick")(hasEnabledElementOnOutsideClick.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useDir(): WritingDirectionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useDir")().asInstanceOf[WritingDirectionContext]
  
  inline def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")().asInstanceOf[EnsuredRefs[E]]
  inline def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")(propRef.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(hasDefaultFocusedIndexOnChangeOptions.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Unit, programatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")().asInstanceOf[UseGridListReturnValue[E]]
  inline def useGridList[E /* <: HTMLElement */](
    hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")(hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding.asInstanceOf[js.Any]).asInstanceOf[UseGridListReturnValue[E]]
  
  inline def useGridListSize(): GridListSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridListSize")().asInstanceOf[GridListSize]
  
  inline def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultRunning.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): typings.reactMdUtils.useKeyboardSearchMod.ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardSearch")(hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.useKeyboardSearchMod.ReturnValue[E]]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOrientation(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[OrientationType]
  inline def useOrientation(defaultValue: OrientationType): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
  
  inline def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRefCache[T](cacheable: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefCache")(cacheable.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  inline def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(hasOnResizeOptionsImmediateEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollListener[E /* <: HTMLElement */](hasEnabledOnScrollElementOptions: Options[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(hasEnabledOnScrollElementOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useTempValue[T](defaultValue: T): typings.reactMdUtils.useTempValueMod.ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.useTempValueMod.ReturnValue[T]]
  inline def useTempValue[T](defaultValue: T, resetTime: Double): typings.reactMdUtils.useTempValueMod.ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any], resetTime.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.useTempValueMod.ReturnValue[T]]
  
  inline def useTimeout(cb: js.Function0[Unit], delay: Double): typings.reactMdUtils.useTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.useTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): typings.reactMdUtils.useTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.useTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): typings.reactMdUtils.useTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typings.reactMdUtils.useTimeoutMod.ReturnValue]
  
  inline def useToggle(defaultToggled: js.Function0[Boolean]): typings.reactMdUtils.useToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.useToggleMod.ReturnValue]
  inline def useToggle(defaultToggled: Boolean): typings.reactMdUtils.useToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typings.reactMdUtils.useToggleMod.ReturnValue]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  inline def useWidthMediaQuery(hasMinMax: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(hasMinMax.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
