package typings.reactTagcloud

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagCloud_ {
  
  @js.native
  trait DefaultRendererFactory
    extends StObject
       with Instantiable0[RendererFunction]
       with Instantiable1[/* _ref */ DefaultRendererFactoryOptions, RendererFunction] {
    
    def apply(): RendererFunction = js.native
    def apply(_ref: DefaultRendererFactoryOptions): RendererFunction = js.native
  }
  
  trait DefaultRendererFactoryOptions extends StObject {
    
    var colorOptions: js.UndefOr[Any] = js.undefined
    
    var props: js.UndefOr[Any] = js.undefined
    
    var tagRenderer: js.UndefOr[js.Function] = js.undefined
  }
  object DefaultRendererFactoryOptions {
    
    inline def apply(): DefaultRendererFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRendererFactoryOptions]
    }
    
    extension [Self <: DefaultRendererFactoryOptions](x: Self) {
      
      inline def setColorOptions(value: Any): Self = StObject.set(x, "colorOptions", value.asInstanceOf[js.Any])
      
      inline def setColorOptionsUndefined: Self = StObject.set(x, "colorOptions", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setTagRenderer(value: js.Function): Self = StObject.set(x, "tagRenderer", value.asInstanceOf[js.Any])
      
      inline def setTagRendererUndefined: Self = StObject.set(x, "tagRenderer", js.undefined)
    }
  }
  
  type RendererFunction = js.Function4[/* tag */ Any, /* size */ Double, /* key */ String | Double, /* handlers */ Any, Any]
  
  type TagCloudClass = ComponentClass[TagCloudProps, ComponentState]
  
  trait TagCloudProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colorOptions: js.UndefOr[js.Object] = js.undefined
    
    var disableRandomColor: js.UndefOr[Boolean] = js.undefined
    
    var maxSize: Double
    
    var minSize: Double
    
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Unit]] = js.undefined
    
    var renderer: js.UndefOr[js.Function] = js.undefined
    
    var shuffle: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.Array[Any]
  }
  object TagCloudProps {
    
    inline def apply(maxSize: Double, minSize: Double, tags: js.Array[Any]): TagCloudProps = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCloudProps]
    }
    
    extension [Self <: TagCloudProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColorOptions(value: js.Object): Self = StObject.set(x, "colorOptions", value.asInstanceOf[js.Any])
      
      inline def setColorOptionsUndefined: Self = StObject.set(x, "colorOptions", js.undefined)
      
      inline def setDisableRandomColor(value: Boolean): Self = StObject.set(x, "disableRandomColor", value.asInstanceOf[js.Any])
      
      inline def setDisableRandomColorUndefined: Self = StObject.set(x, "disableRandomColor", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRef(value: LegacyRef[Unit]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Unit | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderer(value: js.Function): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      inline def setTags(value: js.Array[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Any*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
