package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.Horizontal
import typings.reactNative.reactNativeStrings.Inverse
import typings.reactNative.reactNativeStrings.Large
import typings.reactNative.reactNativeStrings.LargeInverse
import typings.reactNative.reactNativeStrings.Normal
import typings.reactNative.reactNativeStrings.Small
import typings.reactNative.reactNativeStrings.SmallInverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarAndroidProps extends ViewProps {
  
  /**
    * Whether to show the ProgressBar (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of the progress bar.
    */
  var color: js.UndefOr[ColorValue] = js.native
  
  /**
    * If the progress bar will show indeterminate progress.
    * Note that this can only be false if styleAttr is Horizontal.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
  
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * Style of the ProgressBar. One of:
    Horizontal
    Normal (default)
    Small
    Large
    Inverse
    SmallInverse
    LargeInverse
    */
  var styleAttr: js.UndefOr[Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse] = js.native
}
object ProgressBarAndroidProps {
  
  @scala.inline
  def apply(): ProgressBarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarAndroidProps]
  }
  
  @scala.inline
  implicit class ProgressBarAndroidPropsOps[Self <: ProgressBarAndroidProps] (val x: Self) extends AnyVal {
    
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStyleAttr(value: Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse): Self = this.set("styleAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleAttr: Self = this.set("styleAttr", js.undefined)
  }
}
