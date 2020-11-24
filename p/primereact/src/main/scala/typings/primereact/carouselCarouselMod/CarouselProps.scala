package typings.primereact.carouselCarouselMod

import typings.primereact.anon.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps extends js.Object {
  
  var autoplayInterval: js.UndefOr[Double] = js.native
  
  var circular: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[js.Any] = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var indicatorsContentClassName: js.UndefOr[String] = js.native
  
  var itemTemplate: js.UndefOr[js.Any] = js.native
  
  var numScroll: js.UndefOr[Double] = js.native
  
  var numVisible: js.UndefOr[Double] = js.native
  
  var onPageChange: js.UndefOr[js.Function1[/* e */ Page, Unit]] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var responsiveOptions: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var verticalViewPortHeight: js.UndefOr[String] = js.native
}
object CarouselProps {
  
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    
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
    def setAutoplayInterval(value: Double): Self = this.set("autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayInterval: Self = this.set("autoplayInterval", js.undefined)
    
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndicatorsContentClassName(value: String): Self = this.set("indicatorsContentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorsContentClassName: Self = this.set("indicatorsContentClassName", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: js.Any): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setNumScroll(value: Double): Self = this.set("numScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumScroll: Self = this.set("numScroll", js.undefined)
    
    @scala.inline
    def setNumVisible(value: Double): Self = this.set("numVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumVisible: Self = this.set("numVisible", js.undefined)
    
    @scala.inline
    def setOnPageChange(value: /* e */ Page => Unit): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setResponsiveOptions(value: js.Any): Self = this.set("responsiveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveOptions: Self = this.set("responsiveOptions", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVerticalViewPortHeight(value: String): Self = this.set("verticalViewPortHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalViewPortHeight: Self = this.set("verticalViewPortHeight", js.undefined)
  }
}
