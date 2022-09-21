package typings.semanticUiSidebar.SemanticUI

import typings.semanticUiSidebar.JQuery
import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings.Param
import typings.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typings.semanticUiSidebar.semanticUiSidebarStrings.hide
import typings.semanticUiSidebar.semanticUiSidebarStrings.setting
import typings.semanticUiSidebar.semanticUiSidebarStrings.show
import typings.semanticUiSidebar.semanticUiSidebarStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sidebar extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  def apply(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  def apply(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  def apply(behavior: `get transition event`): String = js.native
  /**
    * Returns whether sidebar is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  def apply(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  def apply(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  def apply(behavior: `remove body CSS`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides sidebar
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: SidebarSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-sidebar.SemanticUI.SidebarSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-sidebar.SemanticUI.SidebarSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any = js.native
  
  var settings: SidebarSettings = js.native
}
object Sidebar {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'animating'
        */
      var animating: String
      
      /**
        * @default 'bottom'
        */
      var bottom: String
      
      /**
        * @default 'dimmed'
        */
      var dimmed: String
      
      /**
        * @default 'ios'
        */
      var ios: String
      
      /**
        * @default 'left'
        */
      var left: String
      
      /**
        * @default 'pushable'
        */
      var pushable: String
      
      /**
        * @default 'pushed'
        */
      var pushed: String
      
      /**
        * @default 'right'
        */
      var right: String
      
      /**
        * @default 'top'
        */
      var top: String
      
      /**
        * @default 'visible'
        */
      var visible: String
    }
    object Impl {
      
      inline def apply(
        active: String,
        animating: String,
        bottom: String,
        dimmed: String,
        ios: String,
        left: String,
        pushable: String,
        pushed: String,
        right: String,
        top: String,
        visible: String
      ): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pushable = pushable.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
        
        inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
        
        inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setPushable(value: String): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
        
        inline def setPushed(value: String): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
        
        inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSidebar.anon.PickImplactivePartialPick
      - typings.semanticUiSidebar.anon.PickImplanimatingPartialP
      - typings.semanticUiSidebar.anon.PickImpldimmedPartialPick
      - typings.semanticUiSidebar.anon.PickImpliosPartialPickImp
      - typings.semanticUiSidebar.anon.PickImplpushablePartialPi
      - typings.semanticUiSidebar.anon.PickImplpushedPartialPick
      - typings.semanticUiSidebar.anon.PickImplrightPartialPickIActive
      - typings.semanticUiSidebar.anon.PickImpltopPartialPickImpActive
      - typings.semanticUiSidebar.anon.PickImplleftPartialPickImActive
      - typings.semanticUiSidebar.anon.PickImplbottomPartialPickActive
      - typings.semanticUiSidebar.anon.PickImplvisiblePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplactivePartialPick]
      }
      
      inline def PickImplanimatingPartialP(animating: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplanimatingPartialP = {
        val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplanimatingPartialP]
      }
      
      inline def PickImplbottomPartialPickActive(bottom: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplbottomPartialPickActive = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplbottomPartialPickActive]
      }
      
      inline def PickImpldimmedPartialPick(dimmed: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImpldimmedPartialPick = {
        val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpldimmedPartialPick]
      }
      
      inline def PickImpliosPartialPickImp(ios: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImpliosPartialPickImp = {
        val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpliosPartialPickImp]
      }
      
      inline def PickImplleftPartialPickImActive(left: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplleftPartialPickImActive = {
        val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplleftPartialPickImActive]
      }
      
      inline def PickImplpushablePartialPi(pushable: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplpushablePartialPi = {
        val __obj = js.Dynamic.literal(pushable = pushable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplpushablePartialPi]
      }
      
      inline def PickImplpushedPartialPick(pushed: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplpushedPartialPick = {
        val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplpushedPartialPick]
      }
      
      inline def PickImplrightPartialPickIActive(right: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplrightPartialPickIActive = {
        val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplrightPartialPickIActive]
      }
      
      inline def PickImpltopPartialPickImpActive(top: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImpltopPartialPickImpActive = {
        val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpltopPartialPickImpActive]
      }
      
      inline def PickImplvisiblePartialPic(visible: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplvisiblePartialPic = {
        val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplvisiblePartialPic]
      }
    }
  }
  type ClassNameSettings = Param
  
  object DefaultTransitionSettings {
    
    object ComputerSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'overlay'
          */
        var bottom: String
        
        /**
          * @default 'uncover'
          */
        var left: String
        
        /**
          * @default 'uncover'
          */
        var right: String
        
        /**
          * @default 'overlay'
          */
        var top: String
      }
      object Impl {
        
        inline def apply(bottom: String, left: String, right: String, top: String): typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl]
        }
        
        extension [Self <: typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Impl](x: Self) {
          
          inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
          
          inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
          
          inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiSidebar.anon.PickImplleftPartialPickIm
        - typings.semanticUiSidebar.anon.PickImplrightPartialPickI
        - typings.semanticUiSidebar.anon.PickImpltopPartialPickImp
        - typings.semanticUiSidebar.anon.PickImplbottomPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplbottomPartialPick(bottom: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplbottomPartialPick = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplbottomPartialPick]
        }
        
        inline def PickImplleftPartialPickIm(left: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplleftPartialPickIm = {
          val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplleftPartialPickIm]
        }
        
        inline def PickImplrightPartialPickI(right: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplrightPartialPickI = {
          val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplrightPartialPickI]
        }
        
        inline def PickImpltopPartialPickImp(top: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImpltopPartialPickImp = {
          val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpltopPartialPickImp]
        }
      }
    }
    type ComputerSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
    
    trait Impl extends StObject {
      
      var computer: ComputerSettings
      
      var mobile: MobileSettings
    }
    object Impl {
      
      inline def apply(computer: ComputerSettings, mobile: MobileSettings): Impl = {
        val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
        
        inline def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      }
    }
    
    object MobileSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'overlay'
          */
        var bottom: String
        
        /**
          * @default 'uncover'
          */
        var left: String
        
        /**
          * @default 'uncover'
          */
        var right: String
        
        /**
          * @default 'overlay'
          */
        var top: String
      }
      object Impl {
        
        inline def apply(bottom: String, left: String, right: String, top: String): typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl]
        }
        
        extension [Self <: typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Impl](x: Self) {
          
          inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
          
          inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
          
          inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiSidebar.anon.PickImplleftPartialPickIm
        - typings.semanticUiSidebar.anon.PickImplrightPartialPickI
        - typings.semanticUiSidebar.anon.PickImpltopPartialPickImp
        - typings.semanticUiSidebar.anon.PickImplbottomPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplbottomPartialPick(bottom: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplbottomPartialPick = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplbottomPartialPick]
        }
        
        inline def PickImplleftPartialPickIm(left: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplleftPartialPickIm = {
          val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplleftPartialPickIm]
        }
        
        inline def PickImplrightPartialPickI(right: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplrightPartialPickI = {
          val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplrightPartialPickI]
        }
        
        inline def PickImpltopPartialPickImp(top: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImpltopPartialPickImp = {
          val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpltopPartialPickImp]
        }
      }
    }
    type MobileSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSidebar.anon.PickImplcomputerPartialPi
      - typings.semanticUiSidebar.anon.PickImplmobilePartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcomputerPartialPi(computer: ComputerSettings & js.UndefOr[ComputerSettings]): typings.semanticUiSidebar.anon.PickImplcomputerPartialPi = {
        val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplcomputerPartialPi]
      }
      
      inline def PickImplmobilePartialPick(mobile: MobileSettings & js.UndefOr[MobileSettings]): typings.semanticUiSidebar.anon.PickImplmobilePartialPick = {
        val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplmobilePartialPick]
      }
    }
  }
  type DefaultTransitionSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Param
  
  object ErrorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
      
      /**
        * @default 'Had to move sidebar. For optimal performance make sure sidebar and pusher are direct children of your body tag'
        */
      var movedSidebar: String
      
      /**
        * @default 'There were no elements that matched the specified selector'
        */
      var notFound: String
      
      /**
        * @default 'The overlay setting is no longer supported, use animation: overlay'
        */
      var overlay: String
      
      /**
        * @default 'Had to add pusher element. For optimal performance make sure body content is inside a pusher element'
        */
      var pusher: String
    }
    object Impl {
      
      inline def apply(method: String, movedSidebar: String, notFound: String, overlay: String, pusher: String): Impl = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], movedSidebar = movedSidebar.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMovedSidebar(value: String): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
        
        inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
        
        inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
        
        inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSidebar.anon.PickImplmethodPartialPick
      - typings.semanticUiSidebar.anon.PickImplpusherPartialPickMethod
      - typings.semanticUiSidebar.anon.PickImplmovedSidebarParti
      - typings.semanticUiSidebar.anon.PickImploverlayPartialPic
      - typings.semanticUiSidebar.anon.PickImplnotFoundPartialPi
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplmovedSidebarParti(movedSidebar: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplmovedSidebarParti = {
        val __obj = js.Dynamic.literal(movedSidebar = movedSidebar.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplmovedSidebarParti]
      }
      
      inline def PickImplnotFoundPartialPi(notFound: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplnotFoundPartialPi = {
        val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplnotFoundPartialPi]
      }
      
      inline def PickImploverlayPartialPic(overlay: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImploverlayPartialPic = {
        val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImploverlayPartialPic]
      }
      
      inline def PickImplpusherPartialPickMethod(pusher: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplpusherPartialPickMethod = {
        val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplpusherPartialPickMethod]
      }
    }
  }
  type ErrorSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings.Param
  
  object RegExpSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default /(iPad|iPhone|iPod)/g
        */
      var ios: js.RegExp
      
      /**
        * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
        */
      var mobile: js.RegExp
    }
    object Impl {
      
      inline def apply(ios: js.RegExp, mobile: js.RegExp): Impl = {
        val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setIos(value: js.RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
        
        inline def setMobile(value: js.RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSidebar.anon.PickImpliosPartialPickImpIos
      - typings.semanticUiSidebar.anon.PickImplmobilePartialPickIos
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpliosPartialPickImpIos(ios: js.RegExp & js.UndefOr[js.RegExp]): typings.semanticUiSidebar.anon.PickImpliosPartialPickImpIos = {
        val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImpliosPartialPickImpIos]
      }
      
      inline def PickImplmobilePartialPickIos(mobile: js.RegExp & js.UndefOr[js.RegExp]): typings.semanticUiSidebar.anon.PickImplmobilePartialPickIos = {
        val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplmobilePartialPickIos]
      }
    }
  }
  type RegExpSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings.Param
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '.fixed'
        */
      var fixed: String
      
      /**
        * @default 'script, link, style, .ui.modal, .ui.dimmer, .ui.nag, .ui.fixed'
        */
      var omitted: String
      
      /**
        * @default '.pusher'
        */
      var pusher: String
      
      /**
        * @default '.ui.sidebar'
        */
      var sidebar: String
    }
    object Impl {
      
      inline def apply(fixed: String, omitted: String, pusher: String, sidebar: String): Impl = {
        val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], omitted = omitted.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        
        inline def setOmitted(value: String): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
        
        inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
        
        inline def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiSidebar.anon.PickImplfixedPartialPickI
      - typings.semanticUiSidebar.anon.PickImplomittedPartialPic
      - typings.semanticUiSidebar.anon.PickImplpusherPartialPick
      - typings.semanticUiSidebar.anon.PickImplsidebarPartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplfixedPartialPickI(fixed: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplfixedPartialPickI = {
        val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplfixedPartialPickI]
      }
      
      inline def PickImplomittedPartialPic(omitted: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplomittedPartialPic = {
        val __obj = js.Dynamic.literal(omitted = omitted.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplomittedPartialPic]
      }
      
      inline def PickImplpusherPartialPick(pusher: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplpusherPartialPick = {
        val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplpusherPartialPick]
      }
      
      inline def PickImplsidebarPartialPic(sidebar: String & js.UndefOr[String]): typings.semanticUiSidebar.anon.PickImplsidebarPartialPic = {
        val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiSidebar.anon.PickImplsidebarPartialPic]
      }
    }
  }
  type SelectorSettings = typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
}
