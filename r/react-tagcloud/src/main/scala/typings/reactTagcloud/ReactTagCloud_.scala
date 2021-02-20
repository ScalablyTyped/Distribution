package typings.reactTagcloud

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagCloud_ {
  
  @js.native
  trait DefaultRendererFactory
    extends Instantiable0[RendererFunction]
       with Instantiable1[/* _ref */ DefaultRendererFactoryOptions, RendererFunction] {
    
    def apply(): RendererFunction = js.native
    def apply(_ref: DefaultRendererFactoryOptions): RendererFunction = js.native
  }
  
  @js.native
  trait DefaultRendererFactoryOptions extends StObject {
    
    var colorOptions: js.UndefOr[js.Any] = js.native
    
    var props: js.UndefOr[js.Any] = js.native
    
    var tagRenderer: js.UndefOr[js.Function] = js.native
  }
  object DefaultRendererFactoryOptions {
    
    @scala.inline
    def apply(): DefaultRendererFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRendererFactoryOptions]
    }
    
    @scala.inline
    implicit class DefaultRendererFactoryOptionsMutableBuilder[Self <: DefaultRendererFactoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorOptions(value: js.Any): Self = StObject.set(x, "colorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorOptionsUndefined: Self = StObject.set(x, "colorOptions", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setTagRenderer(value: js.Function): Self = StObject.set(x, "tagRenderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagRendererUndefined: Self = StObject.set(x, "tagRenderer", js.undefined)
    }
  }
  
  type RendererFunction = js.Function4[
    /* tag */ js.Any, 
    /* size */ Double, 
    /* key */ String | Double, 
    /* handlers */ js.Any, 
    js.Any
  ]
  
  type TagCloudClass = ComponentClass[TagCloudProps, ComponentState]
  
  @js.native
  trait TagCloudProps extends Props[Unit] {
    
    var className: js.UndefOr[String] = js.native
    
    var colorOptions: js.UndefOr[js.Object] = js.native
    
    var disableRandomColor: js.UndefOr[Boolean] = js.native
    
    var maxSize: Double = js.native
    
    var minSize: Double = js.native
    
    var onClick: js.UndefOr[js.Function] = js.native
    
    var renderer: js.UndefOr[js.Function] = js.native
    
    var shuffle: js.UndefOr[Boolean] = js.native
    
    var tags: js.Array[_] = js.native
  }
  object TagCloudProps {
    
    @scala.inline
    def apply(maxSize: Double, minSize: Double, tags: js.Array[_]): TagCloudProps = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagCloudProps]
    }
    
    @scala.inline
    implicit class TagCloudPropsMutableBuilder[Self <: TagCloudProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColorOptions(value: js.Object): Self = StObject.set(x, "colorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorOptionsUndefined: Self = StObject.set(x, "colorOptions", js.undefined)
      
      @scala.inline
      def setDisableRandomColor(value: Boolean): Self = StObject.set(x, "disableRandomColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRandomColorUndefined: Self = StObject.set(x, "disableRandomColor", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRenderer(value: js.Function): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[_]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: js.Any*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
