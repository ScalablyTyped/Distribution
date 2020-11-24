package typings.readmoreJs.mod

import typings.readmoreJs.readmoreJsStrings.after
import typings.readmoreJs.readmoreJsStrings.before
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
   // called once per block during initilization after Readmore.js has processed the block
  var afterToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.native
  
  var beforeToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.native
  
   // insert required CSS dynamically, set this to false if you include the necessary CSS in a stylesheet
  var blockCSS: js.UndefOr[String] = js.native
  
   // called after a more or less link is clicked, but before the block is collapsed or expanded
  var blockProcessed: js.UndefOr[js.Function2[/* element */ Element, /* collapsable */ Boolean, Unit]] = js.native
  
   // 100 in milliseconds
  var collapsedHeight: js.UndefOr[Double] = js.native
  
   // HTML string for the "less" toggle link; also accepts a callback function that returns an HTML string
  var embedCSS: js.UndefOr[Boolean] = js.native
  
   // 200 in pixels
  var heightMargin: js.UndefOr[Double] = js.native
  
   // HTML string for the "more" toggle link; also accepts a callback function that returns an HTML string
  var lessLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
  
   // 16 in pixels, avoids collapsing blocks that are only slightly larger than collapsedHeight
  var moreLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.native
  
  var sourceOrder: js.UndefOr[after | before] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
   // sets the styling of the blocks, ignored if embedCSS is false
  var startOpen: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAfterToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = this.set("afterToggle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterToggle: Self = this.set("afterToggle", js.undefined)
    
    @scala.inline
    def setBeforeToggle(value: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Unit): Self = this.set("beforeToggle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeToggle: Self = this.set("beforeToggle", js.undefined)
    
    @scala.inline
    def setBlockCSS(value: String): Self = this.set("blockCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockCSS: Self = this.set("blockCSS", js.undefined)
    
    @scala.inline
    def setBlockProcessed(value: (/* element */ Element, /* collapsable */ Boolean) => Unit): Self = this.set("blockProcessed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBlockProcessed: Self = this.set("blockProcessed", js.undefined)
    
    @scala.inline
    def setCollapsedHeight(value: Double): Self = this.set("collapsedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedHeight: Self = this.set("collapsedHeight", js.undefined)
    
    @scala.inline
    def setEmbedCSS(value: Boolean): Self = this.set("embedCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedCSS: Self = this.set("embedCSS", js.undefined)
    
    @scala.inline
    def setHeightMargin(value: Double): Self = this.set("heightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMargin: Self = this.set("heightMargin", js.undefined)
    
    @scala.inline
    def setLessLinkFunction1(value: /* element */ Element => String): Self = this.set("lessLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLessLink(value: (js.Function1[/* element */ Element, String]) | String): Self = this.set("lessLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessLink: Self = this.set("lessLink", js.undefined)
    
    @scala.inline
    def setMoreLinkFunction1(value: /* element */ Element => String): Self = this.set("moreLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreLink(value: (js.Function1[/* element */ Element, String]) | String): Self = this.set("moreLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreLink: Self = this.set("moreLink", js.undefined)
    
    @scala.inline
    def setSourceOrder(value: after | before): Self = this.set("sourceOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceOrder: Self = this.set("sourceOrder", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setStartOpen(value: Boolean): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
  }
}
