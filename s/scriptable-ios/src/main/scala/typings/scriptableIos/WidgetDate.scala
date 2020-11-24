package typings.scriptableIos

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Date element shown in a widget._
  * @see https://docs.scriptable.app/widgetdate
  */
@js.native
trait WidgetDate extends js.Object {
  
  /**
    * _Display entire date._
    *
    * Example output: June 3, 2019
    *
    * This is the default.
    * @see https://docs.scriptable.app/widgetdate/#-applydatestyle
    */
  def applyDateStyle(): Unit = js.native
  
  /**
    * _Display date as offset from now._
    *
    * Example output: +2 hours -3 months
    * @see https://docs.scriptable.app/widgetdate/#-applyoffsetstyle
    */
  def applyOffsetStyle(): Unit = js.native
  
  /**
    * _Display date as relative to now._
    *
    * Example output: 2 hours, 23 minutes 1 year, 1 month
    * @see https://docs.scriptable.app/widgetdate/#-applyrelativestyle
    */
  def applyRelativeStyle(): Unit = js.native
  
  /**
    * _Display time component of the date._
    *
    * Example output: 11:23PM
    * @see https://docs.scriptable.app/widgetdate/#-applytimestyle
    */
  def applyTimeStyle(): Unit = js.native
  
  /**
    * _Display date as timer counting from now._
    *
    * Example output: 2:32 36:59:01
    * @see https://docs.scriptable.app/widgetdate/#-applytimerstyle
    */
  def applyTimerStyle(): Unit = js.native
  
  /**
    * _Center aligns the text._
    *
    * Specifies that text should be center aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text in the center of a horizontal stack, you should place a spacer both
    * before and after the text.
    * @see https://docs.scriptable.app/widgetdate/#-centeraligntext
    */
  def centerAlignText(): Unit = js.native
  
  /**
    * _Date to show in a widget._
    * @see https://docs.scriptable.app/widgetdate/#date
    */
  var date: Date = js.native
  
  /**
    * _Font and text size of the text._
    * @see https://docs.scriptable.app/widgetdate/#font
    */
  var font: Font = js.native
  
  /**
    * _Left aligns the text._
    *
    * Specifies that text should be left aligned. This is the default.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to left in a horizontal stack, you should place a spacer
    * after the text.
    * @see https://docs.scriptable.app/widgetdate/#-leftaligntext
    */
  def leftAlignText(): Unit = js.native
  
  /**
    * _Maximum number of lines._
    *
    * Maximum number of lines to display. The limit is disabled when the value is 0 or less. Defaults to 0.
    * @see https://docs.scriptable.app/widgetdate/#linelimit
    */
  var lineLimit: Double = js.native
  
  /**
    * _Minimum amount the text scales down to._
    *
    * Sets the minimum amount that text scales down to fit in the available space. For example, a text with a minimum scale factor of 0.5 allows the widget to draw the text in a font
    * size half the size of the actual font. The scale factor should be a fraction between 0 and 1, both inclusive. Defaults to 1.
    * @see https://docs.scriptable.app/widgetdate/#minimumscalefactor
    */
  var minimumScaleFactor: Double = js.native
  
  /**
    * _Right aligns the text._
    *
    * Specifies that text should be right aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to the right in a horizontal stack, you should place a spacer
    * before the text.
    * @see https://docs.scriptable.app/widgetdate/#-rightaligntext
    */
  def rightAlignText(): Unit = js.native
  
  /**
    * _Color of the shadow._
    *
    * Sets the color of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to black.
    * @see https://docs.scriptable.app/widgetdate/#shadowcolor
    */
  var shadowColor: Color = js.native
  
  /**
    * _Offset of the shadow._
    *
    * Sets the offset of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to (0, 0).
    * @see https://docs.scriptable.app/widgetdate/#shadowoffset
    */
  var shadowOffset: Point = js.native
  
  /**
    * _Size of the shadow._
    *
    * Sets the size of the shadow cast by the text. Defaults to 0.
    * @see https://docs.scriptable.app/widgetdate/#shadowradius
    */
  var shadowRadius: Double = js.native
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/widgetdate/#textcolor
    */
  var textColor: Color = js.native
  
  /**
    * _Opacity of the text._
    *
    * Opacity of the text. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgetdate/#textopacity
    */
  var textOpacity: Double = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the text is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * property on the widget.
    * @see https://docs.scriptable.app/widgetdate/#url
    */
  var url: String = js.native
}
object WidgetDate {
  
  @scala.inline
  def apply(
    applyDateStyle: () => Unit,
    applyOffsetStyle: () => Unit,
    applyRelativeStyle: () => Unit,
    applyTimeStyle: () => Unit,
    applyTimerStyle: () => Unit,
    centerAlignText: () => Unit,
    date: Date,
    font: Font,
    leftAlignText: () => Unit,
    lineLimit: Double,
    minimumScaleFactor: Double,
    rightAlignText: () => Unit,
    shadowColor: Color,
    shadowOffset: Point,
    shadowRadius: Double,
    textColor: Color,
    textOpacity: Double,
    url: String
  ): WidgetDate = {
    val __obj = js.Dynamic.literal(applyDateStyle = js.Any.fromFunction0(applyDateStyle), applyOffsetStyle = js.Any.fromFunction0(applyOffsetStyle), applyRelativeStyle = js.Any.fromFunction0(applyRelativeStyle), applyTimeStyle = js.Any.fromFunction0(applyTimeStyle), applyTimerStyle = js.Any.fromFunction0(applyTimerStyle), centerAlignText = js.Any.fromFunction0(centerAlignText), date = date.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], leftAlignText = js.Any.fromFunction0(leftAlignText), lineLimit = lineLimit.asInstanceOf[js.Any], minimumScaleFactor = minimumScaleFactor.asInstanceOf[js.Any], rightAlignText = js.Any.fromFunction0(rightAlignText), shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOpacity = textOpacity.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetDate]
  }
  
  @scala.inline
  implicit class WidgetDateOps[Self <: WidgetDate] (val x: Self) extends AnyVal {
    
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
    def setApplyDateStyle(value: () => Unit): Self = this.set("applyDateStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyOffsetStyle(value: () => Unit): Self = this.set("applyOffsetStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyRelativeStyle(value: () => Unit): Self = this.set("applyRelativeStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyTimeStyle(value: () => Unit): Self = this.set("applyTimeStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyTimerStyle(value: () => Unit): Self = this.set("applyTimerStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterAlignText(value: () => Unit): Self = this.set("centerAlignText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAlignText(value: () => Unit): Self = this.set("leftAlignText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineLimit(value: Double): Self = this.set("lineLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumScaleFactor(value: Double): Self = this.set("minimumScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAlignText(value: () => Unit): Self = this.set("rightAlignText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Point): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOpacity(value: Double): Self = this.set("textOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
