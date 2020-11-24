package typings.signale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaleConfig extends js.Object {
  
  /** Display the badge of the logger. */
  var displayBadge: js.UndefOr[Boolean] = js.native
  
  /** Display the current local date in `YYYY-MM-DD` format. */
  var displayDate: js.UndefOr[Boolean] = js.native
  
  /** Display the name of the file that the logger is reporting from. */
  var displayFilename: js.UndefOr[Boolean] = js.native
  
  /** Display the label of the logger. */
  var displayLabel: js.UndefOr[Boolean] = js.native
  
  /** Display the scope name of the logger. */
  var displayScope: js.UndefOr[Boolean] = js.native
  
  /** Display the current local time in `HH:MM:SS` format. */
  var displayTimestamp: js.UndefOr[Boolean] = js.native
  
  /** Underline the logger label. */
  var underlineLabel: js.UndefOr[Boolean] = js.native
  
  /** Underline the logger message. */
  var underlineMessage: js.UndefOr[Boolean] = js.native
  
  var underlinePrefix: js.UndefOr[Boolean] = js.native
  
  var underlineSuffix: js.UndefOr[Boolean] = js.native
  
  var uppercaseLabel: js.UndefOr[Boolean] = js.native
}
object SignaleConfig {
  
  @scala.inline
  def apply(): SignaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaleConfig]
  }
  
  @scala.inline
  implicit class SignaleConfigOps[Self <: SignaleConfig] (val x: Self) extends AnyVal {
    
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
    def setDisplayBadge(value: Boolean): Self = this.set("displayBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayBadge: Self = this.set("displayBadge", js.undefined)
    
    @scala.inline
    def setDisplayDate(value: Boolean): Self = this.set("displayDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDate: Self = this.set("displayDate", js.undefined)
    
    @scala.inline
    def setDisplayFilename(value: Boolean): Self = this.set("displayFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFilename: Self = this.set("displayFilename", js.undefined)
    
    @scala.inline
    def setDisplayLabel(value: Boolean): Self = this.set("displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabel: Self = this.set("displayLabel", js.undefined)
    
    @scala.inline
    def setDisplayScope(value: Boolean): Self = this.set("displayScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayScope: Self = this.set("displayScope", js.undefined)
    
    @scala.inline
    def setDisplayTimestamp(value: Boolean): Self = this.set("displayTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayTimestamp: Self = this.set("displayTimestamp", js.undefined)
    
    @scala.inline
    def setUnderlineLabel(value: Boolean): Self = this.set("underlineLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineLabel: Self = this.set("underlineLabel", js.undefined)
    
    @scala.inline
    def setUnderlineMessage(value: Boolean): Self = this.set("underlineMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineMessage: Self = this.set("underlineMessage", js.undefined)
    
    @scala.inline
    def setUnderlinePrefix(value: Boolean): Self = this.set("underlinePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlinePrefix: Self = this.set("underlinePrefix", js.undefined)
    
    @scala.inline
    def setUnderlineSuffix(value: Boolean): Self = this.set("underlineSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineSuffix: Self = this.set("underlineSuffix", js.undefined)
    
    @scala.inline
    def setUppercaseLabel(value: Boolean): Self = this.set("uppercaseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUppercaseLabel: Self = this.set("uppercaseLabel", js.undefined)
  }
}
