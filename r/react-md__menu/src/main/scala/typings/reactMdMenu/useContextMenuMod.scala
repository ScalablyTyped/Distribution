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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useContextMenuMod {
  
  @JSImport("@react-md/menu/types/useContextMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")().asInstanceOf[ReturnValue[CE]]
  inline def useContextMenu[CE /* <: HTMLElement */](hasIdPropRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(hasIdPropRefAnchorClassNamesDisableDeselect.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[CE]]
  
  trait Options extends StObject {
    
    /**
      * The anchor to use for context menus.
      *
      * Defaults to `inner-left` and `top` to mimic native context menus.
      */
    var anchor: js.UndefOr[PositionAnchor] = js.undefined
    
    /**
      * The CSS classNames to use for the context menu animation. This defaults to
      * a vertical scaling transition instead of the default "from-point-scaling"
      * transition.
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * When a context menu becomes visible, the native functionality is to also
      * highlight any text below the cursor when possible. Since this is a custom
      * context menu, this is normally not desired behavior so this hook will
      * automatically deselect this text. If the text selection behavior is
      * desired, this property can be enabled to keep text selected.
      */
    var disableDeselect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The id to use for the context menu. This defaults to `context-menu` since
      * there can usually only be one context menu visible at a time.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * An optional ref that should be merged with the returned ref.
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDisableDeselect(value: Boolean): Self = StObject.set(x, "disableDeselect", value.asInstanceOf[js.Any])
      
      inline def setDisableDeselectUndefined: Self = StObject.set(x, "disableDeselect", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
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
    
    inline def anchor: typings.reactMdMenu.reactMdMenuStrings.anchor = "anchor".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.anchor]
    
    inline def classNames: typings.reactMdMenu.reactMdMenuStrings.classNames = "classNames".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.classNames]
    
    inline def disableControlClickOkay: typings.reactMdMenu.reactMdMenuStrings.disableControlClickOkay = "disableControlClickOkay".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.disableControlClickOkay]
    
    inline def id: typings.reactMdMenu.reactMdMenuStrings.id = "id".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.id]
    
    inline def onRequestClose: typings.reactMdMenu.reactMdMenuStrings.onRequestClose = "onRequestClose".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.onRequestClose]
    
    inline def positionOptions: typings.reactMdMenu.reactMdMenuStrings.positionOptions = "positionOptions".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.positionOptions]
    
    inline def visible: typings.reactMdMenu.reactMdMenuStrings.visible = "visible".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.visible]
  }
  
  type ReturnValue[CE /* <: HTMLElement */] = js.Tuple3[ProvidedContextMenuProps, MouseEventHandler[CE], VisibilityDispatcher]
  
  type VisibilityDispatcher = Dispatch[SetStateAction[Boolean]]
}
