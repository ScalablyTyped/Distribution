package typings.simplemde.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutsArray
  extends /* action */ StringDictionary[js.UndefOr[String]] {
  
  var cleanBlock: js.UndefOr[String] = js.native
  
  var drawImage: js.UndefOr[String] = js.native
  
  var drawLink: js.UndefOr[String] = js.native
  
  var toggleBlockquote: js.UndefOr[String] = js.native
  
  var toggleBold: js.UndefOr[String] = js.native
  
  var toggleCodeBlock: js.UndefOr[String] = js.native
  
  var toggleFullScreen: js.UndefOr[String] = js.native
  
  var toggleHeadingBigger: js.UndefOr[String] = js.native
  
  var toggleHeadingSmaller: js.UndefOr[String] = js.native
  
  var toggleItalic: js.UndefOr[String] = js.native
  
  var toggleOrderedList: js.UndefOr[String] = js.native
  
  var togglePreview: js.UndefOr[String] = js.native
  
  var toggleSideBySide: js.UndefOr[String] = js.native
  
  var toggleUnorderedList: js.UndefOr[String] = js.native
}
object ShortcutsArray {
  
  @scala.inline
  def apply(): ShortcutsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutsArray]
  }
  
  @scala.inline
  implicit class ShortcutsArrayOps[Self <: ShortcutsArray] (val x: Self) extends AnyVal {
    
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
    def setCleanBlock(value: String): Self = this.set("cleanBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanBlock: Self = this.set("cleanBlock", js.undefined)
    
    @scala.inline
    def setDrawImage(value: String): Self = this.set("drawImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawImage: Self = this.set("drawImage", js.undefined)
    
    @scala.inline
    def setDrawLink(value: String): Self = this.set("drawLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawLink: Self = this.set("drawLink", js.undefined)
    
    @scala.inline
    def setToggleBlockquote(value: String): Self = this.set("toggleBlockquote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleBlockquote: Self = this.set("toggleBlockquote", js.undefined)
    
    @scala.inline
    def setToggleBold(value: String): Self = this.set("toggleBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleBold: Self = this.set("toggleBold", js.undefined)
    
    @scala.inline
    def setToggleCodeBlock(value: String): Self = this.set("toggleCodeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleCodeBlock: Self = this.set("toggleCodeBlock", js.undefined)
    
    @scala.inline
    def setToggleFullScreen(value: String): Self = this.set("toggleFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleFullScreen: Self = this.set("toggleFullScreen", js.undefined)
    
    @scala.inline
    def setToggleHeadingBigger(value: String): Self = this.set("toggleHeadingBigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleHeadingBigger: Self = this.set("toggleHeadingBigger", js.undefined)
    
    @scala.inline
    def setToggleHeadingSmaller(value: String): Self = this.set("toggleHeadingSmaller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleHeadingSmaller: Self = this.set("toggleHeadingSmaller", js.undefined)
    
    @scala.inline
    def setToggleItalic(value: String): Self = this.set("toggleItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleItalic: Self = this.set("toggleItalic", js.undefined)
    
    @scala.inline
    def setToggleOrderedList(value: String): Self = this.set("toggleOrderedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleOrderedList: Self = this.set("toggleOrderedList", js.undefined)
    
    @scala.inline
    def setTogglePreview(value: String): Self = this.set("togglePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglePreview: Self = this.set("togglePreview", js.undefined)
    
    @scala.inline
    def setToggleSideBySide(value: String): Self = this.set("toggleSideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleSideBySide: Self = this.set("toggleSideBySide", js.undefined)
    
    @scala.inline
    def setToggleUnorderedList(value: String): Self = this.set("toggleUnorderedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleUnorderedList: Self = this.set("toggleUnorderedList", js.undefined)
  }
}
