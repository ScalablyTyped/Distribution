package typings.reactMdList

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListItemAddonMod {
  
  @JSImport("@react-md/list/types/ListItemAddon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ListItemAddon(param0: ListItemAddonProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAddon")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdList.reactMdListStrings.top
    - typings.reactMdList.reactMdListStrings.middle
    - typings.reactMdList.reactMdListStrings.bottom
  */
  trait ListItemAddonPosition extends StObject
  object ListItemAddonPosition {
    
    inline def bottom: typings.reactMdList.reactMdListStrings.bottom = "bottom".asInstanceOf[typings.reactMdList.reactMdListStrings.bottom]
    
    inline def middle: typings.reactMdList.reactMdListStrings.middle = "middle".asInstanceOf[typings.reactMdList.reactMdListStrings.middle]
    
    inline def top: typings.reactMdList.reactMdListStrings.top = "top".asInstanceOf[typings.reactMdList.reactMdListStrings.top]
  }
  
  /* Inlined parent std.Omit<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter' | 'forceIconWrap'> */
  trait ListItemAddonProps extends StObject {
    
    var aboveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The addon that should be rendered.
      */
    var addon: ReactNode | ReactElement
    
    /**
      * Boolean if the addon should appear after the `children`.
      */
    var addonAfter: js.UndefOr[Boolean] = js.undefined
    
    var afterClassName: js.UndefOr[String] = js.undefined
    
    var beforeClassName: js.UndefOr[String] = js.undefined
    
    var belowClassName: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var flexReverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the addon should be forced into a `<span>` with the class names
      * applied instead of attempting to clone into the provided icon. If the
      * `type` is set to `"media"` or `"large-media"`, this will default to `true`.
      */
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The vertical position to use for the addon.
      */
    var position: js.UndefOr[ListItemAddonPosition] = js.undefined
    
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The addon type that is used to adjust the spacing styles.
      */
    var `type`: js.UndefOr[ListItemAddonType] = js.undefined
  }
  object ListItemAddonProps {
    
    inline def apply(): ListItemAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAddonProps]
    }
    
    extension [Self <: ListItemAddonProps](x: Self) {
      
      inline def setAboveClassName(value: String): Self = StObject.set(x, "aboveClassName", value.asInstanceOf[js.Any])
      
      inline def setAboveClassNameUndefined: Self = StObject.set(x, "aboveClassName", js.undefined)
      
      inline def setAddon(value: ReactNode | ReactElement): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      inline def setAddonAfter(value: Boolean): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      inline def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      inline def setAfterClassName(value: String): Self = StObject.set(x, "afterClassName", value.asInstanceOf[js.Any])
      
      inline def setAfterClassNameUndefined: Self = StObject.set(x, "afterClassName", js.undefined)
      
      inline def setBeforeClassName(value: String): Self = StObject.set(x, "beforeClassName", value.asInstanceOf[js.Any])
      
      inline def setBeforeClassNameUndefined: Self = StObject.set(x, "beforeClassName", js.undefined)
      
      inline def setBelowClassName(value: String): Self = StObject.set(x, "belowClassName", value.asInstanceOf[js.Any])
      
      inline def setBelowClassNameUndefined: Self = StObject.set(x, "belowClassName", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFlexReverse(value: Boolean): Self = StObject.set(x, "flexReverse", value.asInstanceOf[js.Any])
      
      inline def setFlexReverseUndefined: Self = StObject.set(x, "flexReverse", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setPosition(value: ListItemAddonPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setType(value: ListItemAddonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdList.reactMdListStrings.icon
    - typings.reactMdList.reactMdListStrings.avatar
    - typings.reactMdList.reactMdListStrings.media
    - typings.reactMdList.reactMdListStrings.`large-media`
  */
  trait ListItemAddonType extends StObject
  object ListItemAddonType {
    
    inline def avatar: typings.reactMdList.reactMdListStrings.avatar = "avatar".asInstanceOf[typings.reactMdList.reactMdListStrings.avatar]
    
    inline def icon: typings.reactMdList.reactMdListStrings.icon = "icon".asInstanceOf[typings.reactMdList.reactMdListStrings.icon]
    
    inline def `large-media`: typings.reactMdList.reactMdListStrings.`large-media` = "large-media".asInstanceOf[typings.reactMdList.reactMdListStrings.`large-media`]
    
    inline def media: typings.reactMdList.reactMdListStrings.media = "media".asInstanceOf[typings.reactMdList.reactMdListStrings.media]
  }
}
