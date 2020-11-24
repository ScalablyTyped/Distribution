package typings.reactNativeViewPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typings.reactNativeViewPdf.reactNativeViewPdfStrings.url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewProps
  extends /* key */ StringDictionary[js.Any] {
  
  var fadeInDuration: js.UndefOr[Double] = js.native
  
  var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.native
  
  var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
  
  var resource: String = js.native
  
  var resourceType: js.UndefOr[url | base64 | file] = js.native
  
  var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.native
  
  var urlProps: js.UndefOr[URLProps] = js.native
}
object PDFViewProps {
  
  @scala.inline
  def apply(resource: String): PDFViewProps = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewProps]
  }
  
  @scala.inline
  implicit class PDFViewPropsOps[Self <: PDFViewProps] (val x: Self) extends AnyVal {
    
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeInDuration(value: Double): Self = this.set("fadeInDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeInDuration: Self = this.set("fadeInDuration", js.undefined)
    
    @scala.inline
    def setFileFrom(value: bundle | documentsDirectory): Self = this.set("fileFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileFrom: Self = this.set("fileFrom", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnPageChanged(value: (/* page */ Double, /* pageCount */ Double) => Unit): Self = this.set("onPageChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPageChanged: Self = this.set("onPageChanged", js.undefined)
    
    @scala.inline
    def setOnScrolled(value: /* offset */ Double => Unit): Self = this.set("onScrolled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrolled: Self = this.set("onScrolled", js.undefined)
    
    @scala.inline
    def setResourceType(value: url | base64 | file): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setTextEncoding(value: `utf-8` | `utf-16`): Self = this.set("textEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextEncoding: Self = this.set("textEncoding", js.undefined)
    
    @scala.inline
    def setUrlProps(value: URLProps): Self = this.set("urlProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlProps: Self = this.set("urlProps", js.undefined)
  }
}
