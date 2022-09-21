package typings.semanticUiDimmer.SemanticUI

import typings.semanticUiDimmer.JQuery
import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings.Param
import typings.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.create
import typings.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typings.semanticUiDimmer.semanticUiDimmerStrings.hide
import typings.semanticUiDimmer.semanticUiDimmerStrings.setting
import typings.semanticUiDimmer.semanticUiDimmerStrings.show
import typings.semanticUiDimmer.semanticUiDimmerStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimmer extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  def apply(behavior: `add content`, element: String): JQuery = js.native
  def apply(behavior: `add content`, element: JQuery): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  def apply(behavior: `get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  def apply(behavior: `get duration`): Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  def apply(behavior: `has dimmer`): Boolean = js.native
  /**
    * Whether section's dimmer is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  def apply(behavior: `is dimmable`): Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  def apply(behavior: `is dimmer`): Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  def apply(behavior: `is enabled`): Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  def apply(behavior: `is page dimmer`): Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  def apply(behavior: `is page`): Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  def apply(behavior: `set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  def apply(behavior: `set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  def apply(behavior: `set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  def apply(behavior: `set opacity`, opacity: Double): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  def apply(behavior: `set page dimmer`): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  def apply(behavior: create): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dimmer
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: DimmerSettings): JQuery = js.native
  /**
    * Shows dimmer
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DimmerSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-dimmer.SemanticUI.DimmerSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-dimmer.SemanticUI.DimmerSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any = js.native
  
  var settings: DimmerSettings = js.native
}
object Dimmer {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'dimmable'
        */
      var dimmable: String
      
      /**
        * @default 'dimmed'
        */
      var dimmed: String
      
      /**
        * @default 'disabled'
        */
      var disabled: String
      
      /**
        * @default 'hide'
        */
      var hide: String
      
      /**
        * @default 'page'
        */
      var pageDimmer: String
      
      /**
        * @default 'show'
        */
      var show: String
      
      /**
        * @default 'transition'
        */
      var transition: String
    }
    object Impl {
      
      inline def apply(
        active: String,
        dimmable: String,
        dimmed: String,
        disabled: String,
        hide: String,
        pageDimmer: String,
        show: String,
        transition: String
      ): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], pageDimmer = pageDimmer.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
        
        inline def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setPageDimmer(value: String): Self = StObject.set(x, "pageDimmer", value.asInstanceOf[js.Any])
        
        inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDimmer.anon.PickImplactivePartialPick
      - typings.semanticUiDimmer.anon.PickImpldimmablePartialPiActive
      - typings.semanticUiDimmer.anon.PickImpldimmedPartialPick
      - typings.semanticUiDimmer.anon.PickImpldisabledPartialPi
      - typings.semanticUiDimmer.anon.PickImplpageDimmerPartial
      - typings.semanticUiDimmer.anon.PickImplhidePartialPickImActive
      - typings.semanticUiDimmer.anon.PickImplshowPartialPickImActive
      - typings.semanticUiDimmer.anon.PickImpltransitionPartialActive
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplactivePartialPick]
      }
      
      inline def PickImpldimmablePartialPiActive(dimmable: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpldimmablePartialPiActive = {
        val __obj = js.Dynamic.literal(dimmable = dimmable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldimmablePartialPiActive]
      }
      
      inline def PickImpldimmedPartialPick(dimmed: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpldimmedPartialPick = {
        val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldimmedPartialPick]
      }
      
      inline def PickImpldisabledPartialPi(disabled: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpldisabledPartialPi = {
        val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldisabledPartialPi]
      }
      
      inline def PickImplhidePartialPickImActive(hide: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImplhidePartialPickImActive = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplhidePartialPickImActive]
      }
      
      inline def PickImplpageDimmerPartial(pageDimmer: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImplpageDimmerPartial = {
        val __obj = js.Dynamic.literal(pageDimmer = pageDimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplpageDimmerPartial]
      }
      
      inline def PickImplshowPartialPickImActive(show: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImplshowPartialPickImActive = {
        val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplshowPartialPickImActive]
      }
      
      inline def PickImpltransitionPartialActive(transition: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpltransitionPartialActive = {
        val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpltransitionPartialActive]
      }
    }
  }
  type ClassNameSettings = Param
  
  object DurationSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 500
        */
      var hide: Double
      
      /**
        * @default 500
        */
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
      - typings.semanticUiDimmer.anon.PickImplshowPartialPickIm
      - typings.semanticUiDimmer.anon.PickImplhidePartialPickIm
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplhidePartialPickIm(hide: Double & js.UndefOr[Double]): typings.semanticUiDimmer.anon.PickImplhidePartialPickIm = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplhidePartialPickIm]
      }
      
      inline def PickImplshowPartialPickIm(show: Double & js.UndefOr[Double]): typings.semanticUiDimmer.anon.PickImplshowPartialPickIm = {
        val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplshowPartialPickIm]
      }
    }
  }
  type DurationSettings = typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings.Param
  
  /* Inlined semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings.Param */
  trait ErrorSettings extends StObject {
    
    var method: String & js.UndefOr[String]
  }
  object ErrorSettings {
    
    inline def apply(method: String & js.UndefOr[String]): ErrorSettings = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorSettings]
    }
    
    extension [Self <: ErrorSettings](x: Self) {
      
      inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
    
    trait Impl extends StObject {
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
    }
    object Impl {
      
      inline def apply(method: String): Impl = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl>> */
    trait Param extends StObject {
      
      var method: String & js.UndefOr[String]
    }
    object Param {
      
      inline def apply(method: String & js.UndefOr[String]): typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param]
      }
      
      extension [Self <: typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param](x: Self) {
        
        inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '.ui.dimmer > .content, .ui.dimmer > .content > .center'
        */
      var content: String
      
      /**
        * @default '.dimmable'
        */
      var dimmable: String
      
      /**
        * @default '.ui.dimmer'
        */
      var dimmer: String
    }
    object Impl {
      
      inline def apply(content: String, dimmable: String, dimmer: String): Impl = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmer = dimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
        
        inline def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDimmer.anon.PickImpldimmablePartialPi
      - typings.semanticUiDimmer.anon.PickImpldimmerPartialPick
      - typings.semanticUiDimmer.anon.PickImplcontentPartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcontentPartialPic(content: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImplcontentPartialPic = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImplcontentPartialPic]
      }
      
      inline def PickImpldimmablePartialPi(dimmable: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpldimmablePartialPi = {
        val __obj = js.Dynamic.literal(dimmable = dimmable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldimmablePartialPi]
      }
      
      inline def PickImpldimmerPartialPick(dimmer: String & js.UndefOr[String]): typings.semanticUiDimmer.anon.PickImpldimmerPartialPick = {
        val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.anon.PickImpldimmerPartialPick]
      }
    }
  }
  type SelectorSettings = typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings.Param
  
  /* Inlined semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings.Param */
  trait TemplateSettings extends StObject {
    
    def dimmer(): JQuery
    @JSName("dimmer")
    var dimmer_Original: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]
  }
  object TemplateSettings {
    
    inline def apply(dimmer: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]): TemplateSettings = {
      val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateSettings]
    }
    
    trait Impl extends StObject {
      
      def dimmer(): JQuery
    }
    object Impl {
      
      inline def apply(dimmer: () => JQuery): Impl = {
        val __obj = js.Dynamic.literal(dimmer = js.Any.fromFunction0(dimmer))
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setDimmer(value: () => JQuery): Self = StObject.set(x, "dimmer", js.Any.fromFunction0(value))
      }
    }
    
    /* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl, 'dimmer'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl>> */
    trait Param extends StObject {
      
      def dimmer(): JQuery
      @JSName("dimmer")
      var dimmer_Original: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]
    }
    object Param {
      
      inline def apply(dimmer: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]): typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings.Param = {
        val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings.Param]
      }
      
      extension [Self <: typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings.Param](x: Self) {
        
        inline def setDimmer(value: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: TemplateSettings](x: Self) {
      
      inline def setDimmer(value: js.Function0[JQuery] & js.UndefOr[js.Function0[JQuery]]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
    }
  }
}
