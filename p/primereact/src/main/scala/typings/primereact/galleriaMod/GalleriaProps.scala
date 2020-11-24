package typings.primereact.galleriaMod

import typings.primereact.anon.IndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleriaProps extends js.Object {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var baseZIndex: js.UndefOr[Double] = js.native
  
  var caption: js.UndefOr[js.Any] = js.native
  
  var changeItemOnIndicatorHover: js.UndefOr[Boolean] = js.native
  
  var circular: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[js.Any] = js.native
  
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var indicator: js.UndefOr[js.Any] = js.native
  
  var indicatorsPosition: js.UndefOr[String] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  var numVisible: js.UndefOr[Double] = js.native
  
  var onItemChange: js.UndefOr[js.Function1[/* e */ IndexNumber, Unit]] = js.native
  
  var responsiveOptions: js.UndefOr[js.Any] = js.native
  
  var showIndicators: js.UndefOr[Boolean] = js.native
  
  var showIndicatorsOnItem: js.UndefOr[Boolean] = js.native
  
  var showItemNavigators: js.UndefOr[Boolean] = js.native
  
  var showItemNavigatorsOnHover: js.UndefOr[Boolean] = js.native
  
  var showThumbnailNavigators: js.UndefOr[Boolean] = js.native
  
  var showThumbnails: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var thumbnail: js.UndefOr[js.Any] = js.native
  
  var thumbnailsPosition: js.UndefOr[String] = js.native
  
  var transitionInterval: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object GalleriaProps {
  
  @scala.inline
  def apply(): GalleriaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GalleriaProps]
  }
  
  @scala.inline
  implicit class GalleriaPropsOps[Self <: GalleriaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    
    @scala.inline
    def setCaption(value: js.Any): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setChangeItemOnIndicatorHover(value: Boolean): Self = this.set("changeItemOnIndicatorHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeItemOnIndicatorHover: Self = this.set("changeItemOnIndicatorHover", js.undefined)
    
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndicator(value: js.Any): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setIndicatorsPosition(value: String): Self = this.set("indicatorsPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorsPosition: Self = this.set("indicatorsPosition", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setNumVisible(value: Double): Self = this.set("numVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumVisible: Self = this.set("numVisible", js.undefined)
    
    @scala.inline
    def setOnItemChange(value: /* e */ IndexNumber => Unit): Self = this.set("onItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemChange: Self = this.set("onItemChange", js.undefined)
    
    @scala.inline
    def setResponsiveOptions(value: js.Any): Self = this.set("responsiveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveOptions: Self = this.set("responsiveOptions", js.undefined)
    
    @scala.inline
    def setShowIndicators(value: Boolean): Self = this.set("showIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndicators: Self = this.set("showIndicators", js.undefined)
    
    @scala.inline
    def setShowIndicatorsOnItem(value: Boolean): Self = this.set("showIndicatorsOnItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndicatorsOnItem: Self = this.set("showIndicatorsOnItem", js.undefined)
    
    @scala.inline
    def setShowItemNavigators(value: Boolean): Self = this.set("showItemNavigators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowItemNavigators: Self = this.set("showItemNavigators", js.undefined)
    
    @scala.inline
    def setShowItemNavigatorsOnHover(value: Boolean): Self = this.set("showItemNavigatorsOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowItemNavigatorsOnHover: Self = this.set("showItemNavigatorsOnHover", js.undefined)
    
    @scala.inline
    def setShowThumbnailNavigators(value: Boolean): Self = this.set("showThumbnailNavigators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnailNavigators: Self = this.set("showThumbnailNavigators", js.undefined)
    
    @scala.inline
    def setShowThumbnails(value: Boolean): Self = this.set("showThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnails: Self = this.set("showThumbnails", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setThumbnail(value: js.Any): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setThumbnailsPosition(value: String): Self = this.set("thumbnailsPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailsPosition: Self = this.set("thumbnailsPosition", js.undefined)
    
    @scala.inline
    def setTransitionInterval(value: Double): Self = this.set("transitionInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionInterval: Self = this.set("transitionInterval", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
