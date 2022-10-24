package typings.semanticUiPopup.SemanticUI

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import typings.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typings.semanticUiPopup.semanticUiPopupStrings.`change content`
import typings.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typings.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typings.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typings.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`set position`
import typings.semanticUiPopup.semanticUiPopupStrings.destroy
import typings.semanticUiPopup.semanticUiPopupStrings.exists
import typings.semanticUiPopup.semanticUiPopupStrings.hide
import typings.semanticUiPopup.semanticUiPopupStrings.reposition
import typings.semanticUiPopup.semanticUiPopupStrings.setting
import typings.semanticUiPopup.semanticUiPopupStrings.show
import typings.semanticUiPopup.semanticUiPopupStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  def apply(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Returns current popup dom element
    */
  def apply(behavior: `get popup`): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  def apply(behavior: `remove popup`): JQuery = js.native
  /**
    * Repositions a popup
    */
  def apply(behavior: `set position`, position: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  def apply(behavior: exists): Boolean = js.native
  /**
    * Hides popup
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  def apply(behavior: reposition): JQuery = js.native
  def apply(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: PopupSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-popup.SemanticUI.PopupSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-popup.SemanticUI.PopupSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any = js.native
  
  var settings: PopupSettings = js.native
}
object Popup {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'loading'
        */
      var loading: String
      
      /**
        * @default 'ui popup'
        */
      var popup: String
      
      /**
        * @since 2.2.11
        */
      var popupVisible: String
      
      /**
        * @default 'top left center bottom right'
        */
      var position: String
      
      /**
        * @default 'visible'
        */
      var visible: String
    }
    object Impl {
      
      inline def apply(loading: String, popup: String, popupVisible: String, position: String, visible: String): Impl = {
        val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupVisible = popupVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        
        inline def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiPopup.anon.PickImplloadingPartialPic
      - typings.semanticUiPopup.anon.PickImplpopupPartialPickILoading
      - typings.semanticUiPopup.anon.PickImplpositionPartialPiLoading
      - typings.semanticUiPopup.anon.PickImplvisiblePartialPic
      - typings.semanticUiPopup.anon.PickImplpopupVisibleParti
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplloadingPartialPic = {
        val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplloadingPartialPic]
      }
      
      inline def PickImplpopupPartialPickILoading(popup: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplpopupPartialPickILoading = {
        val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplpopupPartialPickILoading]
      }
      
      inline def PickImplpopupVisibleParti(popupVisible: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplpopupVisibleParti = {
        val __obj = js.Dynamic.literal(popupVisible = popupVisible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplpopupVisibleParti]
      }
      
      inline def PickImplpositionPartialPiLoading(position: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplpositionPartialPiLoading = {
        val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplpositionPartialPiLoading]
      }
      
      inline def PickImplvisiblePartialPic(visible: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplvisiblePartialPic = {
        val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplvisiblePartialPic]
      }
    }
  }
  type ClassNameSettings = Param
  
  object DelaySettings {
    
    trait Impl extends StObject {
      
      var hide: Double
      
      var show: Double
    }
    object Impl {
      
      inline def apply(hide: Double, show: Double): Impl = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiPopup.anon.PickImplshowPartialPickIm
      - typings.semanticUiPopup.anon.PickImplhidePartialPickIm
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplhidePartialPickIm(hide: Double & js.UndefOr[Double]): typings.semanticUiPopup.anon.PickImplhidePartialPickIm = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplhidePartialPickIm]
      }
      
      inline def PickImplshowPartialPickIm(show: Double & js.UndefOr[Double]): typings.semanticUiPopup.anon.PickImplshowPartialPickIm = {
        val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplshowPartialPickIm]
      }
    }
  }
  type DelaySettings = typings.semanticUiPopup.SemanticUI.Popup.DelaySettings.Param
  
  object ErrorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'Popup does not fit within the boundaries of the viewport'
        */
      var cannotPlace: String
      
      /**
        * @default 'The position you specified is not a valid position'
        */
      var invalidPosition: String
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
      
      /**
        * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
        */
      var noTransition: String
      
      /**
        * @default 'The target or popup you specified does not exist on the page'
        */
      var notFound: String
    }
    object Impl {
      
      inline def apply(
        cannotPlace: String,
        invalidPosition: String,
        method: String,
        noTransition: String,
        notFound: String
      ): Impl = {
        val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any], invalidPosition = invalidPosition.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
        
        inline def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
        
        inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiPopup.anon.PickImplinvalidPositionPa
      - typings.semanticUiPopup.anon.PickImplcannotPlacePartia
      - typings.semanticUiPopup.anon.PickImplmethodPartialPick
      - typings.semanticUiPopup.anon.PickImplnoTransitionParti
      - typings.semanticUiPopup.anon.PickImplnotFoundPartialPi
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcannotPlacePartia(cannotPlace: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplcannotPlacePartia = {
        val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplcannotPlacePartia]
      }
      
      inline def PickImplinvalidPositionPa(invalidPosition: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplinvalidPositionPa = {
        val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplinvalidPositionPa]
      }
      
      inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplnoTransitionParti(noTransition: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplnoTransitionParti = {
        val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplnoTransitionParti]
      }
      
      inline def PickImplnotFoundPartialPi(notFound: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplnotFoundPartialPi = {
        val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplnotFoundPartialPi]
      }
    }
  }
  type ErrorSettings = typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings.Param
  
  object MetadataSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'content'
        */
      var content: String
      
      /**
        * @default 'html'
        */
      var html: String
      
      /**
        * @default 'offset'
        */
      var offset: String
      
      /**
        * @default 'position'
        */
      var position: String
      
      /**
        * @default 'title'
        */
      var title: String
      
      /**
        * @default 'variation'
        */
      var variation: String
    }
    object Impl {
      
      inline def apply(content: String, html: String, offset: String, position: String, title: String, variation: String): Impl = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiPopup.anon.PickImplcontentPartialPicContent
      - typings.semanticUiPopup.anon.PickImplhtmlPartialPickImContent
      - typings.semanticUiPopup.anon.PickImploffsetPartialPickContent
      - typings.semanticUiPopup.anon.PickImplpositionPartialPiContent
      - typings.semanticUiPopup.anon.PickImpltitlePartialPickIContent
      - typings.semanticUiPopup.anon.PickImplvariationPartialPContent
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcontentPartialPicContent(content: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplcontentPartialPicContent = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplcontentPartialPicContent]
      }
      
      inline def PickImplhtmlPartialPickImContent(html: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplhtmlPartialPickImContent = {
        val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplhtmlPartialPickImContent]
      }
      
      inline def PickImploffsetPartialPickContent(offset: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImploffsetPartialPickContent = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImploffsetPartialPickContent]
      }
      
      inline def PickImplpositionPartialPiContent(position: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplpositionPartialPiContent = {
        val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplpositionPartialPiContent]
      }
      
      inline def PickImpltitlePartialPickIContent(title: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImpltitlePartialPickIContent = {
        val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImpltitlePartialPickIContent]
      }
      
      inline def PickImplvariationPartialPContent(variation: String & js.UndefOr[String]): typings.semanticUiPopup.anon.PickImplvariationPartialPContent = {
        val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.anon.PickImplvariationPartialPContent]
      }
    }
  }
  type MetadataSettings = typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings.Param
  
  /* Inlined semantic-ui-popup.SemanticUI.Popup.SelectorSettings.Param */
  trait SelectorSettings extends StObject {
    
    var popup: String & js.UndefOr[String]
  }
  object SelectorSettings {
    
    inline def apply(popup: String & js.UndefOr[String]): SelectorSettings = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorSettings]
    }
    
    trait Impl extends StObject {
      
      /**
        * @default '.ui.popup'
        */
      var popup: String
    }
    object Impl {
      
      inline def apply(popup: String): Impl = {
        val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: SelectorSettings](x: Self) {
      
      inline def setPopup(value: String & js.UndefOr[String]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
    
    /* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, 'popup'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl>> */
    trait Param extends StObject {
      
      var popup: String & js.UndefOr[String]
    }
    object Param {
      
      inline def apply(popup: String & js.UndefOr[String]): typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param = {
        val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param]
      }
      
      extension [Self <: typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param](x: Self) {
        
        inline def setPopup(value: String & js.UndefOr[String]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      }
    }
  }
}
