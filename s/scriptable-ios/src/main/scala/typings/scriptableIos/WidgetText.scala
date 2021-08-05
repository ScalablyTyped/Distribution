package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Text element shown in a widget._
  * @see https://docs.scriptable.app/widgettext
  */
trait WidgetText extends StObject {
  
  /**
    * _Center aligns the text._
    *
    * Specifies that text should be center aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text in the center of a horizontal stack, you should place a spacer both
    * before and after the text.
    * @see https://docs.scriptable.app/widgettext/#-centeraligntext
    */
  def centerAlignText(): Unit
  
  /**
    * _Font and text size of the text._
    * @see https://docs.scriptable.app/widgettext/#font
    */
  var font: Font
  
  /**
    * _Left aligns the text._
    *
    * Specifies that text should be left aligned. This is the default.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to left in a horizontal stack, you should place a spacer
    * after the text.
    * @see https://docs.scriptable.app/widgettext/#-leftaligntext
    */
  def leftAlignText(): Unit
  
  /**
    * _Maximum number of lines._
    *
    * Maximum number of lines to display. The limit is disabled when the value is 0 or less. Defaults to 0.
    * @see https://docs.scriptable.app/widgettext/#linelimit
    */
  var lineLimit: Double
  
  /**
    * _Minimum amount the text scales down to._
    *
    * Sets the minimum amount that text scales down to fit in the available space. For example, a text with a minimum scale factor of 0.5 allows the widget to draw the text in a font
    * size half the size of the actual font. The scale factor should be a fraction between 0 and 1, both inclusive. Defaults to 1.
    * @see https://docs.scriptable.app/widgettext/#minimumscalefactor
    */
  var minimumScaleFactor: Double
  
  /**
    * _Right aligns the text._
    *
    * Specifies that text should be right aligned.
    *
    * This does not affect texts placed in stacks. Use spacers instead when aligning text in stacks. To align the text to the right in a horizontal stack, you should place a spacer
    * before the text.
    * @see https://docs.scriptable.app/widgettext/#-rightaligntext
    */
  def rightAlignText(): Unit
  
  /**
    * _Color of the shadow._
    *
    * Sets the color of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to black.
    * @see https://docs.scriptable.app/widgettext/#shadowcolor
    */
  var shadowColor: Color
  
  /**
    * _Offset of the shadow._
    *
    * Sets the offset of the shadow cast by the text. The `shadowRadius` property must have a value greater than zero for this property to have an effect. Defaults to (0, 0).
    * @see https://docs.scriptable.app/widgettext/#shadowoffset
    */
  var shadowOffset: Point
  
  /**
    * _Size of the shadow._
    *
    * Sets the size of the shadow cast by the text. Defaults to 0.
    * @see https://docs.scriptable.app/widgettext/#shadowradius
    */
  var shadowRadius: Double
  
  /**
    * _Text to show in a widget._
    * @see https://docs.scriptable.app/widgettext/#text
    */
  var text: String
  
  /**
    * _Color of the text._
    * @see https://docs.scriptable.app/widgettext/#textcolor
    */
  var textColor: Color
  
  /**
    * _Opacity of the text._
    *
    * Opacity of the text. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgettext/#textopacity
    */
  var textOpacity: Double
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the text is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * property on the widget.
    * @see https://docs.scriptable.app/widgettext/#url
    */
  var url: String
}
object WidgetText {
  
  inline def apply(
    centerAlignText: () => Unit,
    font: Font,
    leftAlignText: () => Unit,
    lineLimit: Double,
    minimumScaleFactor: Double,
    rightAlignText: () => Unit,
    shadowColor: Color,
    shadowOffset: Point,
    shadowRadius: Double,
    text: String,
    textColor: Color,
    textOpacity: Double,
    url: String
  ): WidgetText = {
    val __obj = js.Dynamic.literal(centerAlignText = js.Any.fromFunction0(centerAlignText), font = font.asInstanceOf[js.Any], leftAlignText = js.Any.fromFunction0(leftAlignText), lineLimit = lineLimit.asInstanceOf[js.Any], minimumScaleFactor = minimumScaleFactor.asInstanceOf[js.Any], rightAlignText = js.Any.fromFunction0(rightAlignText), shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOpacity = textOpacity.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetText]
  }
  
  extension [Self <: WidgetText](x: Self) {
    
    inline def setCenterAlignText(value: () => Unit): Self = StObject.set(x, "centerAlignText", js.Any.fromFunction0(value))
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setLeftAlignText(value: () => Unit): Self = StObject.set(x, "leftAlignText", js.Any.fromFunction0(value))
    
    inline def setLineLimit(value: Double): Self = StObject.set(x, "lineLimit", value.asInstanceOf[js.Any])
    
    inline def setMinimumScaleFactor(value: Double): Self = StObject.set(x, "minimumScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setRightAlignText(value: () => Unit): Self = StObject.set(x, "rightAlignText", js.Any.fromFunction0(value))
    
    inline def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: Point): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextOpacity(value: Double): Self = StObject.set(x, "textOpacity", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
