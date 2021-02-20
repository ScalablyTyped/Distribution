package typings.reactMdMenu

import typings.react.mod.Dispatch
import typings.react.mod.MouseEventHandler
import typings.react.mod.Ref
import typings.react.mod.SetStateAction
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useContextMenuMod {
  
  @JSImport("@react-md/menu/types/useContextMenu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = js.native
  @JSImport("@react-md/menu/types/useContextMenu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](hasIdRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The anchor to use for context menus.
      *
      * Defaults to `inner-left` and `top` to mimic native context menus.
      */
    var anchor: js.UndefOr[PositionAnchor] = js.native
    
    /**
      * The CSS classNames to use for the context menu animation. This defaults to
      * a vertical scaling transition instead of the default "from-point-scaling"
      * transition.
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    /**
      * When a context menu becomes visible, the native functionality is to also
      * highlight any text below the cursor when possible. Since this is a custom
      * context menu, this is normally not desired behavior so this hook will
      * automatically deselect this text. If the text selection behavior is
      * desired, this property can be enabled to keep text selected.
      */
    var disableDeselect: js.UndefOr[Boolean] = js.native
    
    /**
      * The id to use for the context menu. This defaults to `context-menu` since
      * there can usually only be one context menu visible at a time.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * An optional ref that should be merged with the returned ref.
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setDisableDeselect(value: Boolean): Self = StObject.set(x, "disableDeselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDeselectUndefined: Self = StObject.set(x, "disableDeselect", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, @react-md/menu.@react-md/menu/types/useContextMenu.ProvidedPropNames>> */
  @js.native
  trait ProvidedContextMenuProps extends StObject {
    
    var anchor: js.Any = js.native
    
    var classNames: js.Any = js.native
    
    var disableControlClickOkay: js.Any = js.native
    
    var id: js.Any = js.native
    
    var onRequestClose: js.Any = js.native
    
    var positionOptions: js.Any = js.native
    
    /**
      * A ref that must be provided to the `Menu` component that is acting as a
      * context menu if you want to allow the native context menus within this
      * custom context menu.
      *
      * If this is never provided to the `Menu` component, right clicking (to
      * inspect an element for example) will close this context menu.
      */
    def ref(): Unit = js.native
    def ref(instance: HTMLDivElement): Unit = js.native
    
    var visible: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdMenu.reactMdMenuStrings.id
    - typings.reactMdMenu.reactMdMenuStrings.anchor
    - typings.reactMdMenu.reactMdMenuStrings.visible
    - typings.reactMdMenu.reactMdMenuStrings.classNames
    - typings.reactMdMenu.reactMdMenuStrings.positionOptions
    - typings.reactMdMenu.reactMdMenuStrings.onRequestClose
    - typings.reactMdMenu.reactMdMenuStrings.disableControlClickOkay
  */
  trait ProvidedPropNames extends StObject
  object ProvidedPropNames {
    
    @scala.inline
    def anchor: typings.reactMdMenu.reactMdMenuStrings.anchor = "anchor".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.anchor]
    
    @scala.inline
    def classNames: typings.reactMdMenu.reactMdMenuStrings.classNames = "classNames".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.classNames]
    
    @scala.inline
    def disableControlClickOkay: typings.reactMdMenu.reactMdMenuStrings.disableControlClickOkay = "disableControlClickOkay".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.disableControlClickOkay]
    
    @scala.inline
    def id: typings.reactMdMenu.reactMdMenuStrings.id = "id".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.id]
    
    @scala.inline
    def onRequestClose: typings.reactMdMenu.reactMdMenuStrings.onRequestClose = "onRequestClose".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.onRequestClose]
    
    @scala.inline
    def positionOptions: typings.reactMdMenu.reactMdMenuStrings.positionOptions = "positionOptions".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.positionOptions]
    
    @scala.inline
    def visible: typings.reactMdMenu.reactMdMenuStrings.visible = "visible".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.visible]
  }
  
  type ReturnValue[CE /* <: HTMLElement */] = js.Tuple3[ProvidedContextMenuProps, MouseEventHandler[CE], VisibilityDispatcher]
  
  type VisibilityDispatcher = Dispatch[SetStateAction[Boolean]]
}
