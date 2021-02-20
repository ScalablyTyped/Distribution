package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedImigixAndSourceProps extends CommonProps {
  
  var attributeConfig: js.UndefOr[AttributeConfig] = js.native
  
  var disableLibraryParam: js.UndefOr[Boolean] = js.native
  
  var disableQualityByDPR: js.UndefOr[Boolean] = js.native
  
  var disableSrcSet: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var imgixParams: js.UndefOr[ImigixParams] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var src: String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SharedImigixAndSourceProps {
  
  @scala.inline
  def apply(src: String): SharedImigixAndSourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImigixAndSourceProps]
  }
  
  @scala.inline
  implicit class SharedImigixAndSourcePropsMutableBuilder[Self <: SharedImigixAndSourceProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeConfig(value: AttributeConfig): Self = StObject.set(x, "attributeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeConfigUndefined: Self = StObject.set(x, "attributeConfig", js.undefined)
    
    @scala.inline
    def setDisableLibraryParam(value: Boolean): Self = StObject.set(x, "disableLibraryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLibraryParamUndefined: Self = StObject.set(x, "disableLibraryParam", js.undefined)
    
    @scala.inline
    def setDisableQualityByDPR(value: Boolean): Self = StObject.set(x, "disableQualityByDPR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableQualityByDPRUndefined: Self = StObject.set(x, "disableQualityByDPR", js.undefined)
    
    @scala.inline
    def setDisableSrcSet(value: Boolean): Self = StObject.set(x, "disableSrcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSrcSetUndefined: Self = StObject.set(x, "disableSrcSet", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImgixParams(value: ImigixParams): Self = StObject.set(x, "imgixParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgixParamsUndefined: Self = StObject.set(x, "imgixParams", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
