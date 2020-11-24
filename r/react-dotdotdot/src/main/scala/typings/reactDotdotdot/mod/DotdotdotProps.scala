package typings.reactDotdotdot.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactDotdotdot.reactDotdotdotStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotdotdotProps
  extends AllHTMLAttributes[Dotdotdot]
     with ClassAttributes[Dotdotdot] {
  
  /** Animate clamp */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of lines that should be displayed, a css pixel value for height
    * as a string (i.e. "100px"), or "auto" to try and fill the available space
    */
  var clamp: String | Double | auto = js.native
  
  /** Split on sentences (periods), hypens, en-dashes, em-dashes, and words */
  var splitOnChars: js.UndefOr[js.Array[String]] = js.native
  
  /** The type of HTML tag which will wrap the component's content */
  var tagName: js.UndefOr[String] = js.native
  
  /**
    * The character to insert at the end of the HTML element after trunation is
    * performed.
    */
  var truncationChar: js.UndefOr[String] = js.native
  
  /** String of HTML to use instead of truncationChar */
  var truncationHTML: js.UndefOr[String] = js.native
  
  /** Use -webkit-line-clamp available in WebKit (Chrome, Safari) only */
  var useNativeClamp: js.UndefOr[Boolean] = js.native
}
object DotdotdotProps {
  
  @scala.inline
  def apply(clamp: String | Double | auto): DotdotdotProps = {
    val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotdotdotProps]
  }
  
  @scala.inline
  implicit class DotdotdotPropsOps[Self <: DotdotdotProps] (val x: Self) extends AnyVal {
    
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
    def setClamp(value: String | Double | auto): Self = this.set("clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setSplitOnCharsVarargs(value: String*): Self = this.set("splitOnChars", js.Array(value :_*))
    
    @scala.inline
    def setSplitOnChars(value: js.Array[String]): Self = this.set("splitOnChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitOnChars: Self = this.set("splitOnChars", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setTruncationChar(value: String): Self = this.set("truncationChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncationChar: Self = this.set("truncationChar", js.undefined)
    
    @scala.inline
    def setTruncationHTML(value: String): Self = this.set("truncationHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncationHTML: Self = this.set("truncationHTML", js.undefined)
    
    @scala.inline
    def setUseNativeClamp(value: Boolean): Self = this.set("useNativeClamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeClamp: Self = this.set("useNativeClamp", js.undefined)
  }
}
